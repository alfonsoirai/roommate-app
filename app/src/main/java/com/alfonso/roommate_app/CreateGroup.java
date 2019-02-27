package com.alfonso.roommate_app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CreateGroup extends Activity {

    private TextView groupNameInput, numberOfRommatesInput;
    private Button createButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_group);

        groupNameInput = findViewById(R.id.groupName_input);
        numberOfRommatesInput = findViewById(R.id.numberOfUsers_input);

        createButton = findViewById(R.id.create_button);
    }

    public void createGroupAction(View v){
        Intent intent = new Intent(this, CodeGenerator.class);
        startActivity(intent);
    }
}
