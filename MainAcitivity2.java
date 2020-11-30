package com.example.imageload;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    ImageView mPhotoImageView;
    Uri uri;
    String geturi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mPhotoImageView=findViewById(R.id.image);

        //Intent intent = getIntent();
        //uri=getIntent().getParcelableExtra("uri");

        geturi=getIntent().getStringExtra("uri");
        uri=Uri.parse(geturi);
        mPhotoImageView.setImageURI(uri);
        //byte[] byteArray = getIntent().getByteArrayExtra("uri");
        //Bitmap image = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

        //ImageView ivImage = findViewById(R.id.image);
        //ivImage.setImageBitmap(image);


        //mPhotoImageView = (ImageView) findViewById(R.id.image);

        //byte[] byteArray = getIntent().getByteArrayExtra("uri");
        //Bitmap bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

        //mPhotoImageView.setImageBitmap(bitmap);
        //mImageCaptureUri= (Uri) getIntent().getSerializableExtra("uri");
        //mPhotoImageView.setImageURI(mImageCaptureUri);
        //Uri uri = getIntent().getParcelableExtra("uri");
      //  ResourceBundle extras = null;
        //Bundle extras = getIntent().getExtras();
        //Uri uri = Uri.parse(extras.getString("uri"));
       // Intent intent = getIntent();
        //Uri uri = intent.getParcelableExtra("uri");
    }

}
