package com.hind.githubusers.domain

interface ResultCallback<in R> {

    fun onSuccess(result:R)

    fun onError(error:Throwable)

}