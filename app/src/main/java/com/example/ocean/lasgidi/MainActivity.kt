package com.example.ocean.lasgidi

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import android.view.ContextMenu.ContextMenuInfo


class MainActivity : AppCompatActivity() {

    var cities = arrayOf("Lagos", "Ikeja", "Yaba", "Mushin",
                         "Badagry", "Ikorodu", "Apapa", "Surulere",
                          "Alimosho", "Ebute-metta", "Shomolu", "Amuwo-odofin", "Kosofe")

    //var url: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(this, R.layout.listview_item, cities)


        val listView: ListView = findViewById(R.id.city_list)
        listView.setAdapter(adapter)

        listView.onItemClickListener = object : AdapterView.OnItemClickListener {

            override fun onItemClick(parent: AdapterView<*>, view: View,
                                     position: Int, id: Long) {

                val cityName = listView.getItemAtPosition(position) as String

                when(position) {
                    0 -> {
                        val i = Intent(applicationContext, City::class.java)
                        i.putExtra("City name", "$cityName")
                        startActivity(i)
                    }

                    1 -> {
                        val i = Intent(applicationContext, City::class.java)
                        i.putExtra("City name", "$cityName")
                        startActivity(i)
                    }

                    2 -> {
                        val i = Intent(applicationContext, City::class.java)
                        i.putExtra("City name", "$cityName")
                        startActivity(i)
                    }

                    3 -> {
                        val i = Intent(applicationContext, City::class.java)
                        i.putExtra("City name", "$cityName")
                        startActivity(i)
                    }

                    4 -> {
                        val i = Intent(applicationContext, City::class.java)
                        i.putExtra("City name", "$cityName")
                        startActivity(i)
                    }

                    5 -> {
                        val i = Intent(applicationContext, City::class.java)
                        i.putExtra("City name", "$cityName")
                        startActivity(i)
                    }

                    6 -> {
                        val i = Intent(applicationContext, City::class.java)
                        i.putExtra("City name", "$cityName")
                        startActivity(i)
                    }

                    7 -> {
                        val i = Intent(applicationContext, City::class.java)
                        i.putExtra("City name", "$cityName")
                        startActivity(i)
                    }

                    8 -> {
                        val i = Intent(applicationContext, City::class.java)
                        i.putExtra("City name", "$cityName")
                        startActivity(i)
                    }

                    9 -> {
                        val i = Intent(applicationContext, City::class.java)
                        i.putExtra("City name", "$cityName")
                        startActivity(i)
                    }

                    10 -> {
                        val i = Intent(applicationContext, City::class.java)
                        i.putExtra("City name", "$cityName")
                        startActivity(i)
                    }

                    11 -> {
                        val i = Intent(applicationContext, City::class.java)
                        i.putExtra("City name", "$cityName")
                        startActivity(i)
                    }

                     12 -> {
                        val i = Intent(applicationContext, City::class.java)
                        i.putExtra("City name", "$cityName")
                        startActivity(i)
                    }
                } // end of when block

            }
        }
    } // end of on create


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            R.id.about ->
                Toast.makeText(applicationContext, "About LASGIDI CITIES", Toast.LENGTH_LONG).show()
             R.id.help ->
                 Toast.makeText(applicationContext, "Get Help & Info", Toast.LENGTH_LONG).show()
            else -> super.onContextItemSelected(item)
        }

             return true
    }

} // end of class
