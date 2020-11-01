package com.group.sedavssima;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static android.view.View.INVISIBLE;
import static android.view.View.OnClickListener;
import static android.view.View.VISIBLE;

public class SpenserCompanyGUI extends AppCompatActivity {
    private Button button;
    private EditText text;
    private TextView view1;
    private TextView ordinary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spenser_company_gui);
        button = findViewById(R.id.login);
        text = findViewById(R.id.editText);
        view1 = findViewById(R.id.alert);
        ordinary = findViewById(R.id.ordinaryView);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String name = text.getText().toString().trim();
                Log.v("Spenser", "Name of current spenser company is taken");
                Log.v("Spenser", "it must be sent to next activity!");
                if(name.length() == 0)
                {
                    view1.setVisibility(VISIBLE);
                }
                else
                {
                    view1.setVisibility(INVISIBLE);
                    Intent intent1 = new Intent(SpenserCompanyGUI.this, SpenserCompanyGUICreate.class);
                    intent1.putExtra("s", name);
                    startActivity(intent1);
                }
            }
        });

    }
}