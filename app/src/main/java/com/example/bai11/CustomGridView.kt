package com.example.bai11

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomGridView (val activity: Activity, val list: List<OutData>) :ArrayAdapter<OutData>(activity,R.layout.layout_item) {


    override fun getCount(): Int {
        return list.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val context = activity.layoutInflater
        val row = context.inflate(R.layout.layout_item,parent,false)

        val img = row.findViewById<ImageView>(R.id.images)
        val name = row.findViewById<TextView>(R.id.textView)

        img.setImageResource(list[position].img)
        name.setText(list[position].name)
        return  row
    }
}