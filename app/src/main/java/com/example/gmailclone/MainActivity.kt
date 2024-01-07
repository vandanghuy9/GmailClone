package com.example.gmailclone

import android.annotation.SuppressLint
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gmailclone.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var txtMsg : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val itemList = arrayListOf<ItemModel>()
        for (i in 1..13){
            itemList.add(
                ItemModel("Data $i",
                    resources.getIdentifier("dice_$i", "drawable", packageName),
                    getString(R.string.content)
                )
            )
        }
        val adapter = RCItemAdapter(itemList)
        val listView: RecyclerView = findViewById<RecyclerView>(R.id.rcView)
        listView.layoutManager = LinearLayoutManager(this)
        listView.adapter = adapter
    }

}