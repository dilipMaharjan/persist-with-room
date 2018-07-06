package com.persistence.dilip.model

import android.arch.persistence.room.Entity

@Entity
data class Anthology(var name: String, val slug: String) {
    val id: Int? = null
}