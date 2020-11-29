package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
                                      public void onClick(View view) {
                                          Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"));
                                          startActivity(intent);
                                      }
                                  }
        );
    }
}
