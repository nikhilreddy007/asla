package com.example.nikhilreddy.ass;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import pl.polidea.view.ZoomView;

public class displayContent extends AppCompatActivity {
//    private float mScale = 1f;
//    private ScaleGestureDetector mScaleDetector;
//    GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_content);


//        gestureDetector = new GestureDetector(this, new GestureListener());
//        mScaleDetector = new ScaleGestureDetector(this, new ScaleGestureDetector.SimpleOnScaleGestureListener()
//        {
//            @Override
//            public boolean onScale(ScaleGestureDetector detector)
//            {
//                float scale = 1 - detector.getScaleFactor();
//
//                float prevScale = mScale;
//                mScale += scale;
//
//                if (mScale < 0.1f) // Minimum scale condition:
//                    mScale = 0.1f;
//
//                if (mScale > 1f) // Maximum scale condition:
//                    mScale = 1f;
//                ScaleAnimation scaleAnimation = new ScaleAnimation(1f / prevScale, 1f / mScale, 1f / prevScale, 1f / mScale, detector.getFocusX(), detector.getFocusY());
//                scaleAnimation.setDuration(0);
//                scaleAnimation.setFillAfter(true);
//                ScrollView layout =(ScrollView) findViewById(R.id.zoom_scrollview);
//                layout.startAnimation(scaleAnimation);
//                return true;
//            }
//        });
        final ZoomLinearLayout zoomLinearLayout = (ZoomLinearLayout) findViewById(R.id.zoom_linear_layout);
        zoomLinearLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                zoomLinearLayout.init(displayContent.this);
                return false;
            }
        });

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
        final TextView matterText9 = (TextView) findViewById(R.id.matter_textview9);
        final TextView matterText10 = (TextView) findViewById(R.id.matter_textview10);
        final TextView matterText11 = (TextView) findViewById(R.id.matter_textview11);
        final TextView matterText12 = (TextView) findViewById(R.id.matter_textview12);
        final TextView matterText13 = (TextView) findViewById(R.id.matter_textview13);
        final TextView matterText14 = (TextView) findViewById(R.id.matter_textview14);
        final TextView matterText15 = (TextView) findViewById(R.id.matter_textview15);
        final TextView matterText16 = (TextView) findViewById(R.id.matter_textview16);
        final ImageView image1 = (ImageView) findViewById(R.id.image_view1);
        final ImageView image2 = (ImageView) findViewById(R.id.image_view2);
        final ImageView image3 = (ImageView) findViewById(R.id.image_view3);
        final ImageView image4 = (ImageView) findViewById(R.id.image_view4);
        final ImageView image5 = (ImageView) findViewById(R.id.image_view5);
        final ImageView image6 = (ImageView) findViewById(R.id.image_view6);
        final ImageView image7 = (ImageView) findViewById(R.id.image_view7);
        final ImageView image8 = (ImageView) findViewById(R.id.image_view8);
        final ImageView image9 = (ImageView) findViewById(R.id.image_view9);
        final ImageView image10 = (ImageView) findViewById(R.id.image_view10);
        final ImageView image11 = (ImageView) findViewById(R.id.image_view11);
        final ImageView image12 = (ImageView) findViewById(R.id.image_view12);
        final ImageView image13 = (ImageView) findViewById(R.id.image_view13);
        final ImageView image14 = (ImageView) findViewById(R.id.image_view14);
        final ImageView image15 = (ImageView) findViewById(R.id.image_view15);
        final ImageView image16 = (ImageView) findViewById(R.id.image_view16);

        if(topic != 512) {
            String str = "_" + Integer.toString(topic);
            if ((getResources().getIdentifier(str + "_t", "string", this.getPackageName())) != 0) {
                titleText.setText(getResources().getIdentifier(str + "_t", "string", this.getPackageName()));
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
        } else {
            if ((getResources().getIdentifier("_512_t", "string", this.getPackageName())) != 0) {
                titleText.setText(getResources().getIdentifier("_512_t", "string", this.getPackageName()));
            }

            if ((getResources().getIdentifier("_512_m1", "string", this.getPackageName())) != 0) {
                matterText1.setText(getResources().getIdentifier("_512_m1", "string", this.getPackageName()));
                matterText1.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_m2", "string", this.getPackageName())) != 0) {
                matterText2.setText(getResources().getIdentifier("_512_m2", "string", this.getPackageName()));
                matterText2.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_m3", "string", this.getPackageName())) != 0) {
                matterText3.setText(getResources().getIdentifier("_512_m3", "string", this.getPackageName()));
                matterText3.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_m4", "string", this.getPackageName())) != 0) {
                matterText4.setText(getResources().getIdentifier("_512_m4", "string", this.getPackageName()));
                matterText4.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_m5", "string", this.getPackageName())) != 0) {
                matterText5.setText(getResources().getIdentifier("_512_m5", "string", this.getPackageName()));
                matterText5.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_m6", "string", this.getPackageName())) != 0) {
                matterText6.setText(getResources().getIdentifier("_512_m6", "string", this.getPackageName()));
                matterText6.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_m7", "string", this.getPackageName())) != 0) {
                matterText7.setText(getResources().getIdentifier("_512_m7", "string", this.getPackageName()));
                matterText7.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_m8", "string", this.getPackageName())) != 0) {
                matterText8.setText(getResources().getIdentifier("_512_m8", "string", this.getPackageName()));
                matterText8.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_m9", "string", this.getPackageName())) != 0) {
                matterText9.setText(getResources().getIdentifier("_512_m9", "string", this.getPackageName()));
                matterText9.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_m10", "string", this.getPackageName())) != 0) {
                matterText10.setText(getResources().getIdentifier("_512_m10", "string", this.getPackageName()));
                matterText10.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_m11", "string", this.getPackageName())) != 0) {
                matterText11.setText(getResources().getIdentifier("_512_m11", "string", this.getPackageName()));
                matterText11.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_m12", "string", this.getPackageName())) != 0) {
                matterText12.setText(getResources().getIdentifier("_512_m12", "string", this.getPackageName()));
                matterText12.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_m13", "string", this.getPackageName())) != 0) {
                matterText13.setText(getResources().getIdentifier("_512_m13", "string", this.getPackageName()));
                matterText13.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_m14", "string", this.getPackageName())) != 0) {
                matterText14.setText(getResources().getIdentifier("_512_m14", "string", this.getPackageName()));
                matterText14.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_m15", "string", this.getPackageName())) != 0) {
                matterText15.setText(getResources().getIdentifier("_512_m15", "string", this.getPackageName()));
                matterText15.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_m16", "string", this.getPackageName())) != 0) {
                matterText16.setText(getResources().getIdentifier("_512_m16", "string", this.getPackageName()));
                matterText16.setVisibility(View.VISIBLE);
            }

            if ((getResources().getIdentifier("_512_i1", "drawable", this.getPackageName())) != 0) {
                image1.setImageResource(getResources().getIdentifier("_512_i1", "drawable", this.getPackageName()));
                image1.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_i2", "drawable", this.getPackageName())) != 0) {
                image2.setImageResource(getResources().getIdentifier("_512_i2", "drawable", this.getPackageName()));
                image2.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_i3", "drawable", this.getPackageName())) != 0) {
                image3.setImageResource(getResources().getIdentifier("_512_i3", "drawable", this.getPackageName()));
                image3.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_i4", "drawable", this.getPackageName())) != 0) {
                image4.setImageResource(getResources().getIdentifier("_512_i4", "drawable", this.getPackageName()));
                image4.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_i5", "drawable", this.getPackageName())) != 0) {
                image5.setImageResource(getResources().getIdentifier("_512_i5", "drawable", this.getPackageName()));
                image5.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_i6", "drawable", this.getPackageName())) != 0) {
                image6.setImageResource(getResources().getIdentifier("_512_i6", "drawable", this.getPackageName()));
                image6.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_i7", "drawable", this.getPackageName())) != 0) {
                image7.setImageResource(getResources().getIdentifier("_512_i7", "drawable", this.getPackageName()));
                image7.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_i8", "drawable", this.getPackageName())) != 0) {
                image8.setImageResource(getResources().getIdentifier("_512_i8", "drawable", this.getPackageName()));
                image8.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_i9", "drawable", this.getPackageName())) != 0) {
                image9.setImageResource(getResources().getIdentifier("_512_i9", "drawable", this.getPackageName()));
                image9.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_i10", "drawable", this.getPackageName())) != 0) {
                image10.setImageResource(getResources().getIdentifier("_512_i10", "drawable", this.getPackageName()));
                image10.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_i11", "drawable", this.getPackageName())) != 0) {
                image11.setImageResource(getResources().getIdentifier("_512_i11", "drawable", this.getPackageName()));
                image11.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_i12", "drawable", this.getPackageName())) != 0) {
                image12.setImageResource(getResources().getIdentifier("_512_i12", "drawable", this.getPackageName()));
                image12.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_i13", "drawable", this.getPackageName())) != 0) {
                image13.setImageResource(getResources().getIdentifier("_512_i13", "drawable", this.getPackageName()));
                image13.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_i14", "drawable", this.getPackageName())) != 0) {
                image14.setImageResource(getResources().getIdentifier("_512_i14", "drawable", this.getPackageName()));
                image14.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_i15", "drawable", this.getPackageName())) != 0) {
                image15.setImageResource(getResources().getIdentifier("_512_i15", "drawable", this.getPackageName()));
                image15.setVisibility(View.VISIBLE);
            }
            if ((getResources().getIdentifier("_512_i16", "drawable", this.getPackageName())) != 0) {
                image16.setImageResource(getResources().getIdentifier("_512_i16", "drawable", this.getPackageName()));
                image16.setVisibility(View.VISIBLE);
            }
        }
    }

//    @Override
//    public boolean dispatchTouchEvent(MotionEvent event) {
//        super.dispatchTouchEvent(event);
//        mScaleDetector.onTouchEvent(event);
//        gestureDetector.onTouchEvent(event);
//        return gestureDetector.onTouchEvent(event);
//    }
//    private class GestureListener extends GestureDetector.SimpleOnGestureListener {
//        @Override
//        public boolean onDown(MotionEvent e) {
//            return true;
//        }
//        // event when double tap occurs
//        @Override
//        public boolean onDoubleTap(MotionEvent e) {
//            // double tap fired.
//            return true;
//        }
//    }

}