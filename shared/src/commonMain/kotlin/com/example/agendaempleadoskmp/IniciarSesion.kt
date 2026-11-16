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
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
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
fun IniciarSesion(
    irRegistrarse: () -> Unit,
    irConfiguracionApp: () -> Unit,
    irAgenda: () -> Unit
){
    var nombreInput by rememberSaveable { mutableStateOf("") }
    var contrasenaInput by rememberSaveable { mutableStateOf("") }

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
                    .weight(6f),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text("Iniciar Sesión")

                Spacer( Modifier.height(8.dp) )

                TextoEditable(
                    etiqueta = "Nombre",
                    valor = nombreInput,
                    cambioTexto = { nombreInput = it },
                    keyboardOptions = KeyboardOptions.Default,
                    visualTransformation = VisualTransformation.None
                )

                Spacer( Modifier.height(8.dp) )

                HorizontalDivider()

                Spacer( Modifier.height(8.dp) )

                TextoEditable(
                    etiqueta = "Contraseña",
                    valor = contrasenaInput,
                    cambioTexto = { contrasenaInput = it },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    visualTransformation = PasswordVisualTransformation()
                )

                Button(
                    onClick = {
                        if (nombreInput.isNotBlank() && contrasenaInput.isNotBlank()){
                            irAgenda()
                        }
                    }
                ){
                    Text("Iniciar Sesión")
                }

                Spacer( Modifier.height(8.dp) )

                VinculoRegistrarse(irRegistrarse)
            }

            Spacer( Modifier.weight(2f) )

            BotonConfiguracion(
                irConfiguracionApp = irConfiguracionApp,
                modifier = Modifier
                    .weight(1f)
            )
        }
    }

}

@Composable
fun VinculoRegistrarse(
    irRegistrarse: () -> Unit
){
    Row(){
        Text("Si no tienes cuenta, ")
        Text(
            text = "crea una aquí",
            color = MaterialTheme.colorScheme.secondary,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.clickable { irRegistrarse() }
        )
    }
}

@Composable
fun TextoEditable(
    etiqueta: String,
    valor: String,
    cambioTexto: (String) -> Unit,
    keyboardOptions: KeyboardOptions,
    visualTransformation: VisualTransformation,
    modifier: Modifier = Modifier
){
    TextField(
        value = valor,
        onValueChange = cambioTexto,
        modifier = modifier,
        label = {
            Text(etiqueta)
        },
        visualTransformation = visualTransformation,
        singleLine = true,
        keyboardOptions = keyboardOptions,
    )
}

@Composable
fun CabeceraBienvenida(
    modifier: Modifier = Modifier
){
    Box(
        modifier
            .fillMaxWidth()
    ){
        Image(
            painter = painterResource(Res.drawable.calendarios),
            contentDescription = "Calendarios",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Image(
            painter = painterResource(Res.drawable.Nombre),
            contentDescription = "Nombre de la App",
            modifier = Modifier
                .size(72.dp)
        )
        Text(
            text = "Hecho por Ellis Castillo Schmuck",
            style = TextStyle(
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.inversePrimary,
                fontWeight = FontWeight.Bold,
                shadow = Shadow(
                    color = MaterialTheme.colorScheme.onSurface,
                    offset = Offset(4f, 4f),
                    blurRadius = 8f
                )
            ),
            modifier = Modifier
                .align(Alignment.BottomEnd)
        )
    }
}

@Composable
fun BotonConfiguracion(
    modifier: Modifier = Modifier,
    irConfiguracionApp: () -> Unit
){
    Row(
        horizontalArrangement = Arrangement.End,
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp)
    ){
        Button(
            onClick = irConfiguracionApp
        ){
            Text("Configuración")
        }
    }
}