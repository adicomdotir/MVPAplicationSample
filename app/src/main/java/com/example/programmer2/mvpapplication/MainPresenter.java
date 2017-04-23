package com.example.programmer2.mvpapplication;

import javax.inject.Inject;

/**
 * Created by Yashar.P on 4/22/2017.
 */

public class MainPresenter {
    private Circle circle;
    private View view;

    @Inject
    public MainPresenter(Circle circle) {
        this.circle = circle;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void action(double radius) {
        double area = circle.getArea(radius);
        view.setTextView(area);
    }

    public interface View {
        void setTextView(double area);
    }
}