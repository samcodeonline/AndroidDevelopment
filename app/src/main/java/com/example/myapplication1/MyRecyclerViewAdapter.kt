package com.example.myapplication1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(var items:ArrayList<RecyclerViewModel>):
    RecyclerView.Adapter<MyRecyclerViewAdapter.MyRecyclerViewViewHolder>() {



    class MyRecyclerViewViewHolder(view:View):RecyclerView.ViewHolder(view){

         var tvTitle:TextView
         var tvDescription:TextView

        init {
            tvTitle = view.findViewById(R.id.tvTitle)
            tvDescription = view.findViewById(R.id.tvDescription)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyRecyclerViewViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.layout_recyclerview_item,parent,false)
        return MyRecyclerViewViewHolder(view)
    }

    override fun getItemCount(): Int {
    return items.size;
    }

    override fun onBindViewHolder(holder: MyRecyclerViewViewHolder, position: Int) {
        var item = items[position]
        holder.tvTitle.text = item.title
        holder.tvDescription.text = item.description
    }
}

