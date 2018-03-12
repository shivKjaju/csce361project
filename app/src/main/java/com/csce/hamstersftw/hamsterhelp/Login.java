package com.csce.hamstersftw.hamsterhelp;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {
    private Button buttonSignIn;
    private EditText email;
    private EditText password;
    private TextView signUp;
    private ProgressDialog progressDialog;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email =  findViewById(R.id.email);
        password =  findViewById(R.id.password);
        buttonSignIn =  findViewById(R.id.login);
        signUp = findViewById(R.id.registration);
        buttonSignIn.setOnClickListener(this);

        progressDialog = new ProgressDialog(this);
        signUp.setOnClickListener(this);
    }

    private void userLogin(){
        String emailAddress = email.getText().toString().trim();
        String pass = password.getText().toString().trim();
        //progressDialog.setMessage("REACHED1");
        progressDialog.show();
        if(TextUtils.isEmpty(emailAddress)){
            Toast.makeText(this,"Please enter the email",Toast.LENGTH_LONG).show();
            //  progressDialog.setMessage("REACHED2");
            progressDialog.show();
            return;
        }
        if(TextUtils.isEmpty(pass)){
            Toast.makeText(this,"Please enter the password to login",Toast.LENGTH_LONG).show();
            //  progressDialog.setMessage("REACHED3");
            progressDialog.show();
            return;
        }
        progressDialog.setMessage("Taking you in");
        progressDialog.show();

    }

    @Override
    public void onClick(View view) {
        if(view == buttonSignIn){
            userLogin();
        }
        if(view == signUp){
            finish();
            startActivity(new Intent( this, RegistrationActivity.class));
        }
    }


}
