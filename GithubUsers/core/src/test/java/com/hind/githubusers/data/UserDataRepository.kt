package com.hind.githubusers.data

import com.hind.githubusers.domain.ResultCallback
import com.hind.githubusers.domain.UserProfileInfo
import com.hind.githubusers.domain.UsersList

class UserDataRepository(private val dataSource: UsersDataSource){

    fun getUsers(since:Int? = null, limit:Int?=null, callback: ResultCallback<UsersList>){
        dataSource.getUsers(since,limit,callback)
    }

    fun getUser(userName:String,callback: ResultCallback<UserProfileInfo>) = dataSource.getUser(userName,callback)

}