package com.example.lab6_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.imageView)
        if (imageView.drawable == null) {
            Picasso.get()
                .load("https://images-ext-2.discordapp.net/external/nd_xyZ_HZ2L38OfAWNkS2tlqpIKcstQ5yxTpgV61I5Y/https/i.ibb.co/BPDWVhj/unnamed.jpg")
                .into(imageView)
        }
    }
}