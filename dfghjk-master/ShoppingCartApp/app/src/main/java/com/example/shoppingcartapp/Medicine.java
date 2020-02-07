package com.example.shoppingcartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Medicine extends AppCompatActivity {

    Intent toCart;
    Intent main;

    int numMed1 = 0;
    int numMed2 = 0;
    int numMed3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cereal);
        toCart = new Intent(this, Shopping_Cart.class);
        main = new Intent(this, MainActivity.class);
    }


    public void cheerioisOnClick(View view) {
        numMed1++;

    }

    public void DynoBytesOnClick(View view) {
        numMed2++;

    }

    public void CaptainCrunchOnClick(View view) {
        numMed3++;

    }

    public void onClick(View view) {
        startActivity(main);
        toCart.putExtra("Medicine1", numMed1);
        main.putExtra("Medicine1", numMed1);
        toCart.putExtra("Medicine2", numMed2);
        main.putExtra("Medicine2", numMed2);
        toCart.putExtra("Medicine3", numMed3);
        main.putExtra("Medicine3", numMed3);
    }

    public void onClick2(View view) {
        startActivity(toCart);
        toCart.putExtra("Medicine1", numMed1);
        main.putExtra("Medicine1", numMed1);
        toCart.putExtra("Medicine2", numMed2);
        main.putExtra("Medicine2", numMed2);
        toCart.putExtra("Medicine3", numMed3);
        main.putExtra("Medicine3", numMed3);
    }
}
