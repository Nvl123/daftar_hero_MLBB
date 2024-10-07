package com.dicoding.tugassubmissionakhir

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Hide the action bar
        supportActionBar?.hide()

        // Make the splash screen fullscreen
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // Use Handler to delay the transition to MainActivity
        Handler(Looper.getMainLooper()).postDelayed({
            // Intent to move to MainActivity
            val intent = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(intent)
            finish() // Finish SplashScreen activity
        }, 2000) // 2-second delay
    }
}
