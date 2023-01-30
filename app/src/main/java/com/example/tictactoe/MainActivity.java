package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //0- represents X
    //1- represents O


    int activevariable =0;
    int[] gamestate = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    // Game state representations
    // 1=O
    //0=X
    //2=NULL OR BLANK
    int [][] Winpos = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};

    public void playerTab(View view){
        ImageView img = (ImageView) view;
        int taggedImg = Integer.parseInt(img.getTag().toString());
        if(gamestate[taggedImg] == 2){
            gamestate[taggedImg]= activevariable;
            img.setTranslationY(-1000f);
            if(activevariable==0){
                img.setImageResource(R.drawable.xsign);
                activevariable=1;
            }
            else{
                img.setImageResource(R.drawable.sign);
                activevariable=0;
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}