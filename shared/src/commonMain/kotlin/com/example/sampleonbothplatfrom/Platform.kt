package com.example.sampleonbothplatfrom

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform