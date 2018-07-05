package com.persistence.dilip.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "books")
data class Book constructor(
        @PrimaryKey
        var id: Int,
        @ColumnInfo(name = "name")
        var bookName: String,
        var slug: String) 