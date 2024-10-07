package com.dicoding.tugassubmissionakhir

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_page)

        val shareButton: Button = findViewById(R.id.action_share)

        shareButton.setOnClickListener{
            val ShareIntent = Intent().apply {

                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT,"silahkah cek link ini : https://www.linkedin.com/in/moh-novil-ma-arij-083232311/ ")
                type="text/plain"
            }
            val chooser = Intent.createChooser(ShareIntent, "Share using")
            startActivity(chooser)
        }

    }

}