package com.example.listmaker

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listmaker.databinding.ListViewSelectionBinding

class CustomRecyclerviewAdapter(val context: Context, val dataSource: Array<String>) : RecyclerView.Adapter<CustomListSelectionViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CustomListSelectionViewHolder {
        val binding = ListViewSelectionBinding.inflate(LayoutInflater.from(context), parent, false)
        return CustomListSelectionViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataSource.size
    }

    override fun onBindViewHolder(holder: CustomListSelectionViewHolder, position: Int) {
        holder.binding.rowNum.text = (position + 1).toString()
        holder.binding.rowVal.text = dataSource[position]
    }


}
