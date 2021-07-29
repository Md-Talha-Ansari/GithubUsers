package com.hind.githubusers.domain

import com.google.gson.Gson
import com.hind.githubapp.MockDataProvider
import com.hind.githubusers.domain.UserBasicInfo
import com.hind.githubusers.domain.UsersList
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Before
import org.junit.Test

class UsersListTest {

    private  lateinit var users:List<UserBasicInfo>

    @Before
    fun setUp(){
        users = Gson().fromJson(MockDataProvider.getUsers(),ArrayList<UserBasicInfo>().javaClass)
    }

    @Test
    fun testUserList(){
        val links = mapOf("next" to "https://api.github.com/users?since=46","rel" to "https://api.github.com/users?since")

        //Test primary constructor
        var usersList = UsersList(users,links)
        assertNotNull(usersList.userList)
        assert(usersList.userList.isNotEmpty())
        assertNotNull(usersList.next)

        //Test secondary constructor
        usersList = UsersList(users)
        assertNotNull(usersList.userList)
        assert(usersList.userList.isNotEmpty())
        assertNull(usersList.next)

        //Test add users
        val count = usersList.userList.count() + users.count()
        usersList.addUsers(users)
        assert(usersList.userList.count() == count)

        //Test next update
        usersList.updateNext( 2)
        assert(usersList.next == 2)

    }


}