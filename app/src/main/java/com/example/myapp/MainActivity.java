package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView firsNameTv , lastNameTv , emailTv , passwordTv , telephoneTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String firsName = getIntent().getExtras().getString("firstName");
        String lasName = getIntent().getExtras().getString("lastName");
        String email = getIntent().getExtras().getString("email");
        String password = getIntent().getExtras().getString("password");
        String telephone = getIntent().getExtras().getString("telephone");

        firsNameTv = findViewById(R.id.firsNameTv);
        firsNameTv.setText("Firs Name : "+firsName);

        lastNameTv = findViewById(R.id.lastNameTv);
        lastNameTv.setText("Last Name : "+lasName);

        emailTv = findViewById(R.id.emailTv);
        emailTv.setText("Email : "+email);

        passwordTv = findViewById(R.id.passwordTv);
        passwordTv.setText("Password : "+password);

        telephoneTv = findViewById(R.id.telephoneTv);
        telephoneTv.setText("Telephone : "+telephone);



    }
}
