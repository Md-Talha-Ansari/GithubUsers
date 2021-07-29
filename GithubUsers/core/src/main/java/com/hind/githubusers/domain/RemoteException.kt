package com.hind.githubusers.domain

class RemoteException(val error:RemoteError) : Exception(error.message){
    constructor(error:String):this(RemoteError.fromString(error))
}