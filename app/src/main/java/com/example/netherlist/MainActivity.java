package com.example.netherlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Ads> ads = new ArrayList<Ads>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitData();
        RecyclerView recyclerView = findViewById(R.id.list);

        AdsAdapter.OnAdsClickListener adsClickListener = new AdsAdapter.OnAdsClickListener() {
            @Override
            public void onAdsClick(Ads ads, int position) {
                Intent intent = new Intent(MainActivity.this, AdsItem.class);
                intent.putExtra("position", position);
                startActivity(intent);

            }
        };
        AdsAdapter adsAdapter = new AdsAdapter(this, ads, adsClickListener);
        recyclerView.setAdapter(adsAdapter);
    }
    private void setInitData(){
        ads.add(new Ads("Видовая квартира 2- х комнатная 54 м.кв.ЖК Терракота Владелец","7400" , "0673263088",
                "Продам по переуступке видовую квартиру в ЖК Терракота. Сдача дома(ключи) март 2022.\n" +
                        "Метро ВИРЛИЦЯ 6 минут пешком.\n" +
                        "!!!Переуступка включена в стоимость!!!\n" +
                        "Стоимость без комиссии. Владелец.\n" +
                        "\n" +
                        "Квартира 54 м.кв.:\n" +
                        "- большая кухня-гостинная студия\n" +
                        "- 2 большие спальни\n" +
                        "- большой смежный санузел\n" +
                        "- панорамные окна Запад -Север выходят на церковь и улицу Черниговскую\n" +
                        "- 17 этаж из 23" ,R.drawable.image));
    }

    public void massage(View view) {
       EditText userName = findViewById(R.id.userName);
       EditText userPrice = findViewById(R.id.userPrice);
       EditText userContact = findViewById(R.id.userContactEdit);
       EditText userDescription = findViewById(R.id.userDescription);

       String userNameText = userName.getText().toString();
       String userPriceText = userPrice.getText().toString();
       String userContactText = userContact.getText().toString();
       String userDescriptionText = userDescription.getText().toString();
       if(!userNameText.isEmpty() && !userPriceText.isEmpty() && !userContactText.isEmpty() && !userDescriptionText.isEmpty()){
           ads.add(new Ads(userNameText,userPriceText,userContactText,userDescriptionText,R.drawable.image));
       }
       else Toast.makeText(getApplicationContext(), "Вы не заполнели все пункты", Toast.LENGTH_LONG).show();
    }
}