package com.example.colors;

import android.text.Editable;
import android.text.TextWatcher;


public class ColorTextWatcher implements TextWatcher {
    MainActivity mainActivity;

    public ColorTextWatcher(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }


    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

        try{
            int value = Integer.valueOf(s.toString());
            if(value < 0){
                s.clear();
                s.append("0");
            } else if (value > 255){
                s.clear();
                s.append("255");
            }
        } catch (NumberFormatException nfe){
            s.clear();
            s.append("0");
        }
        mainActivity.pushColors();
    }
}
