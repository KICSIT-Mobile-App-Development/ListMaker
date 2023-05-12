package com.example.listmaker

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import org.w3c.dom.Text


class CustomListviewAdapter(val context: Context, val dataSource: Array<String>) : BaseAdapter() {

    override fun getCount(): Int {
        return dataSource.size
    }

    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, p1: View?, parent: ViewGroup?): View {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.list_view_selection, parent, false)

        view.findViewById<TextView>(R.id.rowNum).text = (position + 1).toString()
        view.findViewById<TextView>(R.id.rowVal).text = dataSource[position]

        return view
    }

}
