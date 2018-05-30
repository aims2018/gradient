package com.example.lynn.gradient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static Button button;
    public static MyListener listener;
    public static MyView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listener = new MyListener();

        setContentView(myView = new MyView(this));
    }
}
