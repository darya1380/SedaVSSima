package com.group.sedavssima;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.group.sedavssima.logic.GeneralManager;
import com.group.sedavssima.logic.Program;
import com.group.sedavssima.logic.Viewer;


public class ViewerGUI extends AppCompatActivity {
    private EditText programName;
    private EditText programRate;
    private TextView rateFalse;
    private TextView rateTrue;
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewer_gui);
        programName = findViewById(R.id.name);
        programRate = findViewById(R.id.rate);
        rateFalse = findViewById(R.id.rateFalse);
        rateTrue = findViewById(R.id.rateTrue);
        submit = findViewById(R.id.submit123);
        final Viewer viewer = new Viewer();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = programName.getText().toString();
                String rate = programRate.getText().toString();
                int mainRate = Integer.parseInt(rate);
                boolean res  = viewer.rate(new Program(name), mainRate);
                GeneralManager generalManager = GeneralManager.getInstance();
                boolean res2 = generalManager.existProgram(new Program(name));
                if(res && res2)
                {
                    rateTrue.setVisibility(View.VISIBLE);
                }
                else
                {
                    rateFalse.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}