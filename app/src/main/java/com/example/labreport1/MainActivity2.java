package com.example.labreport1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    Button button0, button1, button2, button3, button4,
            button5, button6, button7, button8, button9,
            buttonadd, buttonsub, buttondiv, buttonmul, buttonclr,
            buttonequal, buttondec;
    EditText eT;
    float ValueOne, ValueTwo, result;
    boolean Addition, Subtract, Multiplication, Division;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        eT = (EditText) findViewById(R.id.edittext);

        button0 = (Button) findViewById(R.id.n0);
        button1 = (Button) findViewById(R.id.n1);
        button2 = (Button) findViewById(R.id.n2);
        button3 = (Button) findViewById(R.id.n3);
        button4 = (Button) findViewById(R.id.n4);
        button5 = (Button) findViewById(R.id.n5);
        button6 = (Button) findViewById(R.id.n6);
        button7 = (Button) findViewById(R.id.n7);
        button8 = (Button) findViewById(R.id.n8);
        button9 = (Button) findViewById(R.id.n9);
        buttondec = (Button) findViewById(R.id.dec);
        buttonadd = (Button) findViewById(R.id.add);
        buttonsub = (Button) findViewById(R.id.sub);
        buttondiv = (Button) findViewById(R.id.div);
        buttonmul = (Button) findViewById(R.id.mul);
        buttonclr = (Button) findViewById(R.id.clr);
        buttonequal = (Button) findViewById(R.id.equal);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                eT.setText(eT.getText()+ "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                eT.setText(eT.getText()+ "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+ "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                eT.setText(eT.getText()+ "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                eT.setText(eT.getText()+ "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                eT.setText(eT.getText()+ "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                eT.setText(eT.getText()+ "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+ "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                eT.setText(eT.getText()+ "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                eT.setText(eT.getText()+ "0");
            }
        });
        buttonclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                eT.setText(eT.getText()+ "");
            }
        });
        buttondec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                eT.setText(eT.getText()+ ".");
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(eT.getText().toString());
                Addition = true;
                eT.setText(null);
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(eT.getText().toString());
                Subtract = true;
                eT.setText(null);
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(eT.getText().toString());
                Division = true;
                eT.setText(null);
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(eT.getText().toString());
                Multiplication = true;
                eT.setText(null);
            }
        });
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueTwo = Float.parseFloat(eT.getText().toString());
                if(Addition==true){
                    result = ValueOne+ValueTwo;
                    eT.setText(String.valueOf(result));
                    Addition = false;
                }
                else if(Subtract==true){
                    result=ValueOne-ValueTwo;
                    eT.setText(String.valueOf(result));
                    Subtract=false;
                }
            }

        });
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueTwo = Float.parseFloat(eT.getText().toString());
                if(Addition==true){
                    result = ValueOne+ValueTwo;
                    eT.setText(String.valueOf(result));
                    Addition = false;
                }
                else if(Subtract==true){
                    result=ValueOne-ValueTwo;
                    eT.setText(String.valueOf(result));
                    Subtract=false;
                }
            }

        });


    }
}