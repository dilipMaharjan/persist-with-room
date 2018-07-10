package com.persistence.dilip.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.ForeignKey.CASCADE
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "books",
        foreignKeys = [(ForeignKey(
                entity = Anthology::class,
                parentColumns = arrayOf("id"),
                childColumns = arrayOf("id"),
                onDelete = CASCADE))
        ])
data class Book constructor(
        @ColumnInfo(name = "name")
        var bookName: String,
        var slug: String,
        @ColumnInfo(name = "anthology_id")
        var anthologyId: Int) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}