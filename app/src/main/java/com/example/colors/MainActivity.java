package com.example.colors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextColors textColors;
    Colors colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = findViewById(R.id.frameColors);
        textColors = findViewById(R.id.textColors);



    }
    public void pushColors() {
        colors.setColors(textColors.getRed(), textColors.getGreen(), textColors.getBlue());
    }

}
