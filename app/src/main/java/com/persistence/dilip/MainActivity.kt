package com.persistence.dilip

import android.arch.persistence.room.Room
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDb = Room.databaseBuilder(this, MyAppDatabase::class.java, "mydb").build()
        Log.i("MainActivity", myDb.bookDao().getBooks().toString())
    }
}
