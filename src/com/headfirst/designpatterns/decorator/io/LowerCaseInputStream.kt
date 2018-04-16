/*
 * Copyright (c) 16/4/2018
 * @author: vikas.naidu
 */

package com.headfirst.designpatterns.decorator.io

import java.io.*

class LowerCaseInputStream(`in`: InputStream) : FilterInputStream(`in`) {

    @Throws(IOException::class)
    override fun read(): Int {
        val c = `in`.read()
        return if (c == -1) c else Character.toLowerCase(c.toChar()).toInt()
    }

    @Throws(IOException::class)
    override fun read(b: ByteArray, offset: Int, len: Int): Int {
        val result = `in`.read(b, offset, len)
        for (i in offset until offset + result) {
            b[i] = Character.toLowerCase(b[i].toChar()).toByte()
        }
        return result
    }
}
