package com.test.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.facebook.stetho.Stetho

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Stetho.initializeWithDefaults(this);
        setContentView(R.layout.activity_main)

        val db = WordRoomDatabase.getDatabase(application)
        db.wordDao().insert(Word(System.currentTimeMillis().toString()))
        db.wordDao().insert(Word(System.currentTimeMillis().toString()))
        db.wordDao().insert(Word(System.currentTimeMillis().toString()))

        val db2 = WordRoomDatabase2.getDatabase(application)
        db2.wordDao().insert(Word(System.currentTimeMillis().toString()))
        db2.wordDao().insert(Word(System.currentTimeMillis().toString()))
        db2.wordDao().insert(Word(System.currentTimeMillis().toString()))

        db.wordDao().alphabetizedWords
    }
}
