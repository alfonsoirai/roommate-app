package com.alfonso.roommate_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class RoommatesList extends AppCompatActivity {

    private ListView roommatesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roommates_list);
        setTitle("Roommates List");

        roommatesList = findViewById(R.id.roommates_ListView);
    }
}
