package com.hind.githubusers.data

import com.google.gson.Gson
import com.hind.githubusers.MockDataProvider
import com.hind.githubusers.domain.ResultCallback
import com.hind.githubusers.domain.UserBasicInfo
import com.hind.githubusers.domain.UserProfileInfo
import com.hind.githubusers.domain.UsersList


class MockUserDataSource:UsersDataSource{

    override fun getUsers(since: Int?, limit: Int?, callback: ResultCallback<UsersList>) {
        val users = Gson().fromJson(MockDataProvider.getUsers(), ArrayList<UserBasicInfo>().javaClass)
        callback.onSuccess(UsersList(users))
    }

    override fun getUser(userName: String, callback: ResultCallback<UserProfileInfo>) {
        callback.onSuccess(Gson().fromJson(MockDataProvider.getUserProfileInfo(),UserProfileInfo::class.java))
    }

}