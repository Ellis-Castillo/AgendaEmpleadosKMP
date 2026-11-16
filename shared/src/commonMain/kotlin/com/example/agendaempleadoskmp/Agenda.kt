package com.example.agendaempleadoskmp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Agenda(
    irIniciarSesion: () -> Unit,
    irConfiguracionApp: () -> Unit,
    irChat: () -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .navigationBarsPadding()
            .background(MaterialTheme.colorScheme.primaryContainer)
    ) {
        //NUEVA CITA
        //AGENDA
        //BARRA INFERIOR CON
        // -CERRAR SESION
        // -CHAT
        // -CONFIGURACION
    }
}