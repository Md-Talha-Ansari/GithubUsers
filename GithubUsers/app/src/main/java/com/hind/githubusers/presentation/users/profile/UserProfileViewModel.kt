package com.hind.githubusers.presentation.users.profile

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.hind.githubusers.data.UserDataRepository
import com.hind.githubusers.domain.ResultCallback
import com.hind.githubusers.domain.UserProfileInfo
import com.hind.githubusers.presentation.users.UsersBaseViewModel
import com.hind.githubusers.usecases.GetUser

class UserProfileViewModel(dataRepository: UserDataRepository):UsersBaseViewModel(dataRepository) {

    private val TAG = "UserProfileViewModel"

    private val userProfileInteractor:GetUser by lazy {
        GetUser(dataRepository)
    }

    val didLoad = MutableLiveData(true)
    val isError = MutableLiveData(false)

    val userProfileInfo = MutableLiveData<UserProfileInfo>()

    /**
     * Load user profile information.
     * @param userName User name to load profile for.
     */
    fun loadUserProfile(userName:String){
        userProfileInteractor.invoke(userName,object:ResultCallback<UserProfileInfo>{
            override fun onSuccess(result: UserProfileInfo) {
                userProfileInfo.postValue(result)
                didLoad.postValue(true)
            }

            override fun onError(error: Throwable) {
                Log.e(TAG,error.message.toString())
                didLoad.postValue(true)
                isError.postValue(true)
            }

        })
    }

}