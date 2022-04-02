package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editNol;
    Button button0, button1, button2, button3, button4, button5, button6, button7,
            button8, button9, buttonC, buttonBagi, buttonKali, buttonKurang, buttonTambah,
            buttonHasil;
    int operasi1, operasi2;
    boolean tambah, kurang, kali, bagi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonTambah = (Button) findViewById(R.id.buttonTambah);
        buttonKurang = (Button) findViewById(R.id.buttonKurang);
        buttonKali = (Button) findViewById(R.id.buttonKali);
        buttonBagi = (Button) findViewById(R.id.buttonBagi);
        buttonHasil = (Button) findViewById(R.id.buttonHasil);
        editNol = (EditText) findViewById(R.id.editNol);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNol.setText(editNol.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNol.setText(editNol.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNol.setText(editNol.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNol.setText(editNol.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNol.setText(editNol.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNol.setText(editNol.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNol.setText(editNol.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNol.setText(editNol.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNol.setText(editNol.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNol.setText(editNol.getText() + "9");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNol.setText("");
            }
        });

        buttonTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editNol == null){
                    editNol.setText("");
                }else {
                    operasi1 = Integer.parseInt(editNol.getText() + "");
                    tambah = true;
                    editNol.setText(null);
                }
            }
        });

        buttonKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operasi1 = Integer.parseInt(editNol.getText() + "");
                kurang = true;
                editNol.setText(null);
            }
        });

        buttonBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operasi1 = Integer.parseInt(editNol.getText() + "");
                bagi = true;
                editNol.setText(null);
            }
        });

        buttonKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operasi1 = Integer.parseInt(editNol.getText() + "");
                kali = true;
                editNol.setText(null);
            }
        });

        buttonHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operasi2 = Integer.parseInt(editNol.getText() + "");
                if(tambah == true) {
                    editNol.setText(operasi1 + operasi2 + "");
                    tambah = false;
                }

                if(kurang == true) {
                    editNol.setText(operasi1 - operasi2 + "");
                    kurang = false;
                }

                if(kali == true){
                    editNol.setText(operasi1 * operasi2 + "");
                    kali = false;
                }

                if(bagi == true) {
                    editNol.setText(operasi1 / operasi2 + "");
                    bagi = false;
                }
            }
        });
    }
}