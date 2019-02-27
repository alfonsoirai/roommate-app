package com.alfonso.roommate_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpForm extends Activity {

    private Button joinGroupButton, createGroupButton;
    private TextView emailInput, passwordInput, confirmPasswordInput, nameInput, usernameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_form);

        joinGroupButton = findViewById(R.id.getStarted_button);
        createGroupButton = findViewById(R.id.createGroup_button);

        emailInput = findViewById(R.id.email_input);
        passwordInput = findViewById(R.id.password_input);
        confirmPasswordInput = findViewById(R.id.confirmPassword_input);
        nameInput = findViewById(R.id.name_input);
        usernameInput = findViewById(R.id.username_input);
    }

    public void clickJoinGroup(View v){
        Intent intent = new Intent(this, JoinGroup.class);
        startActivity(intent);
    }

    public void clickCreateGroup(View v){
        Intent intent = new Intent(this, CreateGroup.class);
        startActivity(intent);
    }
}
