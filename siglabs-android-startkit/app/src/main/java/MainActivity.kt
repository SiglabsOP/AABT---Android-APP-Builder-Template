package com.risktide.siglabs  // Use your app's package name

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Linking to the layout file

        // Find the button in the layout and set up the click listener
        val openButton: Button = findViewById(R.id.openButton)
        openButton.setOnClickListener {
            openWebsite("https://peterdeceuster.uk/index2.html")  // Open the website when the button is clicked
        }
    }

    // Function to open the website URL
    private fun openWebsite(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)  // Start the intent to open the URL
    }
}
