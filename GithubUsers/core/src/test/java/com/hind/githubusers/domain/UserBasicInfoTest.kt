package com.hind.githubusers.domain

import com.google.gson.Gson
import com.hind.githubapp.MockDataProvider
import com.hind.githubusers.domain.UserBasicInfo
import org.junit.Assert.assertNotNull
import org.junit.Test

class UserBasicInfoTest {

    @Test
    fun testFromString(){
        val userBasicInfo = Gson().fromJson(MockDataProvider.getUserBasicInfo(), UserBasicInfo::class.java)
        assertNotNull(userBasicInfo)
    }

    @Test
    fun testFromConstructor(){

        val userBasicInfo = UserBasicInfo("","","","","",""
            ,"",0,"","","","","",false,""
            ,"","","")
        assertNotNull(userBasicInfo)
    }
}