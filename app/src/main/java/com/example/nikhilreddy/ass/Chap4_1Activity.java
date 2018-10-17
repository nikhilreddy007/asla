package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Chap4_1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap4_1);

        final CardView chap4_1_1Card = (CardView) findViewById(R.id.chap4_1_1Card);
        final CardView chap4_1_2Card = (CardView) findViewById(R.id.chap4_1_2Card);
        final CardView chap4_1_3Card = (CardView) findViewById(R.id.chap4_1_3Card);
        final CardView chap4_1_4Card = (CardView) findViewById(R.id.chap4_1_4Card);
        final CardView chap4_1_5Card = (CardView) findViewById(R.id.chap4_1_5Card);

        chap4_1_1Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_1Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_1_1);
                startActivity(display_intent);
            }
        });
        chap4_1_2Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_1Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_1_2);
                startActivity(display_intent);
            }
        });
        chap4_1_3Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_1Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_1_3);
                startActivity(display_intent);
            }
        });
        chap4_1_4Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_1Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_1_4);
                startActivity(display_intent);
            }
        });
        chap4_1_5Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_1Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_1_5);
                startActivity(display_intent);
            }
        });
    }
}
