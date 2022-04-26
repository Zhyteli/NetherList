package com.example.netherlist;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ImageView;

public class AdsItem extends AppCompatActivity {
    private int position = 0;
    ImageView imageItem;
    Ads ads;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads_item);
        recIntent();

    }
    private void init(){
        imageItem.findViewById(R.id.imageItem);

    }
    private void recIntent(){
        Intent i = getIntent();
        if(i != null){
            position = i.getIntExtra("position",0);
        }
        switch (position){
            case 0:
                //imageItem.setImageResource(R.drawable.image);
                //ads.setPrice();
        }
    }
}