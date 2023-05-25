package com.example.miraiappv2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;



public class VC_MainActivity extends AppCompatActivity {

    private ImageButton romanji;
    private  ImageButton Menu;

    private ImageButton kana;
    String language = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Removes the Title bar from the top of the application for all screens
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        //set the view
        setContentView(R.layout.activity_vc_main);

        //buttons
        romanji = (ImageButton) findViewById(R.id.RomanjiButton);
        kana = (ImageButton) findViewById(R.id.KanaButton);
        Menu = (ImageButton) findViewById(R.id.MenuBack);



        romanji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (romanji.isPressed()){
                    romanji.setImageResource(R.drawable.romanjipressed);
                    language = "romaji_questions.json";
                    Intent intent = new Intent(getApplicationContext(), VC_TopicActivity.class);
                    intent.putExtra("language",language);
                    startActivity(intent);
                    //openTopicActivity();
                }
            }
        });
        kana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kana.isPressed()){
                    kana.setImageResource(R.drawable.kanapressed);
                    kana.setImageResource(R.drawable.kanapressed);
                    language = "kana_questions.json";
                    Intent intent = new Intent(getApplicationContext(), VC_TopicActivity.class);
                    intent.putExtra("language",language);
                    startActivity(intent);


                }
            }
        });
        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Menu.isPressed()){
                    openMainActivity();
                }
            }
        });

    }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}