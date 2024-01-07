package com.example.gmailclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RCItemAdapter(val items : ArrayList<ItemModel>): RecyclerView.Adapter<RCItemAdapter.RCItemViewAdapter>() {
    class RCItemViewAdapter(private val itemView: View): RecyclerView.ViewHolder(itemView) {
        val caption = itemView.findViewById<TextView>(R.id.caption)
        val imgFrame = itemView.findViewById<ImageView>(R.id.icon)
        val content = itemView.findViewById<TextView>(R.id.content)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RCItemAdapter.RCItemViewAdapter {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.custom_row_icon_label, parent, false)
        return RCItemViewAdapter(itemView)
    }

    override fun onBindViewHolder(holder: RCItemAdapter.RCItemViewAdapter, position: Int) {
        holder.imgFrame.setImageResource(items[position].imageResource)
        holder.caption.text = items[position].caption
        holder.content.text = items[position].content
    }

    override fun getItemCount(): Int {
        return items.size
    }
}