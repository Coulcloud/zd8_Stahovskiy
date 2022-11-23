package com.example.zd8_stahovskiy

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.zd8_stahovskiy.ui.home.HomeFragment

lateinit var it2:menu
lateinit var it1:menu
lateinit var fragment: HomeFragment
lateinit var bt134:Button
lateinit var preferences: SharedPreferences
lateinit var namen:TextView


class CollectionScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collection_screen)
        preferences=PreferenceManager.getDefaultSharedPreferences(this)
        namen=findViewById(R.id.names)
        var name= preferences.getString("Name","")
        namen.setText(name)




    }
}
