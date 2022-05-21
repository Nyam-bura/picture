package com.example.picture_bookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class image2Activity : AppCompatActivity() {
 lateinit var btnprev1:Button
 lateinit var btnnext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image2)
        btnprev1=findViewById(R.id.btnprev1)
        btnprev1.setOnClickListener {
            var intent=Intent(this,image1Activity::class.java)
            startActivity(intent)
        }
        btnnext=findViewById(R.id.btnnext)
        btnnext.setOnClickListener {
            var intent= Intent(this,image3Activity::class.java)
            startActivity(intent)
        }
    }
}