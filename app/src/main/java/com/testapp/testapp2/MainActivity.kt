package com.testapp.testapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        val resultsTextView2 = findViewById<TextView>(R.id.resultsTextView2)
        val seekbar = findViewById<SeekBar>(R.id.seekBar2)

        rollButton.setOnClickListener {
            val rand = Random().nextInt(seekbar.progress)
            resultsTextView.text = rand.toString()

            val rand2 = Random().nextInt(seekbar.progress)
            resultsTextView2.text = rand2.toString()
        }
    }
}