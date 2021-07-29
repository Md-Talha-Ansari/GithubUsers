package com.hind.githubusers.domain

import com.hind.githubapp.MockDataProvider
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