package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.ImageView;

import android.content.Intent;

public class MainActivity3 extends AppCompatActivity {

    TextView tv = null;
    TextView tv1 = null;
    TextView tv2 = null;

    Button btn = null;
    Button btn2 = null;
    Button btn3 = null;
    Button btn4 = null;

    int count = 0;
    int count2 = 0;
    int count3 = 0;

    ImageView Change_image = null;
    ImageView Change_image2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setup();

    }

    private void setup()
    {
        btn = (Button) findViewById(R.id.leftbtn);
        btn2 = (Button) findViewById(R.id.rightbtn);
        btn3 = (Button) findViewById(R.id.leftchoice);
        btn4 = (Button) findViewById(R.id.rightchoice);

        tv = (TextView) findViewById(R.id.tv);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);

        Change_image = (ImageView)findViewById(R.id.imageView3);

        Change_image2 = (ImageView)findViewById(R.id.imageView2);

        btn.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
        btn3.setOnClickListener(listener);
        btn4.setOnClickListener(listener);
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
                        Change_image.setImageResource(R.drawable.pink_autumn003_);
                        Change_image2.setImageResource(R.drawable.pink_spring004_);
                    }
                    else if(count3 == 2){
                        Change_image.setImageResource(R.drawable.red_autumn005_);
                        Change_image2.setImageResource(R.drawable.red_spring6);
                    }
                    else if(count3 == 3) {
                        Change_image.setImageResource(R.drawable.red_autumn7);
                        Change_image2.setImageResource(R.drawable.red_spring8);
                    }
                    else if(count3 == 4){
                        Change_image.setImageResource(R.drawable.orange_autumn9);
                        Change_image2.setImageResource(R.drawable.orange_spring10);
                    }
                    else if(count3 == 5){
                        Change_image.setImageResource(R.drawable.yellow_autumn11);
                        Change_image2.setImageResource(R.drawable.yellow_spring12);
                    }
                    else if(count3 == 6) {
                        Change_image.setImageResource(R.drawable.green_autumn015_);
                        Change_image2.setImageResource(R.drawable.green_spring014_);
                    }
                    else if(count3 == 7){
                        Change_image.setImageResource(R.drawable.blue_autumn016_);
                        Change_image2.setImageResource(R.drawable.blue_spring017_);
                    }
                    else if(count3 == 8){
                        Change_image.setImageResource(R.drawable.blue_autumn018_);
                        Change_image2.setImageResource(R.drawable.blue_spring019_);
                    }
                    else if(count3 == 9){
                        Change_image.setImageResource(R.drawable.purple_autumn021_);
                        Change_image2.setImageResource(R.drawable.purple_spring020_);
                    }
                    break;

                case R.id.rightbtn :
                    count++;
                    count3++;
                    tv2.setText(""+count);
                    tv.setText("Pic."+count3);
                    if(count3 == 1){
                        Change_image.setImageResource(R.drawable.pink_autumn003_);
                        Change_image2.setImageResource(R.drawable.pink_spring004_);
                    }
                    else if(count3 == 2){
                        Change_image.setImageResource(R.drawable.red_autumn005_);
                        Change_image2.setImageResource(R.drawable.red_spring6);
                    }
                    else if(count3 == 3) {
                        Change_image.setImageResource(R.drawable.red_autumn7);
                        Change_image2.setImageResource(R.drawable.red_spring8);
                    }
                    else if(count3 == 4){
                        Change_image.setImageResource(R.drawable.orange_autumn9);
                        Change_image2.setImageResource(R.drawable.orange_spring10);
                    }
                    else if(count3 == 5){
                        Change_image.setImageResource(R.drawable.yellow_autumn11);
                        Change_image2.setImageResource(R.drawable.yellow_spring12);
                    }
                    else if(count3 == 6) {
                        Change_image.setImageResource(R.drawable.green_autumn015_);
                        Change_image2.setImageResource(R.drawable.green_spring014_);
                    }
                    else if(count3 == 7){
                        Change_image.setImageResource(R.drawable.blue_autumn016_);
                        Change_image2.setImageResource(R.drawable.blue_spring017_);
                    }
                    else if(count3 == 8){
                        Change_image.setImageResource(R.drawable.blue_autumn018_);
                        Change_image2.setImageResource(R.drawable.blue_spring019_);
                    }
                    else if(count3 == 9){
                        Change_image.setImageResource(R.drawable.purple_autumn021_);
                        Change_image2.setImageResource(R.drawable.purple_spring020_);
                    }
                    break;

                case R.id.leftchoice :
                    Intent intent = new Intent(MainActivity3.this, MainActivity5.class);
                    startActivity(intent);
                    finish();
                    break;

                case R.id.rightchoice :
                    Intent intent2 = new Intent(MainActivity3.this, MainActivity7.class);
                    startActivity(intent2);
                    finish();
                    break;
            }
        }
    };

}