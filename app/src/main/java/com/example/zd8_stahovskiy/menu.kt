package com.example.zd8_stahovskiy

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.zd8_stahovskiy.R.id.item_title1
import com.example.zd8_stahovskiy.R.id.navigation_home
import com.example.zd8_stahovskiy.databinding.ActivityMenuBinding

class menu : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding
    private lateinit var bottomNavigationView:BottomNavigationView
    private lateinit var butt1:Button
    private lateinit var NameFilm:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        NameFilm=findViewById(R.id.item_title1)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        butt1=findViewById(R.id.InfoForFilm)
        butt1.setOnClickListener()
        {
            var intent = Intent(this, InfoFulm::class.java)
            startActivity(intent)
            getSharedPreferences(NameFilm.text.toString(), Context.MODE_PRIVATE)
        }

        val navView: BottomNavigationView = binding.navView
        bottomNavigationView=findViewById(R.id.kinofrag1)

        val navController = findNavController(R.id.nav_host_fragment_activity_menu)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
               R.id.navigation_dashboard,
                R.id.navigation_notifications

            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

    }
}