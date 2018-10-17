package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Chap2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap2);

        final CardView chap2_1Card = (CardView) findViewById(R.id.chap2_1Card);
        final CardView chap2_2Card = (CardView) findViewById(R.id.chap2_2Card);
        final CardView chap2_3Card = (CardView) findViewById(R.id.chap2_3Card);

        final Intent chap2_1_intent = new Intent(this, Chap2_1Activity.class);
        final Intent chap2_2_intent = new Intent(this, Chap2_2Activity.class);
        final Intent chap2_3_intent = new Intent(this, Chap2_3Activity.class);

        chap2_1Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(chap2_1_intent);
            }
        });
        chap2_2Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(chap2_2_intent);
            }
        });
        chap2_3Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(chap2_3_intent);
            }
        });
    }
}
