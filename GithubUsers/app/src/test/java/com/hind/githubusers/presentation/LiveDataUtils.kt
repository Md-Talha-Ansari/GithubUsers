package com.hind.githubusers.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import java.util.concurrent.TimeoutException

fun <T> LiveData<T>.waitForValue():T{
    var value:T?= null

    val countDownLatch = CountDownLatch(1)


    val observer = object:Observer<T>{
        override fun onChanged(t: T) {
            value = t
            this@waitForValue.removeObserver(this)
            countDownLatch.countDown()
        }
    }

    this.observeForever(observer)
    try {
        if(!countDownLatch.await(30, TimeUnit.SECONDS)){
            throw TimeoutException("LiveData never get updated.")
        }
    }finally {
        this.removeObserver(observer)
    }

    return value as T
}