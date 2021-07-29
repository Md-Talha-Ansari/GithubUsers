package com.hind.githubusers.data

import com.hind.githubusers.domain.ResultCallback
import com.hind.githubusers.domain.UserProfileInfo
import com.hind.githubusers.domain.UsersList

interface UsersDataSource {

    fun getUsers(since: Int? = null, limit:Int? = 30, callback: ResultCallback<UsersList>)

    fun getUser(userName:String,callback: ResultCallback<UserProfileInfo>)
}