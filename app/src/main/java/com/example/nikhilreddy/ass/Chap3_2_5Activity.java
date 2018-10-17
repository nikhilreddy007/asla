package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Chap3_2_5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap3_2_5);

        final CardView chap3_2_5_0Card = (CardView) findViewById(R.id.chap3_2_5_0Card);
        final CardView chap3_2_5_1Card = (CardView) findViewById(R.id.chap3_2_5_1Card);
        final CardView chap3_2_5_2Card = (CardView) findViewById(R.id.chap3_2_5_2Card);

        chap3_2_5_0Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap3_2_5Activity.this, displayContent.class);
                display_intent.putExtra("topic",3_2_5_0);
                startActivity(display_intent);
            }
        });
        chap3_2_5_1Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap3_2_5Activity.this, displayContent.class);
                display_intent.putExtra("topic",3_2_5_1);
                startActivity(display_intent);
            }
        });
        chap3_2_5_2Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap3_2_5Activity.this, displayContent.class);
                display_intent.putExtra("topic",3_2_5_2);
                startActivity(display_intent);
            }
        });
    }
}
