package com.csce.hamstersftw.hamsterhelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.ProgressDialog;

import com.facebook.stetho.Stetho;


public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener{

    private Button register;
    private EditText firstName;
    private EditText lastName;
    private EditText birthDay;
    private EditText mobile;
    private EditText address1;
    private EditText address2;
    private EditText email;
    private EditText pass;


    Databasehelper helper = new Databasehelper(this);

    private ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Stetho.initializeWithDefaults(this);
        setContentView(R.layout.activity_registration);
        progressDialog = new ProgressDialog(this);
        register = findViewById(R.id.Register1);
        firstName = findViewById(R.id.firstname);
        lastName = findViewById(R.id.lastName);
        birthDay = findViewById(R.id.birthday);
        mobile = findViewById(R.id.mobile);
        address1 = findViewById(R.id.address1);
        address2 = findViewById(R.id.address2);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.password);
        register.setOnClickListener(this);
    }

    public void onRegister(View view) {
//        if (view.getId() == R.id.Register1) {
//
//
        String firstname = firstName.getText().toString();
        progressDialog.setMessage("REACHED3");
        progressDialog.show();
        String lastname = lastName.getText().toString();
        progressDialog.setMessage("REACHED4");
        progressDialog.show();
        String birthday = birthDay.getText().toString();
        progressDialog.setMessage("REACHED5");
        progressDialog.show();
        String phno = mobile.getText().toString();
        progressDialog.setMessage("REACHED6");
        progressDialog.show();
        String addres1 = address1.getText().toString();
        progressDialog.setMessage("REACHED7");
        progressDialog.show();
        String addres2 = address2.getText().toString();
        progressDialog.setMessage("REACHED8");
        progressDialog.show();
        String Email = email.getText().toString();
        progressDialog.setMessage("REACHED9");
        progressDialog.show();
        String Password = pass.getText().toString();
        progressDialog.setMessage("REACHED10");
        progressDialog.show();
        Userinfo u = new Userinfo();
        progressDialog.setMessage("REACHED11");
        progressDialog.show();
        u.setFirstName(firstname);
        u.setLastName(lastname);
        u.setBirthDay(birthday);
        u.setMobile(phno);
        u.setAddressLine1(addres1);
        u.setAddressLine2(addres2);
        u.setEmail(Email);
        u.setPassword(Password);
        helper.insertInfo(u);
        progressDialog.setMessage("REACHED100");
        progressDialog.show();
        Intent i = new Intent(this, Login.class );
        startActivity(i);
//        }
//        else {
//            progressDialog.setMessage("REACHED1");
//            progressDialog.show();
//        }



    }

    @Override
    public void onClick(View view) {
        onRegister(view);
    }
}

