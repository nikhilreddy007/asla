package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Chap3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap3);

        final CardView chap3_1Card = (CardView) findViewById(R.id.chap3_1Card);
        final CardView chap3_2Card = (CardView) findViewById(R.id.chap3_2Card);

        final Intent chap3_1_intent = new Intent(this, Chap3_1Activity.class);
        final Intent chap3_2_intent = new Intent(this, Chap3_2Activity.class);

        chap3_1Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(chap3_1_intent);
            }
        });
        chap3_2Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(chap3_2_intent);
            }
        });
    }
}
