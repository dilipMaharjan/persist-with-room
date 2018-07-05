package com.persistence.dilip.dao

import android.arch.persistence.room.*
import com.persistence.dilip.model.Book

@Dao
interface BookDao {

    @Insert
    fun addBook(book: Book)


    @Query("SELECT * FROM book")
    fun getBooks(): List<Book>

    @Delete
    fun deleteBook(book: Book)

    @Update
    fun updateBook(book: Book)
}