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

public class MainActivity4 extends AppCompatActivity {

    Bitmap bitmap;
    byte[] byteArray;
    ByteArrayOutputStream stream;  //추가


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

    ImageView ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
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
                        Change_image.setImageResource(R.drawable.pink_summer002_);
                        Change_image2.setImageResource(R.drawable.pink_winter003);
                    }
                    else if(count3 == 2){
                        Change_image.setImageResource(R.drawable.red_summer5);
                        Change_image2.setImageResource(R.drawable.red_winter6);
                    }
                    else if(count3 == 3){
                        Change_image.setImageResource(R.drawable.red_summer8);
                        Change_image2.setImageResource(R.drawable.red_winter7);
                    }
                    else if(count3 == 4) {
                        Change_image.setImageResource(R.drawable.orange_summer9);
                        Change_image2.setImageResource(R.drawable.orange_winter10);
                    }
                    else if(count3 == 5){
                        Change_image.setImageResource(R.drawable.yellow_summer12);
                        Change_image2.setImageResource(R.drawable.yellow_winter013_);
                    }
                    else if(count3 == 6){
                        Change_image.setImageResource(R.drawable.green_summer014_);
                        Change_image2.setImageResource(R.drawable.green_winter015_);
                    }
                    else if(count3 == 8) {
                        Change_image.setImageResource(R.drawable.blue_summer016_);
                        Change_image2.setImageResource(R.drawable.blue_winter017_);
                    }
                    else if(count3 == 9){
                        Change_image.setImageResource(R.drawable.blue_summer018_);
                        Change_image2.setImageResource(R.drawable.blue_winter019_);
                    }
                    else if(count3 == 10){
                        Change_image.setImageResource(R.drawable.purple_summer020_);
                        Change_image2.setImageResource(R.drawable.purple_winter021_);
                    }
                    break;

                case R.id.rightbtn :
                    count++;
                    count3++;
                    tv2.setText(""+count);
                    tv.setText("Pic."+count3);
                    if(count3 == 1){
                        Change_image.setImageResource(R.drawable.pink_summer002_);
                        Change_image2.setImageResource(R.drawable.pink_winter003);
                    }
                    else if(count3 == 2){
                        Change_image.setImageResource(R.drawable.red_summer5);
                        Change_image2.setImageResource(R.drawable.red_winter6);
                    }
                    else if(count3 == 3){
                        Change_image.setImageResource(R.drawable.red_summer8);
                        Change_image2.setImageResource(R.drawable.red_winter7);
                    }
                    else if(count3 == 4) {
                        Change_image.setImageResource(R.drawable.orange_summer9);
                        Change_image2.setImageResource(R.drawable.orange_winter10);
                    }
                    else if(count3 == 5){
                        Change_image.setImageResource(R.drawable.yellow_summer12);
                        Change_image2.setImageResource(R.drawable.yellow_winter013_);
                    }
                    else if(count3 == 6){
                        Change_image.setImageResource(R.drawable.green_summer014_);
                        Change_image2.setImageResource(R.drawable.green_winter015_);
                    }
                    else if(count3 == 8) {
                        Change_image.setImageResource(R.drawable.blue_summer016_);
                        Change_image2.setImageResource(R.drawable.blue_winter017_);
                    }
                    else if(count3 == 9){
                        Change_image.setImageResource(R.drawable.blue_summer018_);
                        Change_image2.setImageResource(R.drawable.blue_winter019_);
                    }
                    else if(count3 == 10){
                        Change_image.setImageResource(R.drawable.purple_summer020_);
                        Change_image2.setImageResource(R.drawable.purple_winter021_);
                    }
                    break;

                case R.id.leftchoice :
                    Intent intent = new Intent(MainActivity4.this, MainActivity6.class);

                    stream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                    byteArray = stream.toByteArray();

                    intent.putExtra("img",byteArray);
                    startActivity(intent);
                    finish();
                    break;

                case R.id.rightchoice :
                    Intent intent2 = new Intent(MainActivity4.this, MainActivity12.class);

                    stream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                    byteArray = stream.toByteArray();

                    intent2.putExtra("img",byteArray);
                    startActivity(intent2);
                    finish();
                    break;
            }
        }
    };

}
