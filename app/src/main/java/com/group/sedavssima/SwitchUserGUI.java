package com.group.sedavssima;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SwitchUserGUI extends AppCompatActivity {
    private Button spenserCompanyButton;
    private Button channelManagerButton;
    private Button generalManagerButton;
    private Button visitorButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_user_gui);
        spenserCompanyButton = findViewById(R.id.spenser);
        channelManagerButton = findViewById(R.id.channelManager);
        generalManagerButton = findViewById(R.id.generalManager);
        visitorButton = findViewById(R.id.visitor);

        spenserCompanyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwitchUserGUI.this, SpenserCompanyGUI.class);
                startActivity(intent);
            }
        });
        channelManagerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(SwitchUserGUI.this, ChannelManagerGUI.class);
                startActivity(intent);
            }
        });
        generalManagerButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(SwitchUserGUI.this, GeneralManagerGUI.class);
                startActivity(intent);
            }
        });
        visitorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwitchUserGUI.this, ViewerGUI.class);
                startActivity(intent);
            }
        });
    }
}