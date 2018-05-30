package com.example.lynn.gradient;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;

import static com.example.lynn.gradient.MainActivity.*;

/**
 * Created by lynn on 5/30/2018.
 */

public class MyView extends LinearLayout {

    public MyView(Context context) {
        super(context);

        button = new Button(context);

        button.setText("Press Me");

        button.setOnClickListener(listener);

        addView(button);
    }

}
