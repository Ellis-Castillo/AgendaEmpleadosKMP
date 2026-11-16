package com.example.agendaempleadoskmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform