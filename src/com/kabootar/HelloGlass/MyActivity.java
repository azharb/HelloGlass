package com.kabootar.HelloGlass;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.google.android.glass.app.Card;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a card with some simple text and a footer.
        Card card1 = new Card(getApplicationContext());
        card1.setText("Oh hello, Glass!");
        card1.setInfo("Look at you - GDKing like a baws!");
        View card1View = card1.toView();


        setContentView(card1View);
    }
}
