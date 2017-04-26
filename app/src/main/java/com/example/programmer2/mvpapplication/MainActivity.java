package com.example.programmer2.mvpapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.programmer2.mvpapplication.dagger2.DaggerMotorComponent;
import com.example.programmer2.mvpapplication.dagger2.Motor;
import com.example.programmer2.mvpapplication.dagger2.MotorComponent;
import com.example.programmer2.mvpapplication.dagger2.MotorModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MainPresenter.View {

    private static final String TAG = "TAG";
    private MainPresenter mainPresenter;
    private EditText editText;
    private TextView textView;

    @Inject
    Motor motor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.button)).setOnClickListener(this);
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);

        PresenterComponet component = DaggerPresenterComponet.builder().myModule(new MyModule()).build();
        mainPresenter = component.providePresent();
        mainPresenter.setView(this);


        MotorComponent motorComponent = DaggerMotorComponent.builder().motorModule(new MotorModule(
                "X518", 50, "Frasoo"
        )).build();
        motorComponent.inject(this);

        if (motor != null) {
            Log.e(TAG, "car is created");
        }
        if (motor.startEngin()) {
            Log.e(TAG, "it is started");
            Log.e(TAG, "motor name is:" + motor.getName());
        } else {
            Log.e(TAG, "motor is not provided");
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button: {
                double r = Double.parseDouble(editText.getText().toString());
                mainPresenter.action(r);
            }
        }
    }

    @Override
    public void setTextView(double area) {
        textView.setText(String.format("Circle Area is = %.2f", area));
    }
}
