package com.example.anew.frcscoutingapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class PreMatchMenu extends AppCompatActivity {
    Button backPreMatchMenu, startScouting, mainMenu;
    Switch allianceSelector;
    TextView redAlliance, blueAlliance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_match_menu);
        onClickListenerPreMatchMenu();
    }

    public void onClickListenerPreMatchMenu() {

        backPreMatchMenu = (Button) findViewById(R.id.backPreMatchMenu);
        startScouting = (Button) findViewById(R.id.startScouting);
        mainMenu = (Button) findViewById(R.id.mainMenu);

        allianceSelector = (Switch)findViewById(R.id.allianceSelector);
        redAlliance = (TextView)findViewById(R.id.redAlliance);
        blueAlliance = (TextView)findViewById(R.id.blueAlliance);

        startScouting.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(PreMatchMenu.this, AutonMenu.class);
                        startActivity(intent);

                    }
                }

        );
        backPreMatchMenu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(PreMatchMenu.this, ScouterMenu.class);
                        startActivity(intent);

                    }
                }

        );

        mainMenu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(PreMatchMenu.this, MainMenu.class);
                        startActivity(intent);

                    }
                }

        );
        allianceSelector.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    redAlliance.setBackgroundColor(Color.parseColor("#FF0000"));
                    redAlliance.setTextSize(25);
                    blueAlliance.setBackgroundColor(Color.parseColor("#ffffff"));

                }else{
                    blueAlliance.setBackgroundColor(Color.parseColor("#0000ff"));
                    blueAlliance.setTextSize(25);
                    redAlliance.setBackgroundColor(Color.parseColor("#ffffff"));
                }
            }
        });
    }
}