package com.example.lotte.simplemultiplier;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SimpleMultiplier extends AppCompatActivity {

    public int number = 0;
    public int result_nbr = 0;

    public void decrement(View view){
        number = number - 1;

        TextView displaydecrement = (TextView) findViewById(R.id.show_number);
        displaydecrement.setText(" " + number);

    }
    public void increment(View view){
        number = number + 1;

        TextView displayincrement = (TextView) findViewById(R.id.show_number);
        displayincrement.setText(" " + number);
    }

    public void calculate(View view){
        result_nbr = number * 3;
        TextView myTextViewcal = (TextView) findViewById(R.id.show_result);
        myTextViewcal.setText(" " + result_nbr);
 }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_multiplier);
    }
}