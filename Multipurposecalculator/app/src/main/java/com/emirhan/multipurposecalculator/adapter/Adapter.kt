package com.emirhan.multipurposecalculator.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.emirhan.multipurposecalculator.databinding.RecyclerowBinding
import com.emirhan.multipurposecalculator.view.hesapMakinesiData

class adapter(private val items:List<hesapMakinesiData>, private val navController: NavController):RecyclerView.Adapter<adapter.adapterViewHolder>() {
    class adapterViewHolder(val binding: RecyclerowBinding):RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapterViewHolder {
        val binding=RecyclerowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return adapterViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: adapterViewHolder, position: Int) {
        val item=items[position]
        holder.binding.textk.text=item.fragmentName
        holder.binding.root.setOnClickListener {
            navController.navigate(item.action)
        }
}   }