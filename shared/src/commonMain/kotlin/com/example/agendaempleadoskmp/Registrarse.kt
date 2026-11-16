package com.example.agendaempleadoskmp

import agendaempleadoskmp.shared.generated.resources.Nombre
import agendaempleadoskmp.shared.generated.resources.Res
import agendaempleadoskmp.shared.generated.resources.calendarios
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource

@Composable
fun Registrarse(
    irIniciarSesion: () -> Unit,
    irConfiguracionApp: () -> Unit,
    irAgenda: () -> Unit
){
    var nombreInput by rememberSaveable { mutableStateOf("") }
    var contrasenaPrimerInput by rememberSaveable { mutableStateOf("") }
    var contrasenyaSegundoInput by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .navigationBarsPadding()
            .background(MaterialTheme.colorScheme.primaryContainer)
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 8.dp)
        ){
            CabeceraBienvenida(
                modifier = Modifier
                    .weight(4f)
            )
            Spacer( Modifier.height(8.dp) )
            Column(
                Modifier
                    .fillMaxWidth()
                    .weight(7f),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text("Crear una Cuenta")

                Spacer( Modifier.height(8.dp) )

                TextoEditable(
                    etiqueta = "Nombre",
                    valor = nombreInput,
                    cambioTexto = { nombreInput = it },
                    keyboardOptions = KeyboardOptions.Default,
                    visualTransformation = VisualTransformation.None
                )

                Spacer( Modifier.height(4.dp) )

                HorizontalDivider()

                Spacer( Modifier.height(4.dp) )

                TextoEditable(
                    etiqueta = "Contraseña",
                    valor = contrasenaPrimerInput,
                    cambioTexto = { contrasenaPrimerInput = it },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    visualTransformation = PasswordVisualTransformation()
                )

                Spacer( Modifier.height(8.dp) )

                TextoEditable(
                    etiqueta = "Confirma tu contraseña",
                    valor = contrasenyaSegundoInput,
                    cambioTexto = { contrasenyaSegundoInput = it },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    visualTransformation = PasswordVisualTransformation()
                )

                Button(
                    onClick = {
                        if (nombreInput.isNotBlank() && contrasenaPrimerInput.isNotBlank()){
                            if (contrasenaPrimerInput.equals(contrasenyaSegundoInput)){
                                irAgenda()
                            } else{
                                //SALTA ERROR
                            }
                        }
                    }
                ){
                    Text("Crear Cuenta")
                }

                Spacer( Modifier.height(8.dp) )

                VinculoIniciarSesion(irIniciarSesion)
            }

            Spacer( Modifier.weight(1f) )

            BotonConfiguracion(
                irConfiguracionApp = irConfiguracionApp,
                modifier = Modifier
                    .weight(1f)
            )
        }
    }

}

@Composable
fun VinculoIniciarSesion(
    irIniciarSesion: () -> Unit
){
    Row(){
        Text("¿Ya tienes una cuenta? ")
        Text(
            text = "Inicia sesión aquí",
            color = MaterialTheme.colorScheme.secondary,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.clickable { irIniciarSesion() }
        )
    }
}