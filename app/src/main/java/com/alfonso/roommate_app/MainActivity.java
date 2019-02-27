package com.alfonso.roommate_app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView emailInput, passwordInput;
    private Button loginButton, signupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailInput = findViewById(R.id.email_input);
        passwordInput = findViewById(R.id.password_input);
        loginButton = findViewById(R.id.login_button);
        signupButton = findViewById(R.id.signup_button);
    }

    public void loginClick(View v){
//        Intent intent = new Intent(this, SignUpForm.class);
//        startActivity(intent);
    }

    public void SignUpClick(View v){
        Intent intent = new Intent(this, SignUpForm.class);
        startActivity(intent);
    }
}
