package com.example.listmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class CustomListViewActivity : AppCompatActivity() {
    private lateinit var customlistview: ListView
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
        setContentView(R.layout.activity_custom_list_view)

        customlistview = findViewById(R.id.customlistview)
        customlistview.adapter = CustomListviewAdapter(this, listTitles)
    }
}