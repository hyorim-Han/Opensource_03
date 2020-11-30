package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.ImageView;

import android.content.Intent;

public class MainActivity6 extends AppCompatActivity {

    TextView tv = null;
    TextView tv1 = null;
    TextView tv2 = null;
    TextView tv3 = null;

    Button btn = null;
    Button btn2 = null;
    Button btn3 = null;
    Button btn4 = null;
    Button btn5 = null;
    Button btn6 = null;

    int count = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;

    ImageView Change_image = null;
    ImageView Change_image2 = null;
    ImageView Change_image3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        setup();

    }

    private void setup()
    {
        btn = (Button) findViewById(R.id.leftbtn);
        btn2 = (Button) findViewById(R.id.rightbtn);
        btn3 = (Button) findViewById(R.id.leftchoice);
        btn4 = (Button) findViewById(R.id.rightchoice);
        btn5 = (Button) findViewById(R.id.midbtn);
        btn6 = (Button) findViewById(R.id.midchoice);

        tv = (TextView) findViewById(R.id.tv);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);

        Change_image = (ImageView)findViewById(R.id.imageView3);
        Change_image2 = (ImageView)findViewById(R.id.imageView2);
        Change_image3 = (ImageView)findViewById(R.id.imageView4);

        btn.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
        btn3.setOnClickListener(listener);
        btn4.setOnClickListener(listener);
        btn5.setOnClickListener(listener);
        btn6.setOnClickListener(listener);
    }

    View.OnClickListener listener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            switch (v.getId())
            {
                case R.id.leftbtn :
                    count2++;
                    count3++;
                    tv1.setText(""+count2);
                    tv.setText("Pic."+count3);
                    if(count3 == 1){
                        Change_image.setImageResource(R.drawable.summerlight2);
                        Change_image2.setImageResource(R.drawable.summersoft2);
                        Change_image3.setImageResource(R.drawable.summertrue2);
                    }
                    else if(count3 == 2){
                        Change_image.setImageResource(R.drawable.summerlight3);
                        Change_image2.setImageResource(R.drawable.summersoft3);
                        Change_image3.setImageResource(R.drawable.summertrue3);
                    }
                    else if(count3 == 3) {
                        Change_image.setImageResource(R.drawable.summerlight4);
                        Change_image2.setImageResource(R.drawable.summersoft4);
                        Change_image3.setImageResource(R.drawable.summertrue4);
                    }
                    else if(count3 == 4){
                        Change_image.setImageResource(R.drawable.summerlight5);
                        Change_image2.setImageResource(R.drawable.summersoft5);
                        Change_image3.setImageResource(R.drawable.summertrue5);
                    }
                    else if(count3 == 5){
                        Change_image.setImageResource(R.drawable.summerlight6);
                        Change_image2.setImageResource(R.drawable.summersoft6);
                        Change_image3.setImageResource(R.drawable.summertrue6);
                    }
                    else if(count3 == 6) {
                        Change_image.setImageResource(R.drawable.summerlight7);
                        Change_image2.setImageResource(R.drawable.summersoft7);
                        Change_image3.setImageResource(R.drawable.summertrue7);
                    }
                    break;

                case R.id.rightbtn :
                    count++;
                    count3++;
                    tv2.setText(""+count);
                    tv.setText("Pic."+count3);
                    if(count3 == 1){
                        Change_image.setImageResource(R.drawable.summerlight2);
                        Change_image2.setImageResource(R.drawable.summersoft2);
                        Change_image3.setImageResource(R.drawable.summertrue2);
                    }
                    else if(count3 == 2){
                        Change_image.setImageResource(R.drawable.summerlight3);
                        Change_image2.setImageResource(R.drawable.summersoft3);
                        Change_image3.setImageResource(R.drawable.summertrue3);
                    }
                    else if(count3 == 3) {
                        Change_image.setImageResource(R.drawable.summerlight4);
                        Change_image2.setImageResource(R.drawable.summersoft4);
                        Change_image3.setImageResource(R.drawable.summertrue4);
                    }
                    else if(count3 == 4){
                        Change_image.setImageResource(R.drawable.summerlight5);
                        Change_image2.setImageResource(R.drawable.summersoft5);
                        Change_image3.setImageResource(R.drawable.summertrue5);
                    }
                    else if(count3 == 5){
                        Change_image.setImageResource(R.drawable.summerlight6);
                        Change_image2.setImageResource(R.drawable.summersoft6);
                        Change_image3.setImageResource(R.drawable.summertrue6);
                    }
                    else if(count3 == 6) {
                        Change_image.setImageResource(R.drawable.summerlight7);
                        Change_image2.setImageResource(R.drawable.summersoft7);
                        Change_image3.setImageResource(R.drawable.summertrue7);
                    }
                    break;

                case R.id.midbtn :
                    count4++;
                    count3++;
                    tv3.setText(""+count4);
                    tv.setText("Pic."+count3);
                    if(count3 == 1){
                        Change_image.setImageResource(R.drawable.summerlight2);
                        Change_image2.setImageResource(R.drawable.summersoft2);
                        Change_image3.setImageResource(R.drawable.summertrue2);
                    }
                    else if(count3 == 2){
                        Change_image.setImageResource(R.drawable.summerlight3);
                        Change_image2.setImageResource(R.drawable.summersoft3);
                        Change_image3.setImageResource(R.drawable.summertrue3);
                    }
                    else if(count3 == 3) {
                        Change_image.setImageResource(R.drawable.summerlight4);
                        Change_image2.setImageResource(R.drawable.summersoft4);
                        Change_image3.setImageResource(R.drawable.summertrue4);
                    }
                    else if(count3 == 4){
                        Change_image.setImageResource(R.drawable.summerlight5);
                        Change_image2.setImageResource(R.drawable.summersoft5);
                        Change_image3.setImageResource(R.drawable.summertrue5);
                    }
                    else if(count3 == 5){
                        Change_image.setImageResource(R.drawable.summerlight6);
                        Change_image2.setImageResource(R.drawable.summersoft6);
                        Change_image3.setImageResource(R.drawable.summertrue6);
                    }
                    else if(count3 == 6) {
                        Change_image.setImageResource(R.drawable.summerlight7);
                        Change_image2.setImageResource(R.drawable.summersoft7);
                        Change_image3.setImageResource(R.drawable.summertrue7);
                    }
                    break;

                case R.id.leftchoice :
                    Intent intent = new Intent(MainActivity6.this, MainActivity9.class);
                    startActivity(intent);
                    finish();
                    break;

                case R.id.rightchoice :
                    Intent intent2 = new Intent(MainActivity6.this, MainActivity15.class);
                    startActivity(intent2);
                    finish();
                    break;

                case R.id.midchoice :
                    Intent intent3 = new Intent(MainActivity6.this, MainActivity16.class);
                    startActivity(intent3);
                    finish();
                    break;

            }
        }
    };

}