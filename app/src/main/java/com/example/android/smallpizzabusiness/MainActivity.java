package com.example.android.smallpizzabusiness;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //https://developers.google.com/maps/documentation/urls/android-intents
    //a intent which opens the the pizzeria location
    public void openAddress(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=76 Bulevardul Brașovului,Săcele, Brașov");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }


    // a intent which opens phone app with the number in it
    public void phoneCall(View view) {
        Intent calllIntent = new Intent(Intent.ACTION_DIAL);
        calllIntent.setData(Uri.parse("tel:0268 274 131"));
        startActivity(calllIntent);
    }

    // a intent which opens the pizzeria website on default web browser
    public void openWebsite(View view) {
        String url = "https://carta.ro/restaurante-sacele/restaurantul-pizza-bella";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}

