package com.hind.githubusers.framework.data


import com.hind.githubusers.domain.ResultCallback
import com.hind.githubusers.domain.UserProfileInfo
import com.hind.githubusers.domain.UsersList
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class RetrofitUserDataSourceTest {

    private lateinit var dataSource:RetrofitUsersDataSourceImpl

    @Before
    fun setUp(){
        dataSource = RetrofitUsersDataSourceImpl()
    }

    @Test
    fun testGetUsers(){

        var users: UsersList? = null
        val lockObject = Object()

        dataSource.getUsers(null,null,object: ResultCallback<UsersList> {
            override fun onSuccess(result: UsersList) {
                users = result
                synchronized(lockObject){
                    lockObject.notify()
                }
            }

            override fun onError(error: Throwable) {
                synchronized(lockObject){
                    lockObject.notify()
                }
            }

        })

        synchronized(lockObject){
            lockObject.wait()
        }

        assertNotNull(users)
        assert(!users?.userList.isNullOrEmpty())
    }

    @Test
    fun testGetUser(){

        var user:UserProfileInfo? = null
        val lockObject = Object()

        dataSource.getUser("mojombo",object:ResultCallback<UserProfileInfo>{
            override fun onSuccess(result: UserProfileInfo) {
                user = result
                synchronized(lockObject){
                    lockObject.notify()
                }
            }

            override fun onError(error: Throwable) {
                synchronized(lockObject){
                    lockObject.notify()
                }
            }

        })

        synchronized(lockObject){
            lockObject.wait()
        }

        assertNotNull(user)
    }

}