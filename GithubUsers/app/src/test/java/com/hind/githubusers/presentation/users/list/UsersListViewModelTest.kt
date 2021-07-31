package com.hind.githubusers.presentation.users.list

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.hind.githubusers.framework.data.RetrofitUsersDataSourceImpl
import com.hind.githubusers.presentation.users.UsersViewModelFactory
import com.hind.githubusers.presentation.waitForValue
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@ExperimentalCoroutinesApi
class UsersListViewModelTest {

    private val viewModel: UsersListViewModel by lazy {
        UsersViewModelFactory(RetrofitUsersDataSourceImpl()).create(UsersListViewModel::class.java)
    }

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
    fun testLodNextUsers(){
        viewModel.loadNextUsers()
        val userList = viewModel.usersList.waitForValue()
        assertNotNull(userList)
        assert(!userList.userList.isNullOrEmpty())
        assertNotNull(userList.next)
        assert(viewModel.isLoadingUsers.value == false)
        assert(viewModel.canRetry.value == false)
        assert(viewModel.isError.value == false)
    }

}