package com.hind.githubusers.presentation.users.profile

import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.hind.githubusers.R
import com.hind.githubusers.databinding.ActivityUserProfileBinding
import com.hind.githubusers.framework.data.RetrofitUsersDataSourceImpl
import com.hind.githubusers.presentation.users.UsersViewModelFactory

class UserProfileActivity : AppCompatActivity() {

    private val binding:ActivityUserProfileBinding by lazy {
        DataBindingUtil.setContentView(this,R.layout.activity_user_profile)
    }

    private val viewModel:UserProfileViewModel by lazy {
        ViewModelProvider(this, UsersViewModelFactory(RetrofitUsersDataSourceImpl()))
            .get(UserProfileViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBinding()
        initViewModel()
        initObserver()
    }

    /**
     * Method to initialize data binding.
     */
    private fun initBinding(){
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
    }


    /**
     * Initialize the view model.
     */
    private fun initViewModel(){
        val userName = intent.getStringExtra("username")
        userName?.let {
            viewModel.loadUserProfile(userName)
        }
    }

    /**
     * Initialize observers for view model.
     */
    private fun initObserver(){
        viewModel.isError.observe(this, Observer {
            if(it){
                val toast = Toast.makeText(this,R.string.error_loading_profile,Toast.LENGTH_SHORT)
                toast.setGravity(
                    Gravity.TOP,0,0)
                toast.show()
                finish()
            }
        })
    }


}