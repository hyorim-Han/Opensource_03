package com.example.myapplication;

import java.io.ByteArrayOutputStream;
import java.io.File;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class ImageActivity extends Activity implements OnClickListener {
    private static final int PICK_FROM_CAMERA = 0;
    private static final int PICK_FROM_ALBUM = 1;
    private static final int CROP_FROM_CAMERA = 2;
    private Uri mImageCaptureUri;
    private ImageView mPhotoImageView;

    Bitmap photo;
    byte[] byteArray;
    ByteArrayOutputStream stream;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        mPhotoImageView = (ImageView) findViewById(R.id.receivedimage);

        Button btn1 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(this); //사진불러오는 버튼


        Button btn3 = (Button) findViewById(R.id.next);
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ImageActivity.this, MainActivity2.class);
                stream = new ByteArrayOutputStream();
                photo.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                byteArray = stream.toByteArray();

                intent.putExtra("img",byteArray);
                startActivity(intent);
            }
        }
        ); //next버튼누르면 다음 화면

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

                final Bundle extras = data.getExtras();

                if (extras != null) {
                    photo = extras.getParcelable("data");
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
                    .setNeutralButton("앨범열기", albumListener)
                    .setNegativeButton("취소", cancelListener).show();
        }
    }

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

}
