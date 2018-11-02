package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Chap1_1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap1_1);

        final CardView chap1_1_1Card = (CardView) findViewById(R.id.chap1_1_1Card);
        final CardView chap1_1_2Card = (CardView) findViewById(R.id.chap1_1_2Card);
        //final CardView chap1_1_3Card = (CardView) findViewById(R.id.chap1_1_3Card);
        final CardView chap1_1_4Card = (CardView) findViewById(R.id.chap1_1_4Card);
        final CardView chap1_1_5Card = (CardView) findViewById(R.id.chap1_1_5Card);
        final CardView chap1_1_6Card = (CardView) findViewById(R.id.chap1_1_6Card);
        final CardView chap1_1_7Card = (CardView) findViewById(R.id.chap1_1_7Card);

        chap1_1_1Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap1_1Activity.this, displayContent.class);
                display_intent.putExtra("topic",1_1_1);
                startActivity(display_intent);
            }
        });
        chap1_1_2Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap1_1Activity.this, displayContent.class);
                display_intent.putExtra("topic",1_1_2);
                startActivity(display_intent);
            }
        });
//        chap1_1_3Card.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                final Intent display_intent = new Intent(Chap1_1Activity.this, displayContent.class);
//                display_intent.putExtra("topic",1_1_3);
//                startActivity(display_intent);
//            }
//        });
        chap1_1_4Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap1_1Activity.this, displayContent.class);
                display_intent.putExtra("topic",1_1_4);
                startActivity(display_intent);
            }
        });
        chap1_1_5Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap1_1Activity.this, displayContent.class);
                display_intent.putExtra("topic",1_1_5);
                startActivity(display_intent);
            }
        });
        chap1_1_6Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap1_1Activity.this, displayContent.class);
                display_intent.putExtra("topic",1_1_6);
                startActivity(display_intent);
            }
        });
        chap1_1_7Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap1_1Activity.this, displayContent.class);
                display_intent.putExtra("topic",1_1_7);
                startActivity(display_intent);
            }
        });
    }
}
