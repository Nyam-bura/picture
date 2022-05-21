package com.example.picture_bookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btngal:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btngal=findViewById(R.id.btngal)
        btngal.setOnClickListener {
            val intent=Intent(this,image1Activity::class.java)
            startActivity(intent)

        }
    }
}