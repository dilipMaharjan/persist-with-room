package com.persistence.dilip

import android.arch.persistence.room.Room
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDb = Room.databaseBuilder(this, MyAppDatabase::class.java, "mydb").allowMainThreadQueries().build()

//        add anthology
//        myDb.anthologyDao().addAnthology(Anthology(name = "Old Testament", slug = "ot"))
//        myDb.anthologyDao().addAnthology(Anthology(name = "New Testament", slug = "nt"))

        //adding a book
//        myDb.bookDao().addBook(Book(bookName = "Mathew", slug = "mat", anthologyId = 2))
//        myDb.bookDao().addBook(Book(bookName = "Mark", slug = "mrk", anthologyId = 1))

        //get a book by id
        //val book = myDb.bookDao().getBookById(10)
        val anthology = myDb.anthologyDao().getAnthologies()

        /*updating a book
        book.bookName = "Mark"
        book.slug = "ma"
        myDb.bookDao().updateBook(book)
        */

        /*delete a book
        myDb.bookDao().deleteBook(book)

        Log.i("MainActivity", book.toString())
        */
        Log.i("MainActivity", anthology.toString())
        Log.i("MainActivity", myDb.bookDao().getBooks().toString())
    }
}
