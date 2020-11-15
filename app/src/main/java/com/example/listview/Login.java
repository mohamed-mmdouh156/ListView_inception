package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Login extends AppCompatActivity {
    AutoCompleteTextView username ;
    EditText password ;
    Button login ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username_et);
        password = findViewById(R.id.password_et);
        login = findViewById(R.id.login_btn);

        ArrayList<String> users = new ArrayList<>();
        users.add("mohamed_mmdouh");
        users.add("mmdouh156");
        users.add("mohamed1234");
        users.add("mmdouh1234");

        ArrayAdapter<String> items = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , users);
        username.setAdapter(items);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent to_main = new Intent(Login.this , MainActivity.class);
                    startActivity(to_main);

            }
        });



    }
}