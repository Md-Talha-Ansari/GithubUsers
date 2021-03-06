package com.hind.githubusers.presentation.users

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hind.githubusers.data.UserDataRepository
import com.hind.githubusers.data.UsersDataSource
import com.hind.githubusers.presentation.users.list.UsersListViewModel
import com.hind.githubusers.presentation.users.profile.UserProfileViewModel

/**
 * View model factory for vie models of type UsersBaseViewModel.
 */
class UsersViewModelFactory(val dataSource: UsersDataSource):ViewModelProvider.NewInstanceFactory() {

    /**
     * Method to create view model instance of type T.
     * @param modelClass Class of view model.
     */
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        if(modelClass == UsersListViewModel::class.java){
            return UsersListViewModel(UserDataRepository(dataSource)) as T
        }else if(modelClass == UserProfileViewModel::class.java){
            return UserProfileViewModel(UserDataRepository(dataSource)) as T
        }

        return super.create(modelClass)
    }

}