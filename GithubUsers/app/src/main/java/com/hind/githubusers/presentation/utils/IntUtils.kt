package com.hind.githubusers.presentation.utils

import java.text.DecimalFormat

object IntUtils {

    fun Int.toShortHand(): String{
        val array = arrayOf(' ', 'k', 'M', 'B', 'T', 'P', 'E')
        val value = Math.floor(Math.log10(this.toDouble())).toInt()
        val  base = value / 3
        if (value >= 3 && base < array.size) {
            return DecimalFormat("#0.0").format(this/ Math.pow(10.0, (base * 3).toDouble())) + array[base]
        } else {
            return DecimalFormat("#,##0").format(this)
        }
    }

}