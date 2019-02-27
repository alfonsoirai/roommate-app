package com.alfonso.roommate_app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CodeGenerator extends Activity {

    private TextView codeTextView;
    private Button getStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_generator);

        codeTextView = findViewById(R.id.code_textView);
        getStarted = findViewById(R.id.getStarted_button);
    }

    public void getStarted(View v){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
