package com.hind.githubusers.presentation.users.list

import com.hind.githubusers.data.UserDataRepository
import com.hind.githubusers.presentation.users.UsersBaseViewModel
import com.hind.githubusers.usecases.GetUsersList

class UsersListViewModel(dataRepository: UserDataRepository) :UsersBaseViewModel(dataRepository) {

    private val usersListIneractor:GetUsersList by lazy { GetUsersList(dataRepository) }


}