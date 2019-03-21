package com.example.colors;

import android.app.Service;
import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

public class Colors extends ConstraintLayout {

    FrameLayout red;
    FrameLayout green;
    FrameLayout blue;

    public Colors(Context context) {
        super(context);
        init();
    }

    public Colors(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Colors(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init() {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.color_values, this);

        red = findViewById(R.id.redFrame);
        green = findViewById(R.id.greenFrame);
        blue = findViewById(R.id.blueFrame);

    }

    public void setColors(int r, int g, int b) {
        this.red.setBackgroundColor(Color.rgb(r, 0, 0));
        this.green.setBackgroundColor(Color.rgb(0, g, 0));
        this.blue.setBackgroundColor(Color.rgb(0, 0, b));
    }
}
