package com.example.agendaempleadoskmp

import agendaempleadoskmp.shared.generated.resources.Logo
import agendaempleadoskmp.shared.generated.resources.Nombre
import agendaempleadoskmp.shared.generated.resources.Res
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource

@Composable
fun CargaInicio(
    continuar: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = 100.dp)
        ){
            Image(
                contentDescription = "Logo de la aplicación",
                painter = painterResource(Res.drawable.Logo),
                modifier = Modifier.size(280.dp)
            )
            Image(
                contentDescription = "Nombre de la aplicación",
                painter = painterResource(Res.drawable.Nombre),
                modifier = Modifier.size(280.dp)
            )
        }
    }
}