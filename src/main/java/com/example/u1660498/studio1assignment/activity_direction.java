package com.example.u1660498.studio1assignment;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_direction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direction);
    }

    public void sendCar (View view) {
        Intent startNewActivity = new Intent(this, car_Activity.class);
        startActivity(startNewActivity);
    }
    public void sendCoach (View view) {
        Intent startNewActivity = new Intent(this, activity_Coach.class);
        startActivity(startNewActivity);
    }
}
