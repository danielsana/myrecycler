package com.example.myrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //we find recycler by its id
        val myrecyclerview = findViewById<RecyclerView>(R.id.recyclerView)

        //layoutmanager sets recyclerview go vertical
        val layoutManager = LinearLayoutManager(this)

        //put the layout manager to recyclerview - view will be vertical
        myrecyclerview.layoutManager = layoutManager

        //access the recycleradapter(has the food array data)
        // and store in adapter variable
        val adapter = RecyclerAdapter(applicationContext)

        //set the adapter to recycler view
        myrecyclerview.adapter = adapter
    }
}