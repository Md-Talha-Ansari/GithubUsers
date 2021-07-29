package com.hind.githubusers.domain

class UsersList(usersList: List<UserBasicInfo>){

    private var _next:Int? = null
    private val _usersList = mutableListOf<UserBasicInfo>()

    val next:Int?
        get() = _next

    val userList:List<UserBasicInfo>
        get() = _usersList

    constructor(usersList: List<UserBasicInfo>,links:Map<String,String>?):this(usersList){
        _next = if(links.isNullOrEmpty()){
            null
        }else{
            parseLinksForNext(links)
        }
    }

    init {
        _usersList.addAll(usersList)
    }

    /**
     * Update next for fetching the next sequence of users list.
     * @param next Next user sequence id.
     */
    fun updateNext(next:Int?){
        _next = next
    }

    /**
     * Add the users to users list.
     * @param usersList users to add to users list.
     */
    fun addUsers(usersList: List<UserBasicInfo>){
        _usersList.addAll(usersList)
    }

    /**
     * Parse the next link in links to find the next link id.
     * @param links Link header values.
     */
    private fun parseLinksForNext(links:Map<String,String>):Int?{
        if(links.containsKey("next")){
            val nextLink = links["next"]
            if(nextLink.isNullOrEmpty()){
                return null
            }else if(nextLink.contains("since=")){
                return nextLink.split("=")[1].toInt()
            }
        }
        return null
    }

}