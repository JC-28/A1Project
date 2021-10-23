package com.example.assignment120;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";
    CheckBox cb1, cb2, cb3, cb4, cb5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn =  findViewById(R.id.add_btn);
        Button btn2 = findViewById(R.id.confirm_btn);
        btn.setOnClickListener(this::onAddCart);

       /* btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onConfirm();
            }
        });*/

    }

    public void onAddCart(View view) {
        StringBuilder order = new StringBuilder();
        cb1 = findViewById(R.id.H_checkBox);
        cb2 = findViewById(R.id.P_checkBox);
        cb3 = findViewById(R.id.C_checkBox);
        cb4 = findViewById(R.id.CH_checkBox);
        cb5 = findViewById(R.id.V_checkBox);

        order.append("Your Order");
        if(cb1.isChecked()) {
            order.append("\n").append(cb1.getText().toString());
        }
        if(cb2.isChecked()){
            order.append("\n").append(cb2.getText().toString());
        }
        if(cb3.isChecked()){
            order.append("\n").append(cb3.getText().toString());
        }
        if(cb4.isChecked()){
            order.append("\n").append(cb4.getText().toString());
        }
        if(cb5.isChecked()){
            order.append("\n").append(cb5.getText().toString());
        }

        Intent intent = new Intent(this, ConfirmOrderActivity.class);
        intent.putExtra(EXTRA_MESSAGE, order.toString());
        startActivity(intent);
    }
   /* public void onConfirm(){

        Intent intent = new Intent(this, ConfirmOrderActivity.class);
        startActivity(intent);
    }*/
}