package com.example.lynn.gradient;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

import static com.example.lynn.gradient.MainActivity.*;

/**
 * Created by lynn on 5/30/2018.
 */

public class MyListener implements View.OnClickListener {

    public int color() {
        int red = (int)(255*Math.random());
        int green = (int)(255*Math.random());
        int blue = (int)(255*Math.random());

        return(Color.argb(255,red,green,blue));
    }

    @Override
    public void onClick(View v) {
        if (v == button) {

            int[] colors = {color(),color()};

            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM,colors);

            myView.setBackground(gradientDrawable);
        }
    }

}
