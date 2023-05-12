package com.example.listmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class SimpleListViewActivity : AppCompatActivity() {
    private lateinit var simplelistview: ListView
    val listTitles = arrayOf(
        "Harry", "Ross",
        "Bruce", "Cook",
        "Carolyn", "Morgan",
        "Albert", "Walker",
        "Randy", "Reed",
        "Larry", "Barnes",
        "Lois", "Wilson",
        "Jesse", "Campbell",
        "Ernest", "Rogers",
        "Theresa", "Patterson",
        "Henry", "Simmons",
        "Michelle", "Perry",
        "Frank", "Butler",
        "Shirley"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_list_view)

        simplelistview = findViewById(R.id.simplelistview)
        simplelistview.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listTitles)
    }
}