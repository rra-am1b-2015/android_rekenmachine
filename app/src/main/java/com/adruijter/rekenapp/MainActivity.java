package com.adruijter.rekenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updateNumber(View view)
    {
        int number = 42;
        TextView txtNumber = (TextView)findViewById(R.id.txtNumber);
        txtNumber.setText(Integer.toString(number));
        txtNumber.setTextSize(250);
    }
}
