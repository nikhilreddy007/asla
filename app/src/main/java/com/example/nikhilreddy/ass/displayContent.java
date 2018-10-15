package com.example.nikhilreddy.ass;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class displayContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_content);

        int chapter, topic;
        chapter = getIntent().getIntExtra("chapter", 1);
        topic = getIntent().getIntExtra("topic", 1);
        Log.i("values", Integer.toString(chapter));
        Log.i("values", Integer.toString(topic));

        final TextView titleText = (TextView) findViewById(R.id.title_textview);
        final TextView matterText = (TextView) findViewById(R.id.matter_textview);
        final ImageView image = (ImageView) findViewById(R.id.image_view);

        String str = Integer.toString(chapter) + "_" + Integer.toString(topic);
        if ((getResources().getIdentifier("t" + str, "string", this.getPackageName())) != 0)
            titleText.setText(getResources().getIdentifier("t" + str, "string", this.getPackageName()));
        if ((getResources().getIdentifier("m" + str, "string", this.getPackageName())) != 0)
            matterText.setText(getResources().getIdentifier("m" + str, "string", this.getPackageName()));
        if ((getResources().getIdentifier("i" + str, "drawable", this.getPackageName())) != 0)
            image.setImageResource(getResources().getIdentifier("i" + str, "drawable", this.getPackageName()));
    }
}