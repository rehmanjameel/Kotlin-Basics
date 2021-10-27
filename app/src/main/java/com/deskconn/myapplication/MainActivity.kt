package com.deskconn.myapplication

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get reference to button
        //val btnClickMe = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        // set onClick listener
        button.setOnClickListener {
            timesClicked += 1
            textView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "$timesClicked times clicked", Toast.LENGTH_SHORT).show()
        }
    }
}