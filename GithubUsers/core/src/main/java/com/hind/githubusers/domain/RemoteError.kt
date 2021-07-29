package com.hind.githubusers.domain

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName

data class RemoteError(val message:String,@SerializedName("documentation_url") val documentationUrl:String){

    companion object{
        /**
         * Convert json string to RemoteError
         * @param string Json string
         */
        fun fromString(string: String) = Gson().fromJson(string,RemoteError::class.java)
    }

    override fun toString(): String {
        return Gson().toJson(this)
    }

}