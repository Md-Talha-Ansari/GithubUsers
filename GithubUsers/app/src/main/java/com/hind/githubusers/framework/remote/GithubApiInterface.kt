package com.hind.githubusers.framework.remote

import com.hind.githubusers.domain.UserBasicInfo
import com.hind.githubusers.domain.UserProfileInfo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface GithubApiInterface {

    @Headers("accept:application/vnd.github.v3+json")
    @GET("/users")
    fun getUsers(@Query("since") since:Int? = null,@Query("per_page") maxPerPage:Int? = 30): Call<List<UserBasicInfo>>

    @Headers("accept:application/vnd.github.v3+json")
    @GET("/users/{username}")
    fun getUser(@Path("username") user:String): Call<UserProfileInfo>

}
