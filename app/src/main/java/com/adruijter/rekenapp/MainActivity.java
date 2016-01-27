package com.adruijter.rekenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    // Fields
    private int numberLeft = 5;
    private int numberRight = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textLeft = (TextView) findViewById(R.id.txtNumberLeft);
        textLeft.setText(Integer.toString(this.numberLeft));
        TextView textRight = (TextView) findViewById(R.id.txtNumberRight);
        textRight.setText(Integer.toString(this.numberRight));

    }

    public void doMinusOneLeft(View view)
    {
        this.numberLeft -= 1;
        TextView txt = (TextView) findViewById(R.id.txtNumberLeft);
        txt.setText(Integer.toString(this.numberLeft));
    }

    public void doPlusOneLeft(View view)
    {
        this.numberLeft += 1;
        TextView txt = (TextView) findViewById(R.id.txtNumberLeft);
        txt.setText(Integer.toString(this.numberLeft));
    }

    public void doMinusOneRight(View view)
    {
        this.numberRight -= 1;
        TextView txt = (TextView) findViewById(R.id.txtNumberRight);
        txt.setText(Integer.toString(this.numberRight));
    }

    public void doPlusOneRight(View view)
    {
        this.numberRight += 1;
        TextView txt = (TextView) findViewById(R.id.txtNumberRight);
        txt.setText(Integer.toString(this.numberRight));
    }

    public void sum(View view)
    {
        int result = numberLeft + numberRight;
        TextView txt = (TextView) findViewById(R.id.txtSum);
        txt.setText(Integer.toString(result));
    }


}
