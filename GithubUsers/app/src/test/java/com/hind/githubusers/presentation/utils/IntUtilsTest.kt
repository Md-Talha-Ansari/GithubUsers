package com.hind.githubusers.presentation.utils

import com.hind.githubusers.presentation.utils.IntUtils.toShortHand
import org.junit.Test

import org.junit.Assert.*

class IntUtilsTest {

    @Test
    fun toShortHand() {
        val shortHand = 22615.toShortHand()
        assertEquals(shortHand,"22.6k")
    }
}