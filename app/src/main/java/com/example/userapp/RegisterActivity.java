package com.example.userapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    private EditText editName;
    private EditText editEmailAddress;
    private EditText editPassword;
    private EditText editRetypePassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editName = findViewById(R.id.edit_name);
        editEmailAddress = findViewById(R.id.edit_email_address);
        editPassword = findViewById(R.id.edit_password);
        editRetypePassword = findViewById(R.id.edit_retype__password);
        Button buttonSignUp = findViewById(R.id.button_sign_up);

        TextView textSignIn = findViewById(R.id.text_sign_in);
        textSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                finish();
            }
        });

    }
}
