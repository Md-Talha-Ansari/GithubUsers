package com.hind.githubusers.presentation.users.list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hind.githubusers.R
import com.hind.githubusers.databinding.ActivityUsersListBinding
import com.hind.githubusers.framework.data.RetrofitUsersDataSourceImpl
import com.hind.githubusers.presentation.users.UsersViewModelFactory
import com.hind.githubusers.presentation.users.profile.UserProfileActivity
import kotlinx.android.synthetic.main.activity_users_list.*

class UsersListActivity : AppCompatActivity() {
    //View model
    private val viewModel:UsersListViewModel by lazy {
        ViewModelProvider(this, UsersViewModelFactory(RetrofitUsersDataSourceImpl()))
            .get(UsersListViewModel::class.java)
    }

    //Recycler view adapter
    private val usersListAdapter:UsersListAdapter by lazy {
        UsersListAdapter(View.OnClickListener {
            if(viewModel.isLoadingUsers.value == false){
                //Navigate to next
                val intent = Intent(this,UserProfileActivity::class.java)
                intent.putExtra("username",it.tag.toString())
                startActivity(intent)
            }

        })
    }

    //Layout bindings
    private val binding: ActivityUsersListBinding by lazy{
        DataBindingUtil.setContentView(this,R.layout.activity_users_list)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBinding()
        initView()
        initObservers()
        viewModel.loadNextUsers()
    }

    /**
     * Method to initialize data binding.
     */
    private fun initBinding(){
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
    }

    /**
     * Scroll listener to Recycler view
     */
    private val scrollListener = object : RecyclerView.OnScrollListener(){
        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            super.onScrolled(recyclerView, dx, dy)
            if (!recyclerView.canScrollVertically(1) && dy > 0)
            {
                //scrolled to bottom load next users
                viewModel.loadNextUsers()
            }
        }
    }

    /**
     * Initializes the view porperties.
     */
    private fun initView(){
        val layoutManager = GridLayoutManager(this,3)
        usersListView.layoutManager = layoutManager
        usersListView.adapter = usersListAdapter

        usersListView.addOnScrollListener(scrollListener)
    }

    /**
     * Initialize the view model property observers.
     */
    private fun initObservers(){
        viewModel.usersList.observe(this, Observer {
            usersListAdapter.addUsers(it.userList)
        })
        viewModel.isError.observe(this, Observer {
            if(it){
                val message =  if(viewModel.canRetry.value == true) R.string.error_loading_users_retry else R.string.error_loading_users_swipe
                val toast = Toast.makeText(this,message,Toast.LENGTH_LONG)
                toast.setGravity(
                    Gravity.TOP,0,0)
                toast.show()
            }
        })
    }

    /**
     * Method to retry fetching user list.
     */
    fun onRetry(view: View) {
        viewModel.loadNextUsers()
    }

}