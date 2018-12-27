package com.example.ocean.lasgidi

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class City : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city)

        //val ab = actionBar

        val extras = intent.extras ?: return

        val citi = extras.getString("City name")

        var choices = arrayOf("Read about $citi", "Watch videos about $citi")

        val adapter = ArrayAdapter(this, R.layout.listview_item, choices)


        val listView: ListView = findViewById(R.id.city_view)
        listView.setAdapter(adapter)

        listView.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                when(position) {
                    0 -> {
                        val intent = Intent(Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/$citi")))
                        startActivity(intent)
                    }

                    1 -> {
                        val intent = Intent(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query=$citi")))
                        startActivity(intent)
                    }
                }
            }
        } // click listener

        /*val ab = actionBar

        ab!!.title = "This is new text for ActionBar title"*/

        //Toast.makeText(applicationContext, "City name: $citi", Toast.LENGTH_LONG).show()
    }
} // end of class
