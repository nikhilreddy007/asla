package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Chap5_1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap5_1);

        final CardView chap5_1_1Card = (CardView) findViewById(R.id.chap5_1_1Card);
        final CardView chap5_1_2Card = (CardView) findViewById(R.id.chap5_1_2Card);
        final CardView chap5_1_3Card = (CardView) findViewById(R.id.chap5_1_3Card);

        chap5_1_1Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap5_1Activity.this, displayContent.class);
                display_intent.putExtra("topic",5_1_1);
                startActivity(display_intent);
            }
        });
        chap5_1_2Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap5_1Activity.this, displayContent.class);
                display_intent.putExtra("topic",5_1_2);
                startActivity(display_intent);
            }
        });
        chap5_1_3Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap5_1Activity.this, displayContent.class);
                display_intent.putExtra("topic",5_1_3);
                startActivity(display_intent);
            }
        });
    }
}
