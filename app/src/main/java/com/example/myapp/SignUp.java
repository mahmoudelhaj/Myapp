package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SignUp extends AppCompatActivity {

    EditText emailEt ,passwordEt ,confirmPasswordEt ,firstNameEt ,lastNameEt ,telephoneEt;
    Button signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        emailEt = findViewById(R.id.emailEt);
        passwordEt = findViewById(R.id.passwordEt);
        confirmPasswordEt = findViewById(R.id.confirmPasswordEt);
        firstNameEt = findViewById(R.id.firstNameEt);
        lastNameEt = findViewById(R.id.lastNameEt);
        telephoneEt = findViewById(R.id.telephoneEt);
        signUpBtn = findViewById(R.id.signUpBtn);

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email  = emailEt.getText().toString();
                String password = passwordEt.getText().toString();
                String confirmPassword = confirmPasswordEt.getText().toString();
                String firstName = firstNameEt.getText().toString();
                String lasName = lastNameEt.getText().toString();
                String telephone = telephoneEt.getText().toString();

                if(email.equals("")){
                    emailEt.setError("You Must to Enter Email");
                    return;
                }

                if(password.equals("")){
                    passwordEt.setError("You Must to Enter Password");
                    return;
                }

                if(!confirmPassword.equals(password)){
                    confirmPasswordEt.setError("Password does not match");
                    return;
                }

                if(firstName.equals("")){
                    firstNameEt.setError("You Must to Enter Your First Name");
                    return;
                }

                if(lasName.equals("")){
                    lastNameEt.setError("You Must to Enter Your Last Name");
                    return;
                }

                if(telephone.equals("")){
                    lastNameEt.setError("You Must to Enter Your Phone");
                    return;
                }



                Intent intent = new Intent(SignUp.this , MainActivity.class);
                Bundle extras = new Bundle();
                extras.putString("firstName" ,firstName);
                extras.putString("lastName" ,lasName);
                extras.putString("email" ,email);
                extras.putString("password" ,password);
                extras.putString("telephone" ,telephone);
                intent.putExtras(extras);
                startActivity(intent);

            }
        });
    }
}
