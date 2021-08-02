package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculat_BMI(View view){
        EditText weight=(EditText) findViewById(R.id.weight);
        EditText height=(EditText) findViewById(R.id.height);
        Spinner weight_Uints=(Spinner) findViewById(R.id.weight_spinner);
        Spinner height_Uints=(Spinner) findViewById(R.id.height_spinner);
        //make object from BMI class
        BmI_Class bmi_class=new BmI_Class();
        //set weight
        bmi_class.setWeight_kg(Double.parseDouble(weight.getText().toString()),weight_Uints.getSelectedItem().toString());
        //set height
        bmi_class.setHeight_m(Double.parseDouble(height.getText().toString()),height_Uints.getSelectedItem().toString());
        //set bmi
        bmi_class.setBmi(bmi_class.getWeight_kg(),bmi_class.getHeight_m());
        //get bmi
        double bmi=bmi_class.getBmi();
        String S=String.format("%.4f", bmi);
        //set state
        bmi_class.setState(bmi);
        //get state
        String state=bmi_class.getState();
        // transfer result to result page
        Intent intent=new Intent(this,bmi_result.class);
        intent.putExtra("bmi",S);
        intent.putExtra("state",state);
        startActivity(intent);
    }
}