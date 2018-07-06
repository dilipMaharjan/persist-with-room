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

        //adding a book
        //   myDb.bookDao().addBook(Book(bookName = "Mathew", slug = "mat"))

        //get a book by id
        //val book = myDb.bookDao().getBookById(10)

        /*updating a book
        book.bookName = "Mark"
        book.slug = "ma"
        myDb.bookDao().updateBook(book)
        */

        /*delete a book
        myDb.bookDao().deleteBook(book)

        Log.i("MainActivity", book.toString())
        */
        Log.i("MainActivity", myDb.bookDao().getBooks().toString())
    }
}
