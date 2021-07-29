package com.hind.githubusers.domain

import com.hind.githubapp.MockDataProvider
import org.junit.Assert.assertNotNull
import org.junit.Test

class RemoteExceptionTest {

    @Test
    fun testRemoteException(){
        val remoteException = MockDataProvider.getRemoteException()
        assertNotNull(remoteException.message)
    }

}