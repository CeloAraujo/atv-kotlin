package com.example.lanches

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lanches.model.Lanche

class MainActivity : Activity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: LanchesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_constraint)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        recyclerView = findViewById(R.id.recycler_view)
        adapter = LanchesAdapter(getLanches())
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun getLanches(): List<Lanche> {
        return listOf(
            Lanche("Siri Burger", "G", false),
            Lanche("Cheese Burger", "M", true),
            Lanche("Veggie Burger", "P", false),
            Lanche("Chicken Burger", "G", true),
            Lanche("Salmon Burger", "M", false),
            Lanche("BBQ Burger", "G", true)
        )
    }
}
