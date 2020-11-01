package com.group.sedavssima;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button startButton;
    private CheckBox box;
    private TextView alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton = findViewById(R.id.start);
        box = findViewById(R.id.box);
        alert = findViewById(R.id.alert);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!box.isChecked())
                    alert.setVisibility(View.VISIBLE);
                else
                {
                    Intent intent = new Intent(MainActivity.this, SwitchUserGUI.class);
                    startActivity(intent);
                }
            }
        });
    }
}