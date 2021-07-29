package com.hind.githubusers.usecases

import com.hind.githubusers.data.MockUserDataSource
import com.hind.githubusers.data.UserDataRepository
import com.hind.githubusers.domain.ResultCallback
import com.hind.githubusers.domain.UsersList
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class GetUsersTest {

    private lateinit var repository: UserDataRepository
    private lateinit var useCase : GetUsersList

    @Before
    fun setUp(){
        repository = UserDataRepository(MockUserDataSource())
        useCase = GetUsersList(repository)
    }

    @Test
    fun testInvoke(){
        var users:UsersList? = null

        val callback = object : ResultCallback<UsersList> {
            override fun onSuccess(result: UsersList) {
                users = result
            }

            override fun onError(error: Throwable) {
            }

        }

        useCase.invoke(callback)

        assertNotNull(users)
        users?.let { assertTrue(it.userList.isNotEmpty()) }

        users = null

        useCase.invoke(10,callback)

        assertNotNull(users)
        users?.let { assertTrue(it.userList.isNotEmpty()) }

        users = null
        useCase.invoke(10,10,callback)

        assertNotNull(users)
        users?.let { assertTrue(it.userList.isNotEmpty()) }
    }
}