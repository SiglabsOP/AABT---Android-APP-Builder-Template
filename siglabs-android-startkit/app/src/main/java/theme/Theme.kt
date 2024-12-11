package com.risktide.siglabs.theme

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

// Function to set the app theme (light or dark) using AppCompatDelegate for compatibility
fun AppCompatActivity.setAppTheme(darkTheme: Boolean = false) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        AppCompatDelegate.setDefaultNightMode(
            if (darkTheme) AppCompatDelegate.MODE_NIGHT_YES else AppCompatDelegate.MODE_NIGHT_NO
        )
    }
}

// Function to apply the appropriate theme based on the user's preference
fun setApplicationTheme(darkTheme: Boolean = false) {
    if (darkTheme) {
        // Apply dark theme resources
        // This could be done by specifying your dark theme in the manifest or programmatically
    } else {
        // Apply light theme resources
        // This could be done by specifying your light theme in the manifest or programmatically
    }
}
