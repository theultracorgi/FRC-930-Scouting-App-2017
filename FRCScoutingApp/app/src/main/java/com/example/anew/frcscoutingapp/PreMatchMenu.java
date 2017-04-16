package com.example.anew.frcscoutingapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
public class PreMatchMenu extends AppCompatActivity {
    Button backPreMatchMenu, startScouting, mainMenu;
    Switch allianceSelector;
    TextView redAlliance, blueAlliance;
    EditText teamNum, matchNum;
    Integer greenAlliance;
    View view;
    String [] teamArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_match_menu);
        greenAlliance = 0;
        view = this.getWindow().getDecorView();
        onClickListenerPreMatchMenu();
        teamArray = new String[30];
    }

    public void onClickListenerPreMatchMenu() {

        backPreMatchMenu = (Button) findViewById(R.id.backPreMatchMenu);
        startScouting = (Button) findViewById(R.id.startScouting);
        mainMenu = (Button) findViewById(R.id.mainMenu);

        allianceSelector = (Switch)findViewById(R.id.allianceSelector);
        redAlliance = (TextView)findViewById(R.id.redAlliance);
        blueAlliance = (TextView)findViewById(R.id.blueAlliance);

        teamNum = (EditText)findViewById(R.id.teamNum);
        matchNum = (EditText)findViewById(R.id.matchNum);

        startScouting.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String teamNumber = teamNum.getText().toString();
                        String matchNumber = matchNum.getText().toString();
                        if(allianceSelector.isChecked()){
                            String alliance = "Red";
                        } else {
                            String alliance = "Blue";
                        }
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
                    allianceSelector.setBackgroundColor(Color.parseColor("#FF0000"));
                    greenAlliance = greenAlliance + 1;
                    if (greenAlliance >= 50){
                        redAlliance.setBackgroundColor(Color.parseColor("#008000"));
                        blueAlliance.setBackgroundColor(Color.parseColor("#008000"));
                        allianceSelector.setBackgroundColor(Color.parseColor("#008000"));
                    }



                }else{
                    blueAlliance.setBackgroundColor(Color.parseColor("#0000ff"));
                    blueAlliance.setTextSize(25);
                    redAlliance.setBackgroundColor(Color.parseColor("#ffffff"));
                    allianceSelector.setBackgroundColor(Color.parseColor("#0000ff"));
                    greenAlliance = greenAlliance + 1;
                    if (greenAlliance >= 50){
                        redAlliance.setBackgroundColor(Color.parseColor("#008000"));
                        blueAlliance.setBackgroundColor(Color.parseColor("#008000"));
                        allianceSelector.setBackgroundColor(Color.parseColor("#008000"));
                    }
                }
            }
        });
    }
}