package com.example.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.ImageView;

import android.content.Intent;

import java.io.ByteArrayOutputStream;

public class MainActivity7 extends AppCompatActivity {

    Bitmap bitmap;
    byte[] byteArray;
    ByteArrayOutputStream stream;  //추가

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

    ImageView ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        setup();

        ImageView=findViewById(R.id.receivedimage); //사진 넣을 View

        byteArray = getIntent().getByteArrayExtra("img"); //img라는 이름으로 받아옴
        bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

        ImageView.setImageBitmap(bitmap); //사진 받는 부분 추가

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
                        Change_image.setImageResource(R.drawable.autumndark2);
                        Change_image2.setImageResource(R.drawable.autumnsoft2);
                        Change_image3.setImageResource(R.drawable.autumntrue2);
                    }
                    else if(count3 == 2){
                        Change_image.setImageResource(R.drawable.autumndark3);
                        Change_image2.setImageResource(R.drawable.autumnsoft3);
                        Change_image3.setImageResource(R.drawable.autumntrue3);
                    }
                    else if(count3 == 3) {
                        Change_image.setImageResource(R.drawable.autumndark4);
                        Change_image2.setImageResource(R.drawable.autumnsoft4);
                        Change_image3.setImageResource(R.drawable.autumntrue4);
                    }
                    else if(count3 == 4){
                        Change_image.setImageResource(R.drawable.autumndark5);
                        Change_image2.setImageResource(R.drawable.autumnsoft5);
                        Change_image3.setImageResource(R.drawable.autumntrue5);
                    }
                    else if(count3 == 5){
                        Change_image.setImageResource(R.drawable.autumndark6);
                        Change_image2.setImageResource(R.drawable.autumnsoft6);
                        Change_image3.setImageResource(R.drawable.autumntrue6);
                    }
                    else if(count3 == 6) {
                        Change_image.setImageResource(R.drawable.autumndark7);
                        Change_image2.setImageResource(R.drawable.autumnsoft7);
                        Change_image3.setImageResource(R.drawable.autumntrue7);
                    }
                    break;

                case R.id.rightbtn :
                    count++;
                    count3++;
                    tv2.setText(""+count);
                    tv.setText("Pic."+count3);
                    if(count3 == 1){
                        Change_image.setImageResource(R.drawable.autumndark2);
                        Change_image2.setImageResource(R.drawable.autumnsoft2);
                        Change_image3.setImageResource(R.drawable.autumntrue2);
                    }
                    else if(count3 == 2){
                        Change_image.setImageResource(R.drawable.autumndark3);
                        Change_image2.setImageResource(R.drawable.autumnsoft3);
                        Change_image3.setImageResource(R.drawable.autumntrue3);
                    }
                    else if(count3 == 3) {
                        Change_image.setImageResource(R.drawable.autumndark4);
                        Change_image2.setImageResource(R.drawable.autumnsoft4);
                        Change_image3.setImageResource(R.drawable.autumntrue4);
                    }
                    else if(count3 == 4){
                        Change_image.setImageResource(R.drawable.autumndark5);
                        Change_image2.setImageResource(R.drawable.autumnsoft5);
                        Change_image3.setImageResource(R.drawable.autumntrue5);
                    }
                    else if(count3 == 5){
                        Change_image.setImageResource(R.drawable.autumndark6);
                        Change_image2.setImageResource(R.drawable.autumnsoft6);
                        Change_image3.setImageResource(R.drawable.autumntrue6);
                    }
                    else if(count3 == 6) {
                        Change_image.setImageResource(R.drawable.autumndark7);
                        Change_image2.setImageResource(R.drawable.autumnsoft7);
                        Change_image3.setImageResource(R.drawable.autumntrue7);
                    }
                    break;

                case R.id.midbtn :
                    count4++;
                    count3++;
                    tv3.setText(""+count4);
                    tv.setText("Pic."+count3);
                    if(count3 == 1){
                        Change_image.setImageResource(R.drawable.autumndark2);
                        Change_image2.setImageResource(R.drawable.autumnsoft2);
                        Change_image3.setImageResource(R.drawable.autumntrue2);
                    }
                    else if(count3 == 2){
                        Change_image.setImageResource(R.drawable.autumndark3);
                        Change_image2.setImageResource(R.drawable.autumnsoft3);
                        Change_image3.setImageResource(R.drawable.autumntrue3);
                    }
                    else if(count3 == 3) {
                        Change_image.setImageResource(R.drawable.autumndark4);
                        Change_image2.setImageResource(R.drawable.autumnsoft4);
                        Change_image3.setImageResource(R.drawable.autumntrue4);
                    }
                    else if(count3 == 4){
                        Change_image.setImageResource(R.drawable.autumndark5);
                        Change_image2.setImageResource(R.drawable.autumnsoft5);
                        Change_image3.setImageResource(R.drawable.autumntrue5);
                    }
                    else if(count3 == 5){
                        Change_image.setImageResource(R.drawable.autumndark6);
                        Change_image2.setImageResource(R.drawable.autumnsoft6);
                        Change_image3.setImageResource(R.drawable.autumntrue6);
                    }
                    else if(count3 == 6) {
                        Change_image.setImageResource(R.drawable.autumndark7);
                        Change_image2.setImageResource(R.drawable.autumnsoft7);
                        Change_image3.setImageResource(R.drawable.autumntrue7);
                    }
                    break;

                case R.id.leftchoice :
                    Intent intent = new Intent(MainActivity7.this, MainActivity10.class);
                    startActivity(intent);
                    finish();
                    break;

                case R.id.rightchoice :
                    Intent intent2 = new Intent(MainActivity7.this, MainActivity17.class);
                    startActivity(intent2);
                    finish();
                    break;

                case R.id.midchoice :
                    Intent intent3 = new Intent(MainActivity7.this, MainActivity18.class);
                    startActivity(intent3);
                    finish();
                    break;

            }
        }
    };

}
