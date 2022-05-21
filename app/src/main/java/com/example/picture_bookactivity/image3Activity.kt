package com.example.picture_bookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class image3Activity : AppCompatActivity() {
    lateinit var btnPrev:Button
    lateinit var btnNextFour:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image3)

        btnPrev=findViewById(R.id.btnPrev)
        btnNextFour=findViewById(R.id.btnNextFour)
        btnPrev.setOnClickListener {
            val intent=Intent(this,image2Activity::class.java)
            startActivity(intent)
        }

        btnNextFour.setOnClickListener {
            val intent=Intent(this,image4Activity::class.java)
            startActivity(intent)
        }
    }
}