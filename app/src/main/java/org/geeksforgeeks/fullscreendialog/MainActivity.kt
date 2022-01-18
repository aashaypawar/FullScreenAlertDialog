package org.geeksforgeeks.fullscreendialog

import android.app.AlertDialog
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declare and Initialize the Button from the layout file
        val mButton = findViewById<Button>(R.id.button_1)

        mButton.setOnClickListener {
            // Declaring and initializing a Builder for the Alert Dialog with a FullScreen theme
            val mBuilder = AlertDialog.Builder(this,android.R.style.Theme_DeviceDefault_NoActionBar_Fullscreen)
                .setTitle("TITLE")
                .setMessage("MESSAGE")
                .setPositiveButton("Positive", null)
                .setNegativeButton("Negative", null)

            // Create the AlertDialog
            val mAlertDialog = mBuilder.create()

            // Show the AlertDialog
            mAlertDialog.show()
        }
    }
}