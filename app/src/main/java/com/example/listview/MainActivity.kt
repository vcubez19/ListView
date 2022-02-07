package com.example.listview


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val listView = findViewById<ListView>(R.id.idListView)
        val cities = arrayOf("Chicago",
            "Houston",
            "Los Angeles",
            "New York",
            "Tampa",
            "San Diego")


        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, cities
        )


        listView.adapter = arrayAdapter


        listView.setOnItemClickListener { _, _, i, _ ->
            Toast.makeText(this, "Clicked ${cities[i]}", Toast.LENGTH_SHORT).show()
        }


    }
}

