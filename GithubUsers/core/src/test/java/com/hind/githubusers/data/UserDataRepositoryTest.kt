package com.hind.githubapp.data


import com.hind.githubusers.data.MockUserDataSource
import com.hind.githubusers.data.UserDataRepository
import com.hind.githubusers.domain.ResultCallback
import com.hind.githubusers.domain.UserProfileInfo
import com.hind.githubusers.domain.UsersList
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class UserDataRepositoryTest {

    private lateinit var repository: UserDataRepository

    @Before
    fun setUp(){
        repository = UserDataRepository(MockUserDataSource())
    }

    @Test
    fun testGetUsers(){
        var users:UsersList? = null

        repository.getUsers(callback = object: ResultCallback<UsersList> {
            override fun onSuccess(result: UsersList) {
                users = result
            }

            override fun onError(error: Throwable) {

            }

        })

        assertNotNull(users)
        users?.let { assertTrue(it.userList.isNotEmpty()) }
    }

    @Test
    fun testGetUser(){
        var user: UserProfileInfo? = null
        repository.getUser("xyz",object : ResultCallback<UserProfileInfo>{
            override fun onSuccess(result: UserProfileInfo) {
                user = result
            }

            override fun onError(error: Throwable) {

            }

        })

        assertNotNull(user)
    }

}