package com.hind.githubusers.framework.remote

import org.junit.Assert.assertNotNull
import org.junit.Test

class RetrofitClientTest {

    @Test
    fun testApiInterface(){
        assertNotNull(RetrofitGithubClient.create(GithubApiInterface::class.java))
    }

}