package com.alfonso.roommate_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JoinGroup extends Activity {

    private TextView groupCodeInput;
    private Button joinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_group);

        groupCodeInput = findViewById(R.id.groupCode_input);
        joinButton = findViewById(R.id.getStarted_button);
    }

    public void joinButton(View v){
        Intent intent = new Intent();
        startActivity(intent);
    }
}
