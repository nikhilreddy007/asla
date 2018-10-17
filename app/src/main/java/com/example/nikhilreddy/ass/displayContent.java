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

        int topic;
        topic = getIntent().getIntExtra("topic", 0);

        final TextView titleText = (TextView) findViewById(R.id.title_textview);
        final TextView matterText1 = (TextView) findViewById(R.id.matter_textview1);
        final TextView matterText2 = (TextView) findViewById(R.id.matter_textview2);
        final ImageView image1 = (ImageView) findViewById(R.id.image_view1);
        final ImageView image2 = (ImageView) findViewById(R.id.image_view2);

        String str = "_" + Integer.toString(topic);
        if ((getResources().getIdentifier(str +"_t", "string", this.getPackageName())) != 0)
            titleText.setText(getResources().getIdentifier(str +"_t", "string", this.getPackageName()));
        if ((getResources().getIdentifier(str + "_m1", "string", this.getPackageName())) != 0)
            matterText1.setText(getResources().getIdentifier(str + "_m1", "string", this.getPackageName()));
        if ((getResources().getIdentifier(str + "_m2", "string", this.getPackageName())) != 0)
            matterText2.setText(getResources().getIdentifier(str + "_m2", "string", this.getPackageName()));
        if ((getResources().getIdentifier(str + "_i1", "drawable", this.getPackageName())) != 0)
            image1.setImageResource(getResources().getIdentifier(str + "_i1", "drawable", this.getPackageName()));
        if ((getResources().getIdentifier(str + "_i2", "drawable", this.getPackageName())) != 0)
            image2.setImageResource(getResources().getIdentifier(str + "_i2", "drawable", this.getPackageName()));
    }
}