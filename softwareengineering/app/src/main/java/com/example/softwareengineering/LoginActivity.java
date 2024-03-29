package com.example.softwareengineering;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edUsername,edPassword;
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edUsername=findViewById(R.id.editTextLoginUsername);
        edPassword=findViewById(R.id.editTextLoginPassword);
        btn=findViewById(R.id.buttonLogin);
        tv=findViewById(R.id.textViewNewUser);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, concert_screen.class));

             /*   String username=edUsername.getText().toString();
                String password=edPassword.getText().toString();
                Database db=new Database(getApplicationContext(),"healthcare",null,1);
                if (username.length()==0 || password.length()==0){
                    Toast.makeText(getApplicationContext(),"Please fill all informations",Toast.LENGTH_SHORT).show();

                }
                else{
                    if(db.login(username,password)==1){
                        Toast.makeText(getApplicationContext(),"Login succesful",Toast.LENGTH_SHORT).show();
                        Toast.makeText(getApplicationContext(),"Welcome "+username,Toast.LENGTH_SHORT).show();
                        SharedPreferences sharedPreferences=getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor=sharedPreferences.edit();
                        editor.putString("username",username);
                        //data yisave lemek icin key ve value ile
                        editor.apply();
                        startActivity(new Intent(LoginActivity.this, concert_screen.class));

                    }else{
                        Toast.makeText(getApplicationContext(),"Invalid password or username",Toast.LENGTH_SHORT).show();

                    }



                }*/
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
    }
}