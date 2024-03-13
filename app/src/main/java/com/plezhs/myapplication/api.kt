package com.plezhs.myapplication

import java.security.SecureRandom
import java.util.Random

class api {
    private val secureRandom = SecureRandom()
    fun generateToken(leng: Int): String {
        val leftLimit = 48 // numeral '0'
        val rightLimit = 122 // letter 'z'
        val random = Random()
        return random.ints(leftLimit, rightLimit + 1)
            .filter { i: Int -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97) }
            .limit(leng.toLong())
            .collect(
                { StringBuilder() },
                { obj: java.lang.StringBuilder, codePoint: Int ->
                    obj.appendCodePoint(
                        codePoint
                    )
                }
            ) { obj: java.lang.StringBuilder, s: java.lang.StringBuilder? ->
                obj.append(
                    s
                )
            }
            .toString()
    }
}