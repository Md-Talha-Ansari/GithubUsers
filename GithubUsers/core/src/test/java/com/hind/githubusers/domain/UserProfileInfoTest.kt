package com.hind.githubusers.domain

import com.google.gson.Gson
import com.hind.githubusers.MockDataProvider
import com.hind.githubusers.domain.UserProfileInfo
import org.junit.Assert.assertNotNull
import org.junit.Test

class UserProfileInfoTest {

    @Test
    fun testFromString(){
        val profileInfo = Gson().fromJson(MockDataProvider.getUserProfileInfo(), UserProfileInfo::class.java)
        assertNotNull(profileInfo)
    }

    @Test
    fun testFromConstructor(){
        val profileInfo = UserProfileInfo("","","","","","","",
            0,"",0,"","","",false,"",0,
            "","","","","",0,0,"","",
        false,"","","","","","")
        assertNotNull(profileInfo)
    }

}