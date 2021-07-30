package com.hind.githubusers.presentation.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*

class MainViewModel: ViewModel() {
    private val delayTime = 1000L

    val canNavigate = MutableLiveData(false)

    /**
     * Delay for delayTime and then set canNavigate to true.
     */
    suspend fun delayNavigation() = withContext(Dispatchers.Default){
        delay(delayTime)
        canNavigate.postValue(true)
    }

}