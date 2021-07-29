package com.hind.githubusers.usecases

import com.hind.githubusers.data.UserDataRepository
import com.hind.githubusers.domain.ResultCallback
import com.hind.githubusers.domain.UserProfileInfo

class GetUser(private val repository: UserDataRepository) {
    operator fun invoke(userName:String,callback: ResultCallback<UserProfileInfo>) = repository.getUser(userName,callback)
}