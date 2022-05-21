package com.example.picture_bookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class image5Activity : AppCompatActivity() {
    lateinit var btn7:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image7)
        btn7=findViewById(R.id.btn7)
        btn7.setOnClickListener {
            var intent=Intent(this,image4Activity::class.java)
            startActivity(intent)
        }
    }
}