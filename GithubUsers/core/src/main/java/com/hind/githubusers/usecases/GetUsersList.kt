package com.hind.githubusers.usecases

import com.hind.githubusers.data.UserDataRepository
import com.hind.githubusers.domain.ResultCallback
import com.hind.githubusers.domain.UsersList

class GetUsersList(private val repository: UserDataRepository) {

    operator fun invoke(since:Int,limit:Int,callback: ResultCallback<UsersList>) = repository.getUsers(since,limit,callback)

    operator fun invoke(since: Int, callback: ResultCallback<UsersList>) = repository.getUsers(since = since,callback = callback)

    operator fun invoke(callback: ResultCallback<UsersList>) = repository.getUsers(callback = callback)

}