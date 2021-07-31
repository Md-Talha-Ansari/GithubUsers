package com.hind.githubusers.presentation.users.profile

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.hind.githubusers.framework.data.RetrofitUsersDataSourceImpl
import com.hind.githubusers.presentation.users.UsersViewModelFactory
import com.hind.githubusers.presentation.users.list.UsersListViewModel
import com.hind.githubusers.presentation.waitForValue
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@ExperimentalCoroutinesApi
class UserProfileViewModelTest {

    private val viewModel: UserProfileViewModel by lazy {
        UsersViewModelFactory(RetrofitUsersDataSourceImpl()).create(UserProfileViewModel::class.java)
    }

    private val mockViewModel: UserProfileViewModel by lazy {
        UsersViewModelFactory(retrofitUsersDataSourceImpl).create(UserProfileViewModel::class.java)
    }

    @Mock
    private lateinit var retrofitUsersDataSourceImpl: RetrofitUsersDataSourceImpl

    private val testDispatcher = TestCoroutineDispatcher()
    // Run tasks synchronously
    @Rule
    @JvmField
    val instantExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setUp(){
        Dispatchers.setMain(testDispatcher)
    }

    @After
    fun tearDown(){
        Dispatchers.resetMain()
        testDispatcher.cleanupTestCoroutines()
    }

    @Test
    fun loadUserProfile() {
        viewModel.loadUserProfile("rsl")
        val profileData = viewModel.userProfileInfo.waitForValue()
        assertNotNull(profileData)
        assert(viewModel.isError.value == false)
        assert(viewModel.didLoad.value == true)
    }

}