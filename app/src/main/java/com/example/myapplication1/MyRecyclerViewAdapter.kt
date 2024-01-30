package com.example.myapplication1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(var items:ArrayList<RecyclerViewModel>):
    RecyclerView.Adapter<MyRecyclerViewAdapter.MyRecyclerViewViewHolder>() {



    class MyRecyclerViewViewHolder(view:View):RecyclerView.ViewHolder(view){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyRecyclerViewViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.layout_recyclerview_item,parent,false)
        return MyRecyclerViewViewHolder(view)
    }

    override fun getItemCount(): Int {
    return items.size;
    }

    override fun onBindViewHolder(holder: MyRecyclerViewViewHolder, position: Int) {

    }
}

