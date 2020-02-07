package com.example.shoppingcartapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Shopping_Cart extends AppCompatActivity {


    public TextView Cart;
    Bundle cartContents = new Bundle();

    public String cartDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping__cart);
        Cart = findViewById(R.id.Cart);
        //Bundle cartContents = getIntent().getExtras();
        Intent cart = getIntent();
        if (cart != null) {
            cartContents = cart.getExtras();
            //i = cartContents.getInt("Cheerios");
            for (String key: cartContents.keySet()) {
                cartDisplay += key + ": " + cartContents.getInt(key, 0) + "\n";
            }

            }
        Cart.setText(cartDisplay);

    }





    @NonNull
    @Override
    public java.lang.String toString() {
        return super.toString();
    }

    public void menuonClick(View view) {
        Intent menu = new Intent(this, MainActivity.class);
        startActivity(menu);
    }
}
