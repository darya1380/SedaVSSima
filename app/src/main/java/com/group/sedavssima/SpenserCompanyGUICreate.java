package com.group.sedavssima;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.group.sedavssima.logic.Advertisement;
import com.group.sedavssima.logic.SpenserCompany;

public class SpenserCompanyGUICreate extends AppCompatActivity {
    private Button adsOk;
    private Button chargeAccount;
    private EditText adsName;
    private EditText amount;
    private TextView alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spenser_company_gui_creat);
        Bundle bundle = getIntent().getExtras();
        String name = "";
        try {
             name = bundle.getString("s");
        }catch (NullPointerException e)
        {
            e.printStackTrace();
        }
        final SpenserCompany s = new SpenserCompany(name);
        adsOk = findViewById(R.id.ads_ok);
        chargeAccount = findViewById(R.id.firm_charge_account);
        adsName = findViewById(R.id.ads_name);
        amount = findViewById(R.id.charge_account);
        alert = findViewById(R.id.alert);
        final String finalName = name;
        adsOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(adsName.getText().toString().trim().equals("")) {
                    alert.setVisibility(View.VISIBLE);
                    return;
                }
                else
                {
                    s.purchaseAds(new Advertisement(finalName));
                }
            }
        });
    }
}