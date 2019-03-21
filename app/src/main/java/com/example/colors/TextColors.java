package com.example.colors;

import android.app.Service;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;


public class TextColors extends ConstraintLayout {
    MainActivity mainActivity;
    EditText red;
    EditText green;
    EditText blue;

    public TextColors(Context context) {
        super(context);
        init(context);
    }


    public TextColors(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public TextColors(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public void init(Context context) {
        mainActivity = (MainActivity) context;

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.text_color_values, this);

        red = findViewById(R.id.r);
        green = findViewById(R.id.g);
        blue = findViewById(R.id.b);

        red.addTextChangedListener(new ColorTextWatcher(mainActivity));
        green.addTextChangedListener(new ColorTextWatcher(mainActivity));
        blue.addTextChangedListener(new ColorTextWatcher(mainActivity));
    }

    public int getRed() {
        return Integer.valueOf(red.getText().toString());
    }

    public int getGreen() {
        return Integer.valueOf(green.getText().toString());
    }

    public int getBlue() {
        return Integer.valueOf(blue.getText().toString());
    }
}
