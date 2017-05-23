package com.example.jsura.singlescreenapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openWebPage(View view){
        String url="http://www.czeremosz.pl";
        Uri webpage=Uri.parse(url);
        Intent i=new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(i);

    }

    public void openCallMenu(View view){
        String phoneNumber="5666777888";
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
    public void openMaps(View view){
        String name="Czarny Czeremosz";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("geo:0,0?q=37.423156,-122.084917 (" + name + ")"));
        startActivity(intent);

    }

}
