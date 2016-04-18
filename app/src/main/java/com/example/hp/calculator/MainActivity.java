package com.example.hp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnAdd, btnSub;
    private EditText FirstNumber, SecondNumber;
    private TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {

        btnAdd = (Button) findViewById(R.id.add);
        btnSub = (Button) findViewById(R.id.sub);
        FirstNumber = (EditText) findViewById(R.id.fnumber);
        SecondNumber = (EditText) findViewById(R.id.snumber);
        Result = (TextView) findViewById(R.id.result);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);

    }

    public void onClick(View view) {
        String num1 = FirstNumber.getText().toString();
        String num2 = SecondNumber.getText().toString();

        switch (view.getId()) {
            case R.id.add:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                Result.setText(String.valueOf(addition));
                break;

            case R.id.sub:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                Result.setText(String.valueOf(subtraction));
                break;
        }

    }
}
