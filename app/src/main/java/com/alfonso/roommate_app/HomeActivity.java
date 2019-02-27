package com.alfonso.roommate_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView greetingTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("Home");

        greetingTitle = findViewById(R.id.greeting_textView);

        greetingTitle.setText("Hello, " + getName() + ".");
    }

    public String getName(){
        return "Alfonso";
    }

    public void goToRoommatesList(View v){
        Intent intent = new Intent(this, RoommatesList.class);
        startActivity(intent);
    }
}
