package com.hind.githubusers.framework.utils

import okhttp3.Headers

object HeaderUtils {

    /**
     * Parse the Link headers link.
     * @return Map of links in Link header.
     */
    fun Headers.parseLinkHeader():Map<String,String>{
        val links = get("Link")
        val map = mutableMapOf<String,String>()
        links?.split(",")?.forEach {
            val link = it.replace("<","")
                .replace(">","")
                .replace("\"","")
                .replace("rel=","")
                .replace(" ","")
            val linkInfo = link.split(";")
            map[linkInfo[1]] = linkInfo[0]
        }
        return map.toMap()
    }

}