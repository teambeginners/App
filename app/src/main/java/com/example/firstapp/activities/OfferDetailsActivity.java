package com.example.firstapp.activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;


public class OfferDetailsActivity extends AppCompatActivity {


    Toolbar tool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer_details);

        tool = findViewById(R.id.offerDetailsToolbar);

        setSupportActionBar(tool);

        Intent intent = getIntent();

        String proname = intent.getStringExtra("cName");

        ((TextView)findViewById(R.id.namePro)).setText(proname);


        String det = intent.getStringExtra("bDetails");
        ((TextView) findViewById(R.id.offerDetails)).setText(det);

        String categ = intent.getStringExtra("cate");
        ((TextView) findViewById(R.id.detailsCategory)).setText(categ);

        Bitmap bitmap = intent.getParcelableExtra("picture");
        ((ImageView) findViewById(R.id.proImage)).setImageBitmap(bitmap);
    }

}
