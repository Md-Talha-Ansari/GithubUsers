package com.hind.githubusers.framework.remote

import com.hind.githubusers.domain.UserBasicInfo
import org.junit.Assert.assertNotNull
import org.junit.Test
import retrofit2.Call
import retrofit2.Response
import java.util.*

class GithubApiInterfaceTest {

    private val apiInterface = RetrofitGithubClient.create(GithubApiInterface::class.java)

    @Test
    fun testGetUsers(){

        val users:List<UserBasicInfo>? = asyncExecutor(apiInterface.getUsers())?.body()

        assertNotNull(users)
    }

    @Test
    fun testGetUser(){
        val user = asyncExecutor(apiInterface.getUser("mojombo"))?.body()
        assertNotNull(user)
    }

    /**
     * Method to execute async calls.
     * @param Call<R> Async call with return type R.
     * @return Return the response of type Response<R>?
     */
    private fun <R>asyncExecutor(call:Call<R>):Response<R>?{
        val synchronized = Object()
        var apiResponse:Response<R>? = null
        call.enqueue(object :retrofit2.Callback<R>{
            override fun onResponse(
                call: Call<R>,
                response: Response<R>
            ) {
                apiResponse = response
                synchronized(synchronized){
                    synchronized.notify()
                }
            }

            override fun onFailure(call: Call<R>, t: Throwable) {
                synchronized(synchronized){
                    synchronized.notify()
                }
            }
        })
        synchronized(synchronized){
            synchronized.wait()
        }
        return apiResponse
    }

}