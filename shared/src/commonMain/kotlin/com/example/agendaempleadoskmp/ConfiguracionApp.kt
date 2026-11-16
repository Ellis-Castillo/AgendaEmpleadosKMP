package com.example.agendaempleadoskmp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ConfiguracionApp(
    volver: () -> Unit,
    irConfiguracionContrasena: () -> Unit,
    irConfiguracionAlertas: () -> Unit
){
    var abrirConfiguracion by remember { mutableStateOf(false) }
    var tamanyoTexto by remember { mutableStateOf("Mediano") }
    var temaOscuro by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .navigationBarsPadding()
            .background(MaterialTheme.colorScheme.primaryContainer)
    ) {
        //BARRA SUPERIOR CON VOLVER
        Row(
            modifier = Modifier
                .weight(1f)
                .defaultMinSize(minHeight = 40.dp)
        ){
            TopAppBar(
                title = "Con",
            )
        }
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.weight(10f)
        ){
            //BOTON PERSONALIZAR APP
            Button(
                onClick = {abrirConfiguracion = !abrirConfiguracion}
            ){}
            // - CONTROLAR TAMAÑO LETRA Y COLOR
            if (abrirConfiguracion){
                //CONTROLAR TAMAÑO
                Row(){
                    Column(){
                        Text("Tamaño de fuente")
                    }
                    Column(){
                        SelectorRadialConTexto(
                            descriptor = "Pequeño",
                            opcion = tamanyoTexto,
                            alSeleccionar = { tamanyoTexto = "Pequeño"}
                        )
                        SelectorRadialConTexto(
                            descriptor = "Mediano",
                            opcion = tamanyoTexto,
                            alSeleccionar = { tamanyoTexto = "Mediano"}
                        )
                        SelectorRadialConTexto(
                            descriptor = "Grande",
                            opcion = tamanyoTexto,
                            alSeleccionar = { tamanyoTexto = "Grande"}
                        )
                    }
                }
                //CONTROLAR COLOR
                Row(){
                    Text("Activar tema oscuro")
                    Spacer( modifier = Modifier.weight(1f) )
                    Switch(
                        checked = temaOscuro,
                        onCheckedChange = { !temaOscuro }
                    )
                }
            }
            //BOTON CONFIGURAR ALERTAS (Navegación)
            //Button(){}
            //BOTON CONFIGURAR CONTRASEÑA (Navegación)
            //Button(){}
        }
    }
}

@Composable
fun SelectorRadialConTexto(
    descriptor: String,
    opcion: String,
    alSeleccionar: () -> Unit
){
    Box(){
        RadioButton(
            selected = opcion == descriptor,
            onClick = alSeleccionar
        )
        Text(
            text = descriptor,
            modifier = Modifier
                .offset(y = 8.dp)
        )
    }
}