package com.test.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = WordRoomDatabase.getDatabase(application)
        db.wordDao().insert(Word("test"))
        db.wordDao().insert(Word("test1"))
        db.wordDao().insert(Word("test2"))
        db.wordDao().alphabetizedWords
    }
}
