package com.dicoding.tugassubmissionakhir

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var rvHeroes: RecyclerView
    private lateinit var listHeroAdapter: ListHeroAdapter
    private val list = ArrayList<HeroMlbb>()
    private lateinit var bottomNavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        rvHeroes = findViewById(R.id.rv_heroes)
        rvHeroes.setHasFixedSize(true)


        list.addAll(getListHeroes())


        rvHeroes.layoutManager = LinearLayoutManager(this)

        bottomNavigation = findViewById(R.id.bottom_navigation)
        setupBottomNavigation()


        listHeroAdapter = ListHeroAdapter(list)
        rvHeroes.adapter = listHeroAdapter
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun setupBottomNavigation() {
        bottomNavigation.setOnNavigationItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.action_list -> {
                    rvHeroes.layoutManager = LinearLayoutManager(this)
                    true
                }
                R.id.action_grid -> {
                    rvHeroes.layoutManager = GridLayoutManager(this, 2)
                    true
                }

                R.id.action_about-> {
                    val intent = Intent(this,AboutActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_list -> {
                rvHeroes.layoutManager = LinearLayoutManager(this)
                true
            }
            R.id.action_grid -> {
                rvHeroes.layoutManager = GridLayoutManager(this, 2)
                true
            }

            R.id.action_about -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun getListHeroes(): ArrayList<HeroMlbb> {
        val dataName = resources.getStringArray(R.array.data_hero)
        val dataGelar = resources.getStringArray(R.array.data_gelar)
        val dataPeran = resources.getStringArray(R.array.data_peran)
        val dataSpesialis = resources.getStringArray(R.array.data_spesialisasi)
        val dataRilis = resources.getStringArray(R.array.data_rilis)
        val dataPhoto = resources.getStringArray(R.array.data_photo)
        val dataDetail =resources.getStringArray(R.array.detail_hero)

        val listHero = ArrayList<HeroMlbb>()

        for (i in dataName.indices) {
            val hero = HeroMlbb(dataName[i], dataGelar[i], dataPeran[i], dataSpesialis[i], dataRilis[i], dataPhoto[i], dataDetail[i])
            listHero.add(hero)
        }
        return listHero
    }





    private fun showRecyclerList() {

    }
}
