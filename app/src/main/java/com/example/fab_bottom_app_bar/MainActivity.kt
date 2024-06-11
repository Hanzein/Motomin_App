package com.example.fab_bottom_app_bar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fab_bottom_app_bar.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.fab_bottom_app_bar.Fragment.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var bottomNav : BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.bottomNavigationView.background = null
//binding.bottomNavigationView.menu.getItem(2).isEnabled = false
        val view = binding.root
        val intent = Intent(this, barukilometer::class.java)
        setContentView(view)

        loadFragment(Home())
        binding.fab.setOnClickListener {
            startActivity(intent)
        }

        binding.bottomNavigationView.setOnItemSelectedListener(){
            when (it.itemId) {
                R.id.Beranda -> {
                    loadFragment(Home())
                    true
                }
                R.id.Activity -> {
                    loadFragment(search())
                    true
                }
                R.id.Map -> {
                    loadFragment(Person())
                    true
                }
                R.id.Profile -> {
                    loadFragment(settings())
                    true
                }
                else -> false
            }
        }

    }
    private fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }
}