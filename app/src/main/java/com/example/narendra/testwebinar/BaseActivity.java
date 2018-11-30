package com.example.narendra.testwebinar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.narendra.testwebinar.FontTypes;

public class BaseActivity extends AppCompatActivity{

    FontTypes fontTypes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fontTypes = new FontTypes(getApplicationContext());
    }

    public void setFontType(int... viewId) {
        FontTypes fontType = new FontTypes(getApplicationContext());
        for (int element : viewId) {
            if (findViewById(element) instanceof TextView) {
                TextView textview = (TextView) findViewById(element);
                fontType.setTypeface(textview);
            }
        }
    }
}
