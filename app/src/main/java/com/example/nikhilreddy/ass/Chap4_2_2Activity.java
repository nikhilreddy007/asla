package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Chap4_2_2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap4_2_2);

        final CardView chap4_2_2_1Card = (CardView) findViewById(R.id.chap4_2_2_1Card);
        final CardView chap4_2_2_2Card = (CardView) findViewById(R.id.chap4_2_2_2Card);
        final CardView chap4_2_2_3Card = (CardView) findViewById(R.id.chap4_2_2_3Card);
        final CardView chap4_2_2_4Card = (CardView) findViewById(R.id.chap4_2_2_4Card);
        final CardView chap4_2_2_5Card = (CardView) findViewById(R.id.chap4_2_2_5Card);
        final CardView chap4_2_2_6Card = (CardView) findViewById(R.id.chap4_2_2_6Card);
        final CardView chap4_2_2_7Card = (CardView) findViewById(R.id.chap4_2_2_7Card);
        final CardView chap4_2_2_8Card = (CardView) findViewById(R.id.chap4_2_2_8Card);
        final CardView chap4_2_2_9Card = (CardView) findViewById(R.id.chap4_2_2_9Card);
        final CardView chap4_2_2_10Card = (CardView) findViewById(R.id.chap4_2_2_10Card);
        final CardView chap4_2_2_11Card = (CardView) findViewById(R.id.chap4_2_2_11Card);
        final CardView chap4_2_2_12Card = (CardView) findViewById(R.id.chap4_2_2_12Card);
        final CardView chap4_2_2_13Card = (CardView) findViewById(R.id.chap4_2_2_13Card);

        chap4_2_2_1Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_2_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_2_2_1);
                startActivity(display_intent);
            }
        });
        chap4_2_2_2Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_2_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_2_2_2);
                startActivity(display_intent);
            }
        });
        chap4_2_2_3Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_2_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_2_2_3);
                startActivity(display_intent);
            }
        });
        chap4_2_2_4Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_2_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_2_2_4);
                startActivity(display_intent);
            }
        });
        chap4_2_2_5Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_2_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_2_2_5);
                startActivity(display_intent);
            }
        });
        chap4_2_2_6Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_2_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_2_2_6);
                startActivity(display_intent);
            }
        });
        chap4_2_2_7Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_2_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_2_2_7);
                startActivity(display_intent);
            }
        });
        chap4_2_2_8Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_2_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_2_2_8);
                startActivity(display_intent);
            }
        });
        chap4_2_2_9Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_2_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_2_2_9);
                startActivity(display_intent);
            }
        });
        chap4_2_2_10Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_2_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_2_2_10);
                startActivity(display_intent);
            }
        });
        chap4_2_2_11Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_2_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_2_2_11);
                startActivity(display_intent);
            }
        });
        chap4_2_2_12Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_2_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_2_2_12);
                startActivity(display_intent);
            }
        });
        chap4_2_2_13Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_2_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_2_2_13);
                startActivity(display_intent);
            }
        });
    }
}
