package com.example.picture_bookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class image4Activity : AppCompatActivity() {
    lateinit var btnprev8:Button
    lateinit var btnnext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image4)
        btnprev8=findViewById(R.id.btnprev8)
        btnprev8.setOnClickListener {
            val intent=Intent(this,image3Activity::class.java)
            startActivity(intent)
        }
        btnnext3=findViewById(R.id.btnnext3)
        btnnext3.setOnClickListener {
            val intent=Intent(this,image5Activity::class.java)
            startActivity(intent)
        }
    }
}