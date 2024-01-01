package com.example.softwareengineering;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class cart_activitiy extends AppCompatActivity {
    EditText cartNumber;
    EditText cartDate;
    EditText cartCVV;
    Button payButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_activitiy);
        cartNumber=findViewById(R.id.cartNumber);
        cartDate=findViewById(R.id.cartDate);
        cartCVV=findViewById(R.id.cartSecurityNumber);
        payButton=findViewById(R.id.payButton);


    }
}