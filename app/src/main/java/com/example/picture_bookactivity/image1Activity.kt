package com.example.picture_bookactivity

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class image1Activity : AppCompatActivity() {
    lateinit var btnNext1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image1)
        btnNext1=findViewById(R.id.btnnext1)
        btnNext1.setOnClickListener {
            var intent=Intent(this,image2Activity::class.java)
            startActivity(intent)
        }


        }
    }
