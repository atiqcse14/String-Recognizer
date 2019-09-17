package com.example.user.recognizecharacter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onClick(View v){
        Intent p=new Intent(this,MainActivity.class);
        startActivity(p);
    }

    public void onClicka(View v){
        Intent q=new Intent(this,ListDataActivity.class);
        startActivity(q);
    }
}
