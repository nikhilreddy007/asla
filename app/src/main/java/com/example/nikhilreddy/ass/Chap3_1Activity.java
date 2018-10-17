package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Chap3_1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap3_1);

        final CardView chap3_1_1Card = (CardView) findViewById(R.id.chap3_1_1Card);
        final CardView chap3_1_2Card = (CardView) findViewById(R.id.chap3_1_2Card);

        chap3_1_1Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap3_1Activity.this, displayContent.class);
                display_intent.putExtra("topic",3_1_1);
                startActivity(display_intent);
            }
        });
        chap3_1_2Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent chap3_1_2_intent = new Intent(Chap3_1Activity.this, Chap3_1_2Activity.class);
                startActivity(chap3_1_2_intent);
            }
        });
    }
}
