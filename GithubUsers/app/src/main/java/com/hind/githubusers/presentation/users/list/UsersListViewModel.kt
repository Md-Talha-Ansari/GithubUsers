package com.hind.githubusers.presentation.users.list

import androidx.lifecycle.MutableLiveData
import com.hind.githubusers.data.UserDataRepository
import com.hind.githubusers.domain.ResultCallback
import com.hind.githubusers.domain.UsersList
import com.hind.githubusers.presentation.users.UsersBaseViewModel
import com.hind.githubusers.usecases.GetUsersList

class UsersListViewModel(dataRepository: UserDataRepository) :UsersBaseViewModel(dataRepository) {

    private val usersListInteractor:GetUsersList by lazy { GetUsersList(dataRepository) }

    val usersList = MutableLiveData<UsersList>()

    val isLoadingUsers = MutableLiveData(false)

    val isError = MutableLiveData(false)

    val canRetry = MutableLiveData(false)

    /**
     * Loads the next users.
     */
    fun loadNextUsers() {
        if(isLoadingUsers.value == true){
            return
        }
        canRetry.postValue(false)
        val next = usersList.value?.next
        isLoadingUsers.postValue(true)
        if (next != null) {
            usersListInteractor.invoke(next, callBack)
        } else {
            usersListInteractor.invoke(callBack)
        }

    }

    //Result callback from use case.
    private val callBack = object : ResultCallback<UsersList> {
        override fun onSuccess(result: UsersList) {
            usersList.postValue(result)
            isLoadingUsers.postValue(false)
            canRetry.postValue(false)
        }

        override fun onError(error: Throwable) {
            isLoadingUsers.postValue(false)
            isError.postValue(true)
            if(usersList.value?.userList.isNullOrEmpty()){
                canRetry.postValue(true)
            }
        }
    }


}