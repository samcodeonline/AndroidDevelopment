package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class ActivityRecyclerView : AppCompatActivity() {

    lateinit var adapter: MyRecyclerViewAdapter

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        recyclerView = findViewById(R.id.recyclerView)
        initAdapter()
    }

    fun initAdapter() {
        adapter = MyRecyclerViewAdapter(getItems())
        recyclerView.adapter = adapter
    }

    fun getItems():ArrayList<RecyclerViewModel>{
        var items = ArrayList<RecyclerViewModel>()
        items.add(RecyclerViewModel("Hello title 1","hello description 1"))
        items.add(RecyclerViewModel("Hello title 2","hello description 2"))
        return items
    }
}