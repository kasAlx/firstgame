package com.example.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ProgressBar health;
    Button plus;
    Button minus;
    TextView TextMoney;
    int x;
    int money = 150;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        plus = (Button) findViewById(R.id.BtnPlus);
        minus = (Button) findViewById(R.id.BtnMinus);
        health = (ProgressBar) findViewById(R.id.health);
        TextMoney = (TextView)  findViewById(R.id.TextViewMoney);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);

        String str = Integer.toString(money);

        TextMoney.setText(str);
    }

    public void onClick(View v) {
        // по id определеяем кнопку, вызвавшую этот обработчик
        switch (v.getId()) {
            case R.id.BtnPlus:
                x = health.getProgress();
                x = x+15;
                health.setProgress(x);
                break;
            case R.id.BtnMinus:
                x = health.getProgress();
                health.setProgress(x - 5);
                break;
        }
    }
}

