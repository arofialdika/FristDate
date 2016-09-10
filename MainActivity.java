package com.example.aldika.tp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button tekan = (Button)findViewById(R.id.btnProfile);
        tekan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                panggilIntent();
            }
        });
    }
    public void panggilIntent()
    {
        Intent i = new Intent(this, Profile.class);
        startActivity(i);
    }
}