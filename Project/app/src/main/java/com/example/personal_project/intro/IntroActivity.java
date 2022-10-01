package com.example.personal_project.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.personal_project.R;
import com.example.personal_project.mvp.View.MainActivity;

public class IntroActivity extends AppCompatActivity {

    //선언
    public Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        handler = new Handler();

        // 3초뒤 실행해라 그리고 나가라
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }
        }, 3000);

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

}