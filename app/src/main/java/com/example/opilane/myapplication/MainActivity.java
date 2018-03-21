package com.example.opilane.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonRegister;
    private EditText editTextMail;
    private EditText editTextPassword;
    private TextView textViewSignin;

    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        

        buttonRegister = (Button) findViewById(R.id.buttonRegister);

        editTextMail = (EditText) findViewById(R.id.editTextEmail);
       editTextPassword = (EditText) findViewById(R.id.editTextPassword);

       textViewSignin = (TextView) findViewById(R.id.textViewSignin);

       buttonRegister.setOnClickListener(this);
       textViewSignin.setOnClickListener(this);

    }

    private void registerUser (){
        String email = editTextMail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if (TextUtils.isEmpty(email)){
           //email is empty
            Toast.makeText(this, "Please enter email", Toast.LENGTH_SHORT).show();
            //stopping the function execution
            return;
        }

        if (TextUtils.isEmpty(password)){
            //password is empty
            Toast.makeText(this, "Please enter password",Toast.LENGTH_SHORT).show();
            //stopping the function execution further
            return;
        }
    }
    //if validation are ok
    //we will first show a progressbar

    @Override
    public void onClick(View view){
      if (view == buttonRegister){
          registerUser ();


      }
      if (view == textViewSignin){
       //will open login activity here


    }

    }}
