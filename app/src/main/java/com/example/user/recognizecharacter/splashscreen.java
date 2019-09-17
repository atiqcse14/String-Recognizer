package com.example.user.recognizecharacter;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ProgressBar;

import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class splashscreen extends AppCompatActivity {

    private GifImageView gifImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splashscreen);

        gifImageView = (GifImageView) findViewById(R.id.gifImageView);


        try{
            InputStream inputStream = getAssets().open("sr.gif");
            byte[] bytes = IOUtils.toByteArray(inputStream);
            gifImageView.setBytes(bytes);
            gifImageView.startAnimation();
        }
        catch (IOException ex)
        {

        }


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                splashscreen.this.startActivity(new Intent(splashscreen.this,home.class));
                splashscreen.this.finish();
            }
        },2000);



    }
}
