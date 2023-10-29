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
import android.widget.ListView
import android.widget.TextView
import com.example.gmailclone.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var txtMsg : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_main)
        val itemList = arrayListOf<ItemModel>()
        for (i in 1..13){
            itemList.add(
                ItemModel("Data $i",
                    resources.getIdentifier("dice_$i", "drawable", packageName),
                    getString(R.string.content)
                )
            )
        }
        val adapter = MyCustomAdapter(itemList)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = adapter
    }

}