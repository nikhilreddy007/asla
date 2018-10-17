package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Chap5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap5);

        final CardView chap5_1Card = (CardView) findViewById(R.id.chap5_1Card);
        final CardView chap5_2Card = (CardView) findViewById(R.id.chap5_2Card);

        chap5_1Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent chap5_1_intent = new Intent(Chap5Activity.this, Chap5_1Activity.class);
                startActivity(chap5_1_intent);
            }
        });
        chap5_2Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent chap5_2_intent = new Intent(Chap5Activity.this, Chap5_2Activity.class);
                startActivity(chap5_2_intent);
            }
        });
    }
}
