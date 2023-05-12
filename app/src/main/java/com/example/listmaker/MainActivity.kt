package com.example.listmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.listmaker.databinding.ActivityMainBinding
import kotlin.reflect.KClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.btnSimpleLv.setOnClickListener{
            startActivity(Intent(this, SimpleListViewActivity::class.java))
        }

        binding.btnCustomLv.setOnClickListener{
            startActivity(Intent(this, CustomListViewActivity::class.java))
        }

        binding.btnCustomRv.setOnClickListener{
            startActivity(Intent(this, RecyclerViewActivity::class.java))
        }
    }
}