package com.persistence.dilip

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import java.io.File

class FileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_file)
        createFile(this, "fileactivity.txt")
        createFileWithOpenFileOutput(this, "openfile.txt", "This is a content")
        createCacheFile(this, "cache")
        openFile(this)
        openCacheDir(this)
    }

    fun createFile(context: Context, fileName: String) {
        val file = File(context.filesDir, fileName)
        file.writeText("This is new file text")
    }

    fun openFile(context: Context, fileName: String? = null) {
        val fileDir = context.filesDir
        for (file in fileDir.listFiles()) {
            Log.i("FileActivity", file.name)
        }
    }

    fun openCacheDir(context: Context) {
        val cacheFileDir = context.cacheDir
        for (file in cacheFileDir.listFiles()) {
            Log.i("FileActivity", file.name)
        }
    }

    fun createFileWithOpenFileOutput(context: Context, fileName: String, content: String) {
        context.openFileOutput(fileName, Context.MODE_PRIVATE).use {
            it.write(content.toByteArray())
        }
    }


    fun createCacheFile(context: Context, filename: String) {
        val file = File.createTempFile(filename, null, context.cacheDir)
        file.writeText("Cache file")
    }

}
