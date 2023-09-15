package com.example.sampleonbothplatfrom.data

data class Credentials(
    var login: String = "",
    var pwd: String = "",
) {
    fun isNotEmpty(): Boolean {
        return login.isNotEmpty() && pwd.isNotEmpty()
    }
}