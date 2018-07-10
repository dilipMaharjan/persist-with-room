package com.persistence.dilip.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "anthologies")
data class Anthology(var name: String, var slug: String) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}