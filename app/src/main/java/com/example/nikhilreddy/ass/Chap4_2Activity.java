package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Chap4_2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap4_2);

        final CardView chap4_2_1Card = (CardView) findViewById(R.id.chap4_2_1Card);
        final CardView chap4_2_2Card = (CardView) findViewById(R.id.chap4_2_2Card);
        final CardView chap4_2_3Card = (CardView) findViewById(R.id.chap4_2_3Card);

        chap4_2_1Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_2_1);
                startActivity(display_intent);
            }
        });
        chap4_2_2Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent chap4_2_2_intent = new Intent(Chap4_2Activity.this, Chap4_2_2Activity.class);
                startActivity(chap4_2_2_intent);
            }
        });
        chap4_2_3Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_2Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_2_3);
                startActivity(display_intent);
            }
        });
    }
}
