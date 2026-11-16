package com.example.agendaempleadoskmp

sealed class Rutas(val ruta: String) {
    object CargaInicio: Rutas("cargaInicio")
    object IniciarSesion: Rutas("iniciarSesion")
    object Registrarse: Rutas("registrarse")
    object ConfiguracionApp: Rutas("configuracionApp")
    object ConfiguracionAlertas: Rutas("configuracionAlertas")
    object ConfiguracionContrasena: Rutas("configuracionContrasena")
    object Agenda: Rutas("agenda")
    object Chat: Rutas("chat")
}