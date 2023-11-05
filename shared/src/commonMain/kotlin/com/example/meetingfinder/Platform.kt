package com.example.meetingfinder

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform