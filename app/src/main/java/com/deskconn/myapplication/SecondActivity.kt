//The 5 basic concepts of Oop in Kotlin
// -> Variables and types
// -> control flow
// -> functions
// -> collections
// -> classes and objects (including inheritance)

package com.deskconn.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}


