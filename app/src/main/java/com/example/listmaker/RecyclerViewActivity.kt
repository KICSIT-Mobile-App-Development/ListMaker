package com.example.listmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listmaker.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
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

        val binding = ActivityRecyclerViewBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        binding.recyclerview.adapter = CustomRecyclerviewAdapter(this, listTitles)
    }
}