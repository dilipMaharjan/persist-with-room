package com.persistence.dilip.dao

import android.arch.persistence.room.*
import com.persistence.dilip.model.Anthology

@Dao
interface AnthologyDao {
    @Insert
    fun addAnthology(anthology: Anthology)


    @Query("SELECT * FROM anthologies")
    fun getAnthologies(): List<Anthology>

    @Delete
    fun deleteAnthology(book: Anthology)

    @Update
    fun updateAnthology(book: Anthology)

    @Query("SELECT * FROM anthologies where id = :id")
    fun getAnthologyById(id: Int): Anthology
}