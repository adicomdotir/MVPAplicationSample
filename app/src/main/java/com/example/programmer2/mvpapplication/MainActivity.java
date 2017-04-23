package com.example.programmer2.mvpapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MainPresenter.View {

    private MainPresenter mainPresenter;
    private EditText editText;
    private TextView textView;

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
