package com.example.u1660498.studio1assignment;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_Coach extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__coach);

        Button button = (Button) findViewById(R.id.btnBook);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.biggreencoach.co.uk/events/leeds-festival-tickets-coach-travel"));
                startActivity(intent);
            }
        });
    }
}
