package com.hind.githubusers.usecases

import com.hind.githubusers.data.MockUserDataSource
import com.hind.githubusers.data.UserDataRepository
import com.hind.githubusers.domain.ResultCallback
import com.hind.githubusers.domain.UserProfileInfo
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class GetUserTest {

    private lateinit var repository: UserDataRepository
    private lateinit var useCase : GetUser

    @Before
    fun setUp(){
        repository = UserDataRepository(MockUserDataSource())
        useCase = GetUser(repository)
    }

    @Test
    fun testInvoke(){
        var user:UserProfileInfo? = null
        useCase.invoke("xyz",callback = object : ResultCallback<UserProfileInfo> {
            override fun onSuccess(result: UserProfileInfo) {
                user = result
            }

            override fun onError(error: Throwable) {
            }
        })

        assertNotNull(user)
    }

}