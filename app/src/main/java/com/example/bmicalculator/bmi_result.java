package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class bmi_result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_result);
        Intent intent=getIntent();
        String state=intent.getStringExtra("state");
        String bmi=intent.getStringExtra("bmi");
        TextView BMI=(TextView) findViewById(R.id.bmi);
        TextView State=(TextView) findViewById(R.id.state);
        BMI.setText(bmi);
        State.setText(state);
    }
    public void send(View view){
        TextView BMI=(TextView) findViewById(R.id.bmi);
        TextView State=(TextView) findViewById(R.id.state);
        String bmi= BMI.getText().toString();
        String state=State.getText().toString();
        Intent i=new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT,"My BMI IS : "+"\n"+bmi+"\n"+"My status is : "+"\n"+state);
        String s="Send Result Via :";
        startActivity(Intent.createChooser(i,s));
    }
}