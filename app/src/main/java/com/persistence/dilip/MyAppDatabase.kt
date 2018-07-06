package com.persistence.dilip

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.persistence.dilip.dao.BookDao
import com.persistence.dilip.model.Book

@Database(entities = [Book::class], version = 2)
abstract class MyAppDatabase : RoomDatabase() {
    abstract fun bookDao(): BookDao

}