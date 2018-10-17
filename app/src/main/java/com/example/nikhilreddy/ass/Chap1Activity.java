package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Chap1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap1);

        final CardView chap1_1Card = (CardView) findViewById(R.id.chap1_1Card);
        final CardView chap1_2Card = (CardView) findViewById(R.id.chap1_2Card);

        final Intent chap1_1_intent = new Intent(this, Chap1_1Activity.class);
        final Intent chap1_2_intent = new Intent(this, Chap1_2Activity.class);

        chap1_1Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(chap1_1_intent);
            }
        });
        chap1_2Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(chap1_2_intent);
            }
        });
    }
}
