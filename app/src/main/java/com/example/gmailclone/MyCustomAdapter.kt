package com.example.gmailclone

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MyCustomAdapter (val items: ArrayList<ItemModel>): BaseAdapter() {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(p0: Int): Any {
        return items[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val row : View = LayoutInflater.from(p2?.context).inflate(R.layout.custom_row_icon_label, p2, false)
        val textView = row.findViewById<TextView>(R.id.caption)
        val imageView = row.findViewById<ImageView>(R.id.icon)
        val contentView = row.findViewById<TextView>(R.id.content)
        textView.text = items[p0].caption
        imageView.setImageResource(items[p0].imageResource)
        contentView.text = items[p0].content
        return row
    }

}