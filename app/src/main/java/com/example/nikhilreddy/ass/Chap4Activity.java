package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Chap4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap4);

        final CardView chap4_1Card = (CardView) findViewById(R.id.chap4_1Card);
        final CardView chap4_2Card = (CardView) findViewById(R.id.chap4_2Card);
        final CardView chap4_3Card = (CardView) findViewById(R.id.chap4_3Card);

        final Intent chap4_1_intent = new Intent(this, Chap4_1Activity.class);
        final Intent chap4_2_intent = new Intent(this, Chap4_2Activity.class);
        final Intent chap4_3_intent = new Intent(this, Chap4_3Activity.class);

        chap4_1Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(chap4_1_intent);
            }
        });
        chap4_2Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(chap4_2_intent);
            }
        });
        chap4_3Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(chap4_3_intent);
            }
        });
    }
}
