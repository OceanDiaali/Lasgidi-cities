package com.example.ocean.lasgidi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class Quiz : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val textView: TextView = findViewById(R.id.quiz_title)

        val extras = intent.extras ?: return

        val cityQuiz = extras.getString("City quiz")
        //val ab = actionBar

        //ab!!.setTitle("Quiz on $cityQuiz")
        textView.setText("$cityQuiz Quiz")

        //Toast.makeText(applicationContext, "Quiz on $cityQuiz", Toast.LENGTH_LONG).show()
    }

    fun startQuiz(view: View) {
        Toast.makeText(applicationContext, "Launching quiz..", Toast.LENGTH_LONG).show()
    }
} // end of class
