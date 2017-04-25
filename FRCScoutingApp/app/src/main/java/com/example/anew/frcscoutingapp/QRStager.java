package com.example.anew.frcscoutingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.common.BitMatrix;

        public class QRStager extends AppCompatActivity {
            Button backQRStager, genQRCode, mainMenu;
            Intent inputData;
            String [] teamArray;
            String set;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_qrstager);
                inputData = getIntent();
               // teamArray = inputData.getStringArrayExtra("PostMatchArray");
                set = "PIZZAAAA";

                onClickListenerQRStager();
            }
            public void onClickListenerQRStager() {

                Toast.makeText(getApplicationContext(), "U made it THIS FAR PAUL", Toast.LENGTH_LONG).show();

                backQRStager = (Button) findViewById(R.id.backQRStager);
                genQRCode = (Button) findViewById(R.id.genQRCode);
                mainMenu = (Button) findViewById(R.id.mainMenu);

                genQRCode.setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getApplicationContext(), "Hit this Button 1 more time", Toast.LENGTH_LONG).show();


                                // Generate QR
                               QRCodeWriter writer = new QRCodeWriter();
                                try{
                                    BitMatrix bitMatrix = writer.encode(set, BarcodeFormat.QR_CODE, 512, 512);
                                    int width = bitMatrix.getWidth();
                                    int height = bitMatrix.getHeight();
                                    Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
                                    for (int x  = 0; x < width; x++) {
                                        for (int y = 0; y < height; y++) {
                                            bmp.setPixel(x, y, bitMatrix.get(x, y) ? Color.BLACK : Color.WHITE);
                                        }
                                    }
                                    ((ImageView) findViewById(R.id.img_result_qr)).setImageBitmap(bmp);
                                    Toast.makeText(getApplicationContext(), "U fail", Toast.LENGTH_LONG).show();
                                }
                                catch (WriterException e) {
                                    e.printStackTrace();
                                    Toast.makeText(getApplicationContext(), "Caught WriterException !!!", Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                );
                backQRStager.setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(QRStager.this, ScouterMenu.class);
                                startActivity(intent);
                            }
                        }
                );

                mainMenu.setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(QRStager.this, MainMenu.class);
                                startActivity(intent);
                            }
                        }
                );
            }

}