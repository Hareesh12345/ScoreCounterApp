package com.example.hareesha.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
     int value = 0;
    int value2 = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(value);
        displayb(value2);


    }
    public void display(int num)
    {
        TextView points = (TextView)findViewById(R.id.score);
        points.setText(String.valueOf(num));


    }

    public void displayb(int num)
    {
        TextView points = (TextView)findViewById(R.id.scoreB);
        points.setText(String.valueOf(num));


    }



    public void points2(View view)
    {
        value += 2;
display(value);

    }
    public void points3(View view)
    {        value += 3;
        display(value);
    }
    public void points1(View view)
    {        value += 1;
        display(value);

    }







    public void points2b(View view)
    {
        value2 += 2;
        displayb(value2);

    }
    public void points3b(View view)
    {        value2 += 3;
        displayb(value2);
    }
    public void points1b(View view)
    {        value2 += 1;
        displayb(value2);

    }


    public void reset(View view)
    {
        value = 0;
        value2 = 0;
        display(value);
        displayb(value2);

    }




}
