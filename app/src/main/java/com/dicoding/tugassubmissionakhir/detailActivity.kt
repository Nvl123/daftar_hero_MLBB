package com.dicoding.tugassubmissionakhir

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_HERO = "extra_hero"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail) // Pastikan layout yang benar diatur

        val hero = intent.getParcelableExtra<HeroMlbb>(EXTRA_HERO)

        if (hero != null) {
            val tvItemName = findViewById<TextView>(R.id.tv_item_name)
            val tvJulukan = findViewById<TextView>(R.id.julukan)
            val tvPeran = findViewById<TextView>(R.id.peran)
            val tvSpesialisasi = findViewById<TextView>(R.id.spesialisasi)
            val tvTahunRilis = findViewById<TextView>(R.id.tahun_rilis)
            val tvDetails = findViewById<TextView>(R.id.details2) // Ganti 'details' menjadi 'details2'

            tvItemName.text = hero.name
            tvJulukan.text = hero.gelar
            tvPeran.text = hero.peran
            tvSpesialisasi.text = hero.spesialis
            tvTahunRilis.text = hero.rilis
            tvDetails.text = hero.detail

            Glide.with(this)
                .load(hero.photo)
                .into(findViewById<ImageView>(R.id.img_item_photo))
        } else {
            Toast.makeText(this, "Data hero tidak ditemukan", Toast.LENGTH_SHORT).show()
        }
    }
}
