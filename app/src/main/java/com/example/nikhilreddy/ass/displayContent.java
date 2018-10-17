package com.example.nikhilreddy.ass;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
        final TextView matterText3 = (TextView) findViewById(R.id.matter_textview3);
        final TextView matterText4 = (TextView) findViewById(R.id.matter_textview4);
        final TextView matterText5 = (TextView) findViewById(R.id.matter_textview5);
        final TextView matterText6 = (TextView) findViewById(R.id.matter_textview6);
        final TextView matterText7 = (TextView) findViewById(R.id.matter_textview7);
        final TextView matterText8 = (TextView) findViewById(R.id.matter_textview8);
        final ImageView image1 = (ImageView) findViewById(R.id.image_view1);
        final ImageView image2 = (ImageView) findViewById(R.id.image_view2);
        final ImageView image3 = (ImageView) findViewById(R.id.image_view3);
        final ImageView image4 = (ImageView) findViewById(R.id.image_view4);
        final ImageView image5 = (ImageView) findViewById(R.id.image_view5);
        final ImageView image6 = (ImageView) findViewById(R.id.image_view6);
        final ImageView image7 = (ImageView) findViewById(R.id.image_view7);
        final ImageView image8 = (ImageView) findViewById(R.id.image_view8);

        String str = "_" + Integer.toString(topic);
        if ((getResources().getIdentifier(str +"_t", "string", this.getPackageName())) != 0) {
            titleText.setText(getResources().getIdentifier(str +"_t", "string", this.getPackageName()));
        }

        if ((getResources().getIdentifier(str + "_m1", "string", this.getPackageName())) != 0) {
            matterText1.setText(getResources().getIdentifier(str + "_m1", "string", this.getPackageName()));
            matterText1.setVisibility(View.VISIBLE);
        }
        if ((getResources().getIdentifier(str + "_m2", "string", this.getPackageName())) != 0) {
            matterText2.setText(getResources().getIdentifier(str + "_m2", "string", this.getPackageName()));
            matterText2.setVisibility(View.VISIBLE);
        }
        if ((getResources().getIdentifier(str + "_m3", "string", this.getPackageName())) != 0) {
            matterText3.setText(getResources().getIdentifier(str + "_m3", "string", this.getPackageName()));
            matterText3.setVisibility(View.VISIBLE);
        }
        if ((getResources().getIdentifier(str + "_m4", "string", this.getPackageName())) != 0) {
            matterText4.setText(getResources().getIdentifier(str + "_m4", "string", this.getPackageName()));
            matterText4.setVisibility(View.VISIBLE);
        }
        if ((getResources().getIdentifier(str + "_m5", "string", this.getPackageName())) != 0) {
            matterText5.setText(getResources().getIdentifier(str + "_m5", "string", this.getPackageName()));
            matterText5.setVisibility(View.VISIBLE);
        }
        if ((getResources().getIdentifier(str + "_m6", "string", this.getPackageName())) != 0) {
            matterText6.setText(getResources().getIdentifier(str + "_m6", "string", this.getPackageName()));
            matterText6.setVisibility(View.VISIBLE);
        }
        if ((getResources().getIdentifier(str + "_m7", "string", this.getPackageName())) != 0) {
            matterText7.setText(getResources().getIdentifier(str + "_m7", "string", this.getPackageName()));
            matterText7.setVisibility(View.VISIBLE);
        }
        if ((getResources().getIdentifier(str + "_m8", "string", this.getPackageName())) != 0) {
            matterText8.setText(getResources().getIdentifier(str + "_m8", "string", this.getPackageName()));
            matterText8.setVisibility(View.VISIBLE);
        }

        if ((getResources().getIdentifier(str + "_i1", "drawable", this.getPackageName())) != 0) {
            image1.setImageResource(getResources().getIdentifier(str + "_i1", "drawable", this.getPackageName()));
            image1.setVisibility(View.VISIBLE);
        }
        if ((getResources().getIdentifier(str + "_i2", "drawable", this.getPackageName())) != 0) {
            image2.setImageResource(getResources().getIdentifier(str + "_i2", "drawable", this.getPackageName()));
            image2.setVisibility(View.VISIBLE);
        }
        if ((getResources().getIdentifier(str + "_i3", "drawable", this.getPackageName())) != 0) {
            image3.setImageResource(getResources().getIdentifier(str + "_i3", "drawable", this.getPackageName()));
            image3.setVisibility(View.VISIBLE);
        }
        if ((getResources().getIdentifier(str + "_i4", "drawable", this.getPackageName())) != 0) {
            image4.setImageResource(getResources().getIdentifier(str + "_i4", "drawable", this.getPackageName()));
            image4.setVisibility(View.VISIBLE);
        }
        if ((getResources().getIdentifier(str + "_i5", "drawable", this.getPackageName())) != 0) {
            image5.setImageResource(getResources().getIdentifier(str + "_i5", "drawable", this.getPackageName()));
            image5.setVisibility(View.VISIBLE);
        }
        if ((getResources().getIdentifier(str + "_i6", "drawable", this.getPackageName())) != 0) {
            image6.setImageResource(getResources().getIdentifier(str + "_i6", "drawable", this.getPackageName()));
            image6.setVisibility(View.VISIBLE);
        }
        if ((getResources().getIdentifier(str + "_i7", "drawable", this.getPackageName())) != 0) {
            image7.setImageResource(getResources().getIdentifier(str + "_i7", "drawable", this.getPackageName()));
            image7.setVisibility(View.VISIBLE);
        }
        if ((getResources().getIdentifier(str + "_i8", "drawable", this.getPackageName())) != 0) {
            image8.setImageResource(getResources().getIdentifier(str + "_i8", "drawable", this.getPackageName()));
            image8.setVisibility(View.VISIBLE);
        }
    }
}