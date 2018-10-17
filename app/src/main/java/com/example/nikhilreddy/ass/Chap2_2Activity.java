package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Chap2_2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap2_2);

        final CardView Chap2_2_1Card = (CardView) findViewById(R.id.chap2_2_1Card);
        final CardView Chap2_2_2Card = (CardView) findViewById(R.id.chap2_2_2Card);
        final CardView Chap2_2_3Card = (CardView) findViewById(R.id.chap2_2_3Card);
        final CardView Chap2_2_4Card = (CardView) findViewById(R.id.chap2_2_4Card);

        Chap2_2_1Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap2_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",2_2_1);
                startActivity(display_intent);
            }
        });
        Chap2_2_2Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap2_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",2_2_2);
                startActivity(display_intent);
            }
        });
        Chap2_2_3Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap2_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",2_2_3);
                startActivity(display_intent);
            }
        });
        Chap2_2_4Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap2_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",2_2_4);
                startActivity(display_intent);
            }
        });
    }
}
