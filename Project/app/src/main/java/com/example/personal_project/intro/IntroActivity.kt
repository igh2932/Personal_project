package com.example.personal_project.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.personal_project.R
import android.os.Handler
import com.example.personal_project.MainActivity

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        // 3초뒤 MainActivity 로 이동해라
        var handler = Handler()
        handler.postDelayed({
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        },3000)

    }

    override fun onPause() {
        super.onPause()
        finish()
    }

}