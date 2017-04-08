package com.example.anew.frcscoutingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ToggleButton;

public class TeleopMenu2 extends AppCompatActivity {
    Button backTeleopMenu2, goToPostMatch, mainMenu;
    ImageButton subtractFoulsTeleop, addFoulsTeleop, subtractTechFoulsTeleop, addTechFoulsTeleop, subtractHumanErrors, addHumanErrors, subtractRoboErrorsTeleop, addRoboErrorsTeleop;
    ToggleButton rope;
    Integer numFoulsTeleop, numTechFoulsTeleop, numHumanErrors, numRoboErrorsTeleop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teleop_menu2);
        onClickListenerTeleopMenu2();
    }
    public void onClickListenerTeleopMenu2() {

        backTeleopMenu2 = (Button) findViewById(R.id.backTeleopMenu2);
        goToPostMatch = (Button) findViewById(R.id.goToPostMatch);
        mainMenu = (Button) findViewById(R.id.mainMenu);
        subtractFoulsTeleop = (ImageButton) findViewById(R.id.subtractFoulsTeleop);
        addFoulsTeleop = (ImageButton) findViewById(R.id.addFoulsTeleop);
        subtractTechFoulsTeleop = (ImageButton) findViewById(R.id.subtractTechFoulsTeleop);
        addTechFoulsTeleop = (ImageButton) findViewById(R.id.addTechFoulsTeleop);
        subtractHumanErrors = (ImageButton) findViewById(R.id.subtractHumanErrors);
        addHumanErrors = (ImageButton) findViewById(R.id.addHumanErrors);
        subtractRoboErrorsTeleop = (ImageButton) findViewById(R.id.subtractRoboErrorsTeleop);
        addRoboErrorsTeleop = (ImageButton) findViewById(R.id.addRoboErrorsTeleop);
        rope = (ToggleButton) findViewById(R.id.rope);



        goToPostMatch.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(TeleopMenu2.this,PostMatchMenu.class);
                        startActivity(intent);

                    }
                }

        );
        backTeleopMenu2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(TeleopMenu2.this, AutonMenu.class);
                        startActivity(intent);

                    }
                }

        );
        mainMenu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(TeleopMenu2.this, MainMenu.class);
                        startActivity(intent);

                    }
                }

        );
        subtractFoulsTeleop.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        numFoulsTeleop = numTechFoulsTeleop - 1;
                    }
                }

        );
        addFoulsTeleop.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        numFoulsTeleop = numFoulsTeleop + 1;
                    }
                }

        );
        subtractTechFoulsTeleop.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        numTechFoulsTeleop = numTechFoulsTeleop - 1;
                    }
                }

        );
        addTechFoulsTeleop.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        numTechFoulsTeleop = numTechFoulsTeleop + 1;
                    }
                }

        );
        subtractHumanErrors.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        numHumanErrors = numHumanErrors - 1;
                    }
                }

        );
        addHumanErrors.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        numHumanErrors = numHumanErrors + 1;
                    }
                }

        );
        subtractRoboErrorsTeleop.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        numRoboErrorsTeleop = numRoboErrorsTeleop - 1;
                    }
                }

        );
        addRoboErrorsTeleop.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        numRoboErrorsTeleop = numRoboErrorsTeleop + 1;
                    }
                }

        );
        rope.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                    }
                }

        );
    }
}
