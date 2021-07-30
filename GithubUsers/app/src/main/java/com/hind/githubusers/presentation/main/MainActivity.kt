package com.hind.githubusers.presentation.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.hind.githubusers.R
import com.hind.githubusers.databinding.ActivityMainBinding
import com.hind.githubusers.presentation.users.list.UsersListActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val viewModel:MainViewModel by lazy {
        ViewModelProvider(this).get(MainViewModel::class.java)
    }

    private val binding:ActivityMainBinding by lazy {
        DataBindingUtil.setContentView(this,R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        //Observe navigation state of view model
        observeNavigationStatus()
        //Initiate delay of 1 second
        initiateNavigationDelay()
    }

    /**
     * Method sets the observer for view model canNavigate.
     */
    private fun observeNavigationStatus(){
        viewModel.canNavigate.observe(this, Observer {
            if(it){//If true navigate to Users list
                startActivity(Intent(this, UsersListActivity::class.java))
                finish()
            }
        })
    }

    /**
     * This method initiate the 1 second delay for canNavigate update.
     */
    private fun initiateNavigationDelay() = CoroutineScope(Dispatchers.Main).launch{
        viewModel.delayNavigation()
    }
}