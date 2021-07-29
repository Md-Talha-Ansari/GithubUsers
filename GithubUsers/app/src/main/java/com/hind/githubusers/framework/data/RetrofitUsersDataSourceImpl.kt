package com.hind.githubusers.framework.data

import com.hind.githubusers.data.UsersDataSource
import com.hind.githubusers.domain.*
import com.hind.githubusers.framework.remote.GithubApiInterface
import com.hind.githubusers.framework.remote.RetrofitGithubClient
import com.hind.githubusers.framework.utils.HeaderUtils.parseLinkHeader
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RetrofitUsersDataSourceImpl : UsersDataSource {

    /**
     * Get users list asynchronously.
     * @param since Id after which to get the users.
     * @param limit maximum count of users to get.
     * @param callback Result callback.
     */
    override fun getUsers(since: Int?, limit: Int?, callback: ResultCallback<UsersList>) {
        RetrofitGithubClient.create(GithubApiInterface::class.java).getUsers(since,limit).enqueue(object:Callback<List<UserBasicInfo>>{
            override fun onResponse(
                call: Call<List<UserBasicInfo>>,
                response: Response<List<UserBasicInfo>>
            ) {
                val responseBody = response.body()
                if(response.isSuccessful && responseBody != null){
                    val linksHeader = response.headers().parseLinkHeader()
                    val users = UsersList(responseBody,linksHeader)
                    callback.onSuccess(users)
                }else{
                    callback.onError(RemoteException(response.errorBody().toString()))
                }
            }

            override fun onFailure(call: Call<List<UserBasicInfo>>, t: Throwable) {
                callback.onError(t)
            }

        })
    }

    /**
     * Get users profile information asynchronously.
     * @param userName user name to get information for.
     * @param callback Result callback.
     */
    override fun getUser(userName: String, callback: ResultCallback<UserProfileInfo>) {
        RetrofitGithubClient.create(GithubApiInterface::class.java).getUser(userName).enqueue(object:Callback<UserProfileInfo>{
            override fun onResponse(
                call: Call<UserProfileInfo>,
                response: Response<UserProfileInfo>
            ) {
                val responseBody = response.body()
                if(response.isSuccessful && responseBody != null){
                    callback.onSuccess(responseBody)
                }else{
                    callback.onError(RemoteException(response.errorBody().toString()))
                }
            }

            override fun onFailure(call: Call<UserProfileInfo>, t: Throwable) {
                callback.onError(t)
            }
        })
    }
}