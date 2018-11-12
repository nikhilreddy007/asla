package com.example.nikhilreddy.ass;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * It is used for Easy Quiz
 */
public class EasyQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }
    String ans[] = {"Run Time Environment","SoftWareComponent","Services layer, Ecu Abstraction layer, CDD, Microcontroller Abstraction layer","Protocol Data Unit","Automotive open system Architecture","Micro controller Abstraction layer","Virtual Function Bus","Between ports and system signal","Function","2002"};

    public void onSubmit(View view){

        int total =0;
        int c =0;

        RadioGroup radiogroup1 = (RadioGroup) findViewById(R.id.rg1);
        int radiobuttonId1 = radiogroup1.getCheckedRadioButtonId();

        RadioGroup radiogroup2 = (RadioGroup) findViewById(R.id.rg2);
        int radiobuttonId2 = radiogroup2.getCheckedRadioButtonId();

        RadioGroup radiogroup3 = (RadioGroup) findViewById(R.id.rg3);
        int radiobuttonId3 = radiogroup3.getCheckedRadioButtonId();

        RadioGroup radiogroup4 = (RadioGroup) findViewById(R.id.rg4);
        int radiobuttonId4 = radiogroup4.getCheckedRadioButtonId();

        RadioGroup radiogroup5 = (RadioGroup) findViewById(R.id.rg5);
        int radiobuttonId5 = radiogroup5.getCheckedRadioButtonId();

        RadioGroup radiogroup6 = (RadioGroup) findViewById(R.id.rg6);
        int radiobuttonId6 = radiogroup6.getCheckedRadioButtonId();

        RadioGroup radiogroup7 = (RadioGroup) findViewById(R.id.rg7);
        int radiobuttonId7 = radiogroup7.getCheckedRadioButtonId();

        RadioGroup radiogroup8 = (RadioGroup) findViewById(R.id.rg8);
        int radiobuttonId8 = radiogroup8.getCheckedRadioButtonId();

        RadioGroup radiogroup9 = (RadioGroup) findViewById(R.id.rg9);
        int radiobuttonId9 = radiogroup9.getCheckedRadioButtonId();

        RadioGroup radiogroup10 = (RadioGroup) findViewById(R.id.rg10);
        int radiobuttonId10 = radiogroup10.getCheckedRadioButtonId();

        if(radiobuttonId1 != -1){
            c++;
        }
        if(radiobuttonId2 != -1){
            c++;
        }
        if(radiobuttonId3 != -1){
            c++;
        }
        if(radiobuttonId4 != -1){
            c++;
        }
        if(radiobuttonId5 != -1){
            c++;
        }
        if(radiobuttonId6 != -1){
            c++;
        }
        if(radiobuttonId7 != -1){
            c++;
        }
        if(radiobuttonId8 != -1){
            c++;
        }
        if(radiobuttonId9 != -1){
            c++;
        }
        if(radiobuttonId10 != -1){
            c++;
        }

        if(c != 10){
            Toast.makeText(this,"Answer all the questions",Toast.LENGTH_SHORT).show();
        } else{

            Button button = (Button)findViewById(R.id.submit);
            button.setVisibility(View.GONE);

            RadioButton radioButton1 = (RadioButton)findViewById(radiobuttonId1);
            String ans1 = radioButton1.getText().toString();
            LinearLayout linearLayout1 = (LinearLayout)findViewById(R.id.line1);
            if(ans1.equalsIgnoreCase(ans[0])){
                linearLayout1.setBackgroundColor(getResources().getColor(R.color.correct));
                total++;
            } else {
                linearLayout1.setBackgroundColor(getResources().getColor(R.color.wrong));
            }


            RadioButton radioButton2 = (RadioButton)findViewById(radiobuttonId2);
            String ans2 = radioButton2.getText().toString();
            LinearLayout linearLayout2 = (LinearLayout)findViewById(R.id.line2);
            if(ans2.equalsIgnoreCase(ans[1])){
                linearLayout2.setBackgroundColor(getResources().getColor(R.color.correct));
                total++;
            } else {
                linearLayout2.setBackgroundColor(getResources().getColor(R.color.wrong));
            }


            RadioButton radioButton3 = (RadioButton)findViewById(radiobuttonId3);
            String ans3 = radioButton3.getText().toString();
            LinearLayout linearLayout3 = (LinearLayout)findViewById(R.id.line3);
            if(ans3.equalsIgnoreCase(ans[2])){
                linearLayout3.setBackgroundColor(getResources().getColor(R.color.correct));
                total++;
            } else {
                linearLayout3.setBackgroundColor(getResources().getColor(R.color.wrong));
            }


            RadioButton radioButton4 = (RadioButton)findViewById(radiobuttonId4);
            String ans4 = radioButton4.getText().toString();
            LinearLayout linearLayout4 = (LinearLayout)findViewById(R.id.line4);
            if(ans4.equalsIgnoreCase(ans[3])){
                linearLayout4.setBackgroundColor(getResources().getColor(R.color.correct));
                total++;
            } else {
                linearLayout4.setBackgroundColor(getResources().getColor(R.color.wrong));
            }


            RadioButton radioButton5 = (RadioButton)findViewById(radiobuttonId5);
            String ans5 = radioButton5.getText().toString();
            LinearLayout linearLayout5 = (LinearLayout)findViewById(R.id.line5);
            if(ans5.equalsIgnoreCase(ans[4])){
                linearLayout5.setBackgroundColor(getResources().getColor(R.color.correct));
                total++;
            } else {
                linearLayout5.setBackgroundColor(getResources().getColor(R.color.wrong));
            }


            RadioButton radioButton6 = (RadioButton)findViewById(radiobuttonId6);
            String ans6 = radioButton6.getText().toString();
            LinearLayout linearLayout6 = (LinearLayout)findViewById(R.id.line6);
            if(ans6.equalsIgnoreCase(ans[5])){
                linearLayout6.setBackgroundColor(getResources().getColor(R.color.correct));
                total++;
            } else {
                linearLayout6.setBackgroundColor(getResources().getColor(R.color.wrong));
            }


            RadioButton radioButton7 = (RadioButton)findViewById(radiobuttonId7);
            String ans7 = radioButton7.getText().toString();
            LinearLayout linearLayout7 = (LinearLayout)findViewById(R.id.line7);
            if(ans7.equalsIgnoreCase(ans[6])){
                linearLayout7.setBackgroundColor(getResources().getColor(R.color.correct));
                total++;
            } else {
                linearLayout7.setBackgroundColor(getResources().getColor(R.color.wrong));
            }


            RadioButton radioButton8 = (RadioButton)findViewById(radiobuttonId8);
            String ans8 = radioButton8.getText().toString();
            LinearLayout linearLayout8 = (LinearLayout)findViewById(R.id.line8);
            if(ans8.equalsIgnoreCase(ans[7])){
                linearLayout8.setBackgroundColor(getResources().getColor(R.color.correct));
                total++;
            } else {
                linearLayout8.setBackgroundColor(getResources().getColor(R.color.wrong));
            }


            RadioButton radioButton9 = (RadioButton)findViewById(radiobuttonId9);
            String ans9 = radioButton9.getText().toString();
            LinearLayout linearLayout9 = (LinearLayout)findViewById(R.id.line9);
            if(ans9.equalsIgnoreCase(ans[8])){
                linearLayout9.setBackgroundColor(getResources().getColor(R.color.correct));
                total++;
            } else {
                linearLayout9.setBackgroundColor(getResources().getColor(R.color.wrong));
            }


            RadioButton radioButton10 = (RadioButton)findViewById(radiobuttonId10);
            String ans10 = radioButton10.getText().toString();
            LinearLayout linearLayout10 = (LinearLayout)findViewById(R.id.line10);
            if(ans10.equalsIgnoreCase(ans[9])){
                linearLayout10.setBackgroundColor(getResources().getColor(R.color.correct));
                total++;
            } else {
                linearLayout10.setBackgroundColor(getResources().getColor(R.color.wrong));
            }

            LinearLayout fullLayout = (LinearLayout)findViewById(R.id.full);
            TextView textView = new TextView(this);
            String s = "Your Score is " + Integer.toString(total) + "/10";
            textView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            textView.setText(s);
            textView.setTextSize(30);
            textView.setBackgroundColor(getResources().getColor(R.color.pink));
            textView.setTextColor(getResources().getColor(R.color.white));
            textView.setPadding(30,30,30,30);
            textView.setGravity(Gravity.CENTER);
            fullLayout.addView(textView);
        }
    }
}