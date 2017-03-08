package com.example.u1660498.studio1assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.net.Uri;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button= (Button) findViewById(R.id.btn_Tickets);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.leedsfestival.com/tickets"));
                startActivity(intent);
            }
        });
    }
    public void sendEvent(View view) {
        Intent startNewActivity = new Intent(this, eventActivity.class);
        startActivity(startNewActivity);
    }
    public void sendLineUp(View view) {
        Intent startNewActivity = new Intent(this, LineUpPage.class);
        startActivity(startNewActivity);
    }
    public void sendDir(View view) {
        Intent startNewActivity = new Intent(this, activity_direction.class);
        startActivity(startNewActivity);
    }
}

