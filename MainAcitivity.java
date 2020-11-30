package com.example.imageload;

import java.io.ByteArrayOutputStream;
import java.io.File;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener {
    private static final int PICK_FROM_CAMERA = 0;
    private static final int PICK_FROM_ALBUM = 1;
    private static final int CROP_FROM_CAMERA = 2;
    private Uri mImageCaptureUri;
    private ImageView mPhotoImageView;

// private Button mButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPhotoImageView = (ImageView) findViewById(R.id.image);

        Button btn1 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(this); //사진불러오는 버튼


        Button btn3 = (Button) findViewById(R.id.next);
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                //startActivity(intent);

                Intent img=new Intent(MainActivity.this, MainActivity2.class);
                img.putExtra("uri",mImageCaptureUri.toString());
                startActivity(img);
                finish();
            }
        }); //next버튼누르면 다음 화면

    }

    /**
     * 카메라로부터 이미지 불러오기
     */
    private void doTakePhotoAction() {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        String url = "DCIM/AT" + String.valueOf(System.currentTimeMillis())
                + ".jpg";
        mImageCaptureUri = Uri.fromFile(new File(Environment
                .getExternalStorageDirectory(), url));

        intent.putExtra(android.provider.MediaStore.EXTRA_OUTPUT,
                mImageCaptureUri);
        intent.putExtra("return-data", true);
        startActivityForResult(intent, PICK_FROM_CAMERA);
    }

    /**
     * 갤러리에서 이미지 불러오기
     */
    private void doTakeAlbumAction() {
// call album
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType(android.provider.MediaStore.Images.Media.CONTENT_TYPE);
        startActivityForResult(intent, PICK_FROM_ALBUM);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode != RESULT_OK) {
            return;
        }
        switch (requestCode) {
            case CROP_FROM_CAMERA: {
//
                final Bundle extras = data.getExtras();

                if (extras != null) {
                    Bitmap photo = extras.getParcelable("data");
                    mPhotoImageView.setImageBitmap(photo);
                }

// 임시 파일 삭제
                File f = new File(mImageCaptureUri.getPath());
                if (f.exists()) {
                    f.delete();
                }

                break;
            }

            case PICK_FROM_ALBUM: {

                mImageCaptureUri = data.getData();
                setImage();
            }

            case PICK_FROM_CAMERA: {
                setImage();
                Intent intent = new Intent("com.android.camera.action.CROP");
                intent.setDataAndType(mImageCaptureUri, "image/*");

                intent.putExtra("outputX", 300);
                intent.putExtra("outputY", 300);
                intent.putExtra("aspectX", 2);
                intent.putExtra("aspectY", 2);
                intent.putExtra("scale", true);
                intent.putExtra("return-data", true);

                startActivityForResult(intent, CROP_FROM_CAMERA);

                break;
            }
        }
    }


    @Override
    public void onClick(View v) {


        if (v.getId() == R.id.button) { //사진불러오기 버튼
            new AlertDialog.Builder(this).setTitle("이미지 선택")
                    //.setPositiveButton("사진촬영", cameraListener)
                    .setNeutralButton("앨범열기", albumListener)
                    .setNegativeButton("취소", cancelListener).show();
        }
        //else if (v.getId() == R.id.next) { //다음 버튼



            //Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            //startActivity(intent);

            //Intent img=new Intent(MainActivity.this, MainActivity2.class);
            //img.putExtra("uri",mImageCaptureUri);
            //startActivity(img);
           // Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.id.image);
            //ByteArrayOutputStream stream = new ByteArrayOutputStream();
            //bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
            //byte[] byteArray = stream.toByteArray();
            //intent.putExtra("uri", byteArray);
            }

            //Intent next = new Intent(MainActivity.this, MainActivity2.class);
            //next.putExtra("uri", mImageCaptureUri.toString());
            //startActivity(next);
    //}

    DialogInterface.OnClickListener cameraListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            doTakePhotoAction();
        }
    };

    DialogInterface.OnClickListener albumListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            doTakeAlbumAction();
        }
    };

    DialogInterface.OnClickListener cancelListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            dialog.dismiss();

        }
    };

    public void setImage() {
        mPhotoImageView.setImageURI(mImageCaptureUri);
    }

    //public void NextActivity()
    //{
       // Intent intent=new Intent(this, MainActivity2.class);
     //   intent.putExtra("uri", mImageCaptureUri);
     //   startActivity(intent);
   // }
}
