package com.ach.haroun.fujitsu.explodetransitiondemo;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void beginTransition(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this)
                    .toBundle();
            startActivity(intent, bundle);
        }else{
            startActivity(intent);
        }
    }
}
