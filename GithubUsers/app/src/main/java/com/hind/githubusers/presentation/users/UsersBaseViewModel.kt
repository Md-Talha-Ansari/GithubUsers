package com.hind.githubusers.presentation.users

import androidx.lifecycle.ViewModel
import com.hind.githubusers.data.UserDataRepository

/**
 * Base class for Users related view models.
 */
abstract class UsersBaseViewModel(val dataRepository: UserDataRepository):ViewModel()
