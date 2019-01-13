package com.github.freewind.kotlin.atomicfilestore

import java.io.File

fun main(args: Array<String>) {
    val dataDir = run {
        val dir = File("./db")
        if (!dir.exists()) dir.mkdir()
        dir
    }

    val fileStore = FileStore(dataDir)
    fileStore.write("Hello-" + System.currentTimeMillis())

    val content = fileStore.read()
    println(content)

    fileStore.clear()
}