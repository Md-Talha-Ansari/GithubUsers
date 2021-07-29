package com.hind.githubusers.domain

import com.hind.githubusers.MockDataProvider
import org.junit.Assert.assertNotNull
import org.junit.Test

class RemoteErrorTest {

    @Test
    fun testRemoteError(){
        val remoteError = RemoteError.fromString(MockDataProvider.getRemoteErrorString())
        assertNotNull(remoteError.message)
        assertNotNull(remoteError.documentationUrl)
    }

}