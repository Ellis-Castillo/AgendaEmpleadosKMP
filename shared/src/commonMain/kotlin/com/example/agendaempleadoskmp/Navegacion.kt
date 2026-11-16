package com.example.agendaempleadoskmp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.compose.*
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.milliseconds

@Composable
fun Navegacion(
){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Rutas.CargaInicio.ruta
    ){

        //ENTRADA
        composable(Rutas.CargaInicio.ruta){
            LaunchedEffect(Unit){
                delay(2000.milliseconds)

                navController.navigate(Rutas.IniciarSesion.ruta){
                    popUpTo(Rutas.CargaInicio.ruta) {
                        inclusive = true
                    }
                }
            }

            CargaInicio(
                continuar = {
                    navController.navigate(Rutas.IniciarSesion.ruta){
                        popUpTo(Rutas.CargaInicio.ruta){
                            inclusive = true
                        }
                    }
                }
            )
        }

        //INICIAR SESION
        composable(Rutas.IniciarSesion.ruta){
            IniciarSesion(
                irRegistrarse = {
                    navController.navigate(Rutas.Registrarse.ruta)
                },
                irConfiguracionApp = {
                    navController.navigate(Rutas.ConfiguracionApp.ruta)
                },
                irAgenda = {
                    navController.navigate(Rutas.Agenda.ruta)
                }
            )
        }

        //REGISTRARSE
        composable(Rutas.Registrarse.ruta){
            Registrarse(
                irIniciarSesion= {
                    navController.navigate(Rutas.IniciarSesion.ruta)
                },
                irConfiguracionApp= {
                    navController.navigate(Rutas.ConfiguracionApp.ruta)
                },
                irAgenda = {
                    navController.navigate(Rutas.Agenda.ruta)
                }
            )
        }

        //CONFIGURACIONAPP
        composable(Rutas.ConfiguracionApp.ruta){
            ConfiguracionApp(
                volver = {
                    navController.popBackStack()
                },
                irConfiguracionContrasena= {
                    navController.navigate(Rutas.ConfiguracionContrasena.ruta)
                },
                irConfiguracionAlertas = {
                    navController.navigate(Rutas.ConfiguracionAlertas.ruta)
                }
            )
        }

        //CONFIGURACION ALERTAS
        composable(Rutas.ConfiguracionAlertas.ruta){
            ConfiguracionAlertas(
                volver = {
                    navController.popBackStack()
                }
            )
        }

        //CONFIGURACION CONTRASENA
        composable(Rutas.ConfiguracionContrasena.ruta){
            ConfiguracionContrasena(
                volver = {
                    navController.popBackStack()
                }
            )
        }

        //AGENDA
        composable(Rutas.Agenda.ruta){
            Agenda(
                irConfiguracionApp= {
                    navController.navigate(Rutas.ConfiguracionApp.ruta)
                },
                irIniciarSesion= {
                    navController.navigate(Rutas.IniciarSesion.ruta)
                },
                irChat = {
                    navController.navigate(Rutas.Chat.ruta)
                }
            )
        }

        //CHAT
        composable(Rutas.Chat.ruta){
            Chat(
                irConfiguracionApp= {
                    navController.navigate(Rutas.ConfiguracionApp.ruta)
                },
                irIniciarSesion= {
                    navController.navigate(Rutas.IniciarSesion.ruta)
                },
                volver = {
                    navController.popBackStack()
                }
            )
        }
    }
}