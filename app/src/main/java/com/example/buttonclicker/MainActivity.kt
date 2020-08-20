package com.example.buttonclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

private var timesClicked = 0    // automatically infers that this is an Int     NO MORE PRIMITIVE DATA TYPES

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickMeClick(view : View) {
        // update the click count
        timesClicked++
        // display the current number of clicks on the button
        button.setText(timesClicked.toString())

        // give feedback at 10 clicks, 50 clicks, and 100 clicks
        if (timesClicked == 10)
            // make a toast to tell the user something about hitting 10
            Toast.makeText(this, "Achievement unlocked: Double Digits", Toast.LENGTH_LONG).show()
        if (timesClicked == 50)
        // make a toast to tell the user something about hitting 10
            Toast.makeText(this, "Achievement unlocked: Midlife Crisis", Toast.LENGTH_LONG).show()
        if (timesClicked == 100)
        // make a toast to tell the user something about hitting 10
            Toast.makeText(this, "Achievement unlocked: Why are you still clicking?", Toast.LENGTH_LONG).show()
    }
}