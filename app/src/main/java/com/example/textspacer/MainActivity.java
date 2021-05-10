package com.example.textspacer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //private final TextView[] textViews = new TextView[15];
    TextView txt0;
    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    TextView txt5;
    TextView txt6;
    TextView txt7;
    TextView txt8;
    TextView txt9;
    TextView txt10;
    TextView txt11;
    TextView txt12;
    TextView txt13;
    TextView txt14;
    String str = "InvisibleHumans";
    String[] spacing = str.split("");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        int temp;
        String str = "InvisibleEngine";
        String[] id=str.split("");

        for(int i = 0; i< id.length; i++){
            temp = getResources().getIdentifier(id[i], "id",getPackageName());
            textViews[i] = (TextView)findViewById(temp);
            textViews[i].setText(temp);
        }
        */
        txt0 = findViewById(R.id.t0);
        txt1 = findViewById(R.id.t1);
        txt2 = findViewById(R.id.t2);
        txt3 = findViewById(R.id.t3);
        txt4 = findViewById(R.id.t4);
        txt5 = findViewById(R.id.t5);
        txt6 = findViewById(R.id.t6);
        txt7 = findViewById(R.id.t7);
        txt8 = findViewById(R.id.t8);
        txt9 = findViewById(R.id.t9);
        txt10 = findViewById(R.id.t10);
        txt11 = findViewById(R.id.t11);
        txt12 = findViewById(R.id.t12);
        txt13 = findViewById(R.id.t13);
        txt14 = findViewById(R.id.t14);
        spacer();
    }

    public void spacer() {
        txt0.setText(spacing[1]);
        txt1.setText(spacing[2]);
        txt2.setText(spacing[3]);
        txt3.setText(spacing[4]);
        txt4.setText(spacing[5]);
        txt5.setText(spacing[6]);
        txt6.setText(spacing[7]);
        txt7.setText(spacing[8]);
        txt8.setText(spacing[9]);
        txt9.setText(spacing[10]);
        txt10.setText(spacing[11]);
        txt11.setText(spacing[12]);
        txt12.setText(spacing[13]);
        txt13.setText(spacing[14]);
        txt14.setText(spacing[15]);
    }
}