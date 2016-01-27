package com.adruijter.rekenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    // Fields
    private int number = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doMinusOne(View view)
    {
        this.number -= 1;
        TextView txt = (TextView) findViewById(R.id.txtNumber);
        txt.setText(Integer.toString(this.number));
    }

    public void doPlusOne(View view)
    {
        this.number += 1;
        TextView txt = (TextView) findViewById(R.id.txtNumber);
        txt.setText(Integer.toString(this.number));
    }


}
