package com.example.assignment120;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmOrderActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_order_activity);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textview = findViewById(R.id.TextView1);
        textview.setText(text);
    }
/*
    public void onSendMessage(){
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "TEST");
        sendIntent.setType("text/plain");
        startActivity(sendIntent);

    }*/
}
