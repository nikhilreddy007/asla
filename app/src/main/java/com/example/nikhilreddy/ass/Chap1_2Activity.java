package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Chap1_2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap1_2);

        final CardView chap1_2_1Card = (CardView) findViewById(R.id.chap1_2_1Card);
        final CardView chap1_2_2Card = (CardView) findViewById(R.id.chap1_2_2Card);
        final CardView chap1_2_3Card = (CardView) findViewById(R.id.chap1_2_3Card);
        final CardView chap1_2_4Card = (CardView) findViewById(R.id.chap1_2_4Card);

        chap1_2_1Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap1_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",1_2_1);
                startActivity(display_intent);
            }
        });
        chap1_2_2Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap1_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",1_2_2);
                startActivity(display_intent);
            }
        });
        chap1_2_3Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap1_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",1_2_3);
                startActivity(display_intent);
            }
        });
        chap1_2_4Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap1_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",1_2_4);
                startActivity(display_intent);
            }
        });
    }
}
