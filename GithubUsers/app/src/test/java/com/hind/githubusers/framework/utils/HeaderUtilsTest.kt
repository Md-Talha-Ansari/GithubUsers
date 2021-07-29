package com.hind.githubusers.framework.utils

import com.hind.githubusers.framework.utils.HeaderUtils.parseLinkHeader
import org.junit.Test
import retrofit2.http.Header
import retrofit2.http.Headers

class HeaderUtilsTest {

    private val headers = okhttp3.Headers.Builder()
        .add("Link","<https://api.github.com/users?since=125>; rel=\"next\", <https://api.github.com/users{?since}>; rel=\"first\"")
        .build()

    @Test
    fun testParseLinkHeaders(){
       val headersMap = headers.parseLinkHeader()
        assert(!headersMap.isNullOrEmpty())
    }

}