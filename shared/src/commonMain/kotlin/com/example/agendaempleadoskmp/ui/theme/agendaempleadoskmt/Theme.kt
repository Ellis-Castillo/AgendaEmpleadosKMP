package com.example.agendaempleadoskmp.ui.theme.agendaempleadoskmt

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class ExtendedColorScheme(
    val primaryOscuro: ColorFamily,
    val primaryClaro: ColorFamily,
    val secondaryOscuro: ColorFamily,
    val secondaryClaro: ColorFamily,
    val tertiaryOscuro: ColorFamily,
    val tertiaryClaro: ColorFamily,
)

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

val extendedLight = ExtendedColorScheme(
  primaryOscuro = ColorFamily(
      primaryOscuroLight,
      onPrimaryOscuroLight,
      primaryOscuroContainerLight,
      onPrimaryOscuroContainerLight,
  ),
  primaryClaro = ColorFamily(
      primaryClaroLight,
      onPrimaryClaroLight,
      primaryClaroContainerLight,
      onPrimaryClaroContainerLight,
  ),
  secondaryOscuro = ColorFamily(
      secondaryOscuroLight,
      onSecondaryOscuroLight,
      secondaryOscuroContainerLight,
      onSecondaryOscuroContainerLight,
  ),
  secondaryClaro = ColorFamily(
      secondaryClaroLight,
      onSecondaryClaroLight,
      secondaryClaroContainerLight,
      onSecondaryClaroContainerLight,
  ),
  tertiaryOscuro = ColorFamily(
      tertiaryOscuroLight,
      onTertiaryOscuroLight,
      tertiaryOscuroContainerLight,
      onTertiaryOscuroContainerLight,
  ),
  tertiaryClaro = ColorFamily(
      tertiaryClaroLight,
      onTertiaryClaroLight,
      tertiaryClaroContainerLight,
      onTertiaryClaroContainerLight,
  ),
)

val extendedDark = ExtendedColorScheme(
  primaryOscuro = ColorFamily(
      primaryOscuroDark,
      onPrimaryOscuroDark,
      primaryOscuroContainerDark,
      onPrimaryOscuroContainerDark,
  ),
  primaryClaro = ColorFamily(
      primaryClaroDark,
      onPrimaryClaroDark,
      primaryClaroContainerDark,
      onPrimaryClaroContainerDark,
  ),
  secondaryOscuro = ColorFamily(
      secondaryOscuroDark,
      onSecondaryOscuroDark,
      secondaryOscuroContainerDark,
      onSecondaryOscuroContainerDark,
  ),
  secondaryClaro = ColorFamily(
      secondaryClaroDark,
      onSecondaryClaroDark,
      secondaryClaroContainerDark,
      onSecondaryClaroContainerDark,
  ),
  tertiaryOscuro = ColorFamily(
      tertiaryOscuroDark,
      onTertiaryOscuroDark,
      tertiaryOscuroContainerDark,
      onTertiaryOscuroContainerDark,
  ),
  tertiaryClaro = ColorFamily(
      tertiaryClaroDark,
      onTertiaryClaroDark,
      tertiaryClaroContainerDark,
      onTertiaryClaroContainerDark,
  ),
)

val extendedLightMediumContrast = ExtendedColorScheme(
  primaryOscuro = ColorFamily(
      primaryOscuroLightMediumContrast,
      onPrimaryOscuroLightMediumContrast,
      primaryOscuroContainerLightMediumContrast,
      onPrimaryOscuroContainerLightMediumContrast,
  ),
  primaryClaro = ColorFamily(
      primaryClaroLightMediumContrast,
      onPrimaryClaroLightMediumContrast,
      primaryClaroContainerLightMediumContrast,
      onPrimaryClaroContainerLightMediumContrast,
  ),
  secondaryOscuro = ColorFamily(
      secondaryOscuroLightMediumContrast,
      onSecondaryOscuroLightMediumContrast,
      secondaryOscuroContainerLightMediumContrast,
      onSecondaryOscuroContainerLightMediumContrast,
  ),
  secondaryClaro = ColorFamily(
      secondaryClaroLightMediumContrast,
      onSecondaryClaroLightMediumContrast,
      secondaryClaroContainerLightMediumContrast,
      onSecondaryClaroContainerLightMediumContrast,
  ),
  tertiaryOscuro = ColorFamily(
      tertiaryOscuroLightMediumContrast,
      onTertiaryOscuroLightMediumContrast,
      tertiaryOscuroContainerLightMediumContrast,
      onTertiaryOscuroContainerLightMediumContrast,
  ),
  tertiaryClaro = ColorFamily(
      tertiaryClaroLightMediumContrast,
      onTertiaryClaroLightMediumContrast,
      tertiaryClaroContainerLightMediumContrast,
      onTertiaryClaroContainerLightMediumContrast,
  ),
)

val extendedLightHighContrast = ExtendedColorScheme(
  primaryOscuro = ColorFamily(
      primaryOscuroLightHighContrast,
      onPrimaryOscuroLightHighContrast,
      primaryOscuroContainerLightHighContrast,
      onPrimaryOscuroContainerLightHighContrast,
  ),
  primaryClaro = ColorFamily(
      primaryClaroLightHighContrast,
      onPrimaryClaroLightHighContrast,
      primaryClaroContainerLightHighContrast,
      onPrimaryClaroContainerLightHighContrast,
  ),
  secondaryOscuro = ColorFamily(
      secondaryOscuroLightHighContrast,
      onSecondaryOscuroLightHighContrast,
      secondaryOscuroContainerLightHighContrast,
      onSecondaryOscuroContainerLightHighContrast,
  ),
  secondaryClaro = ColorFamily(
      secondaryClaroLightHighContrast,
      onSecondaryClaroLightHighContrast,
      secondaryClaroContainerLightHighContrast,
      onSecondaryClaroContainerLightHighContrast,
  ),
  tertiaryOscuro = ColorFamily(
      tertiaryOscuroLightHighContrast,
      onTertiaryOscuroLightHighContrast,
      tertiaryOscuroContainerLightHighContrast,
      onTertiaryOscuroContainerLightHighContrast,
  ),
  tertiaryClaro = ColorFamily(
      tertiaryClaroLightHighContrast,
      onTertiaryClaroLightHighContrast,
      tertiaryClaroContainerLightHighContrast,
      onTertiaryClaroContainerLightHighContrast,
  ),
)

val extendedDarkMediumContrast = ExtendedColorScheme(
  primaryOscuro = ColorFamily(
      primaryOscuroDarkMediumContrast,
      onPrimaryOscuroDarkMediumContrast,
      primaryOscuroContainerDarkMediumContrast,
      onPrimaryOscuroContainerDarkMediumContrast,
  ),
  primaryClaro = ColorFamily(
      primaryClaroDarkMediumContrast,
      onPrimaryClaroDarkMediumContrast,
      primaryClaroContainerDarkMediumContrast,
      onPrimaryClaroContainerDarkMediumContrast,
  ),
  secondaryOscuro = ColorFamily(
      secondaryOscuroDarkMediumContrast,
      onSecondaryOscuroDarkMediumContrast,
      secondaryOscuroContainerDarkMediumContrast,
      onSecondaryOscuroContainerDarkMediumContrast,
  ),
  secondaryClaro = ColorFamily(
      secondaryClaroDarkMediumContrast,
      onSecondaryClaroDarkMediumContrast,
      secondaryClaroContainerDarkMediumContrast,
      onSecondaryClaroContainerDarkMediumContrast,
  ),
  tertiaryOscuro = ColorFamily(
      tertiaryOscuroDarkMediumContrast,
      onTertiaryOscuroDarkMediumContrast,
      tertiaryOscuroContainerDarkMediumContrast,
      onTertiaryOscuroContainerDarkMediumContrast,
  ),
  tertiaryClaro = ColorFamily(
      tertiaryClaroDarkMediumContrast,
      onTertiaryClaroDarkMediumContrast,
      tertiaryClaroContainerDarkMediumContrast,
      onTertiaryClaroContainerDarkMediumContrast,
  ),
)

val extendedDarkHighContrast = ExtendedColorScheme(
  primaryOscuro = ColorFamily(
      primaryOscuroDarkHighContrast,
      onPrimaryOscuroDarkHighContrast,
      primaryOscuroContainerDarkHighContrast,
      onPrimaryOscuroContainerDarkHighContrast,
  ),
  primaryClaro = ColorFamily(
      primaryClaroDarkHighContrast,
      onPrimaryClaroDarkHighContrast,
      primaryClaroContainerDarkHighContrast,
      onPrimaryClaroContainerDarkHighContrast,
  ),
  secondaryOscuro = ColorFamily(
      secondaryOscuroDarkHighContrast,
      onSecondaryOscuroDarkHighContrast,
      secondaryOscuroContainerDarkHighContrast,
      onSecondaryOscuroContainerDarkHighContrast,
  ),
  secondaryClaro = ColorFamily(
      secondaryClaroDarkHighContrast,
      onSecondaryClaroDarkHighContrast,
      secondaryClaroContainerDarkHighContrast,
      onSecondaryClaroContainerDarkHighContrast,
  ),
  tertiaryOscuro = ColorFamily(
      tertiaryOscuroDarkHighContrast,
      onTertiaryOscuroDarkHighContrast,
      tertiaryOscuroContainerDarkHighContrast,
      onTertiaryOscuroContainerDarkHighContrast,
  ),
  tertiaryClaro = ColorFamily(
      tertiaryClaroDarkHighContrast,
      onTertiaryClaroDarkHighContrast,
      tertiaryClaroContainerDarkHighContrast,
      onTertiaryClaroContainerDarkHighContrast,
  ),
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

val LocalExtendedColorScheme = staticCompositionLocalOf {
    extendedLight
}
@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable() () -> Unit
) {
  val colorScheme = when {
      darkTheme -> darkScheme
      else -> lightScheme
  }
    val extendedColorScheme = when {
        darkTheme -> extendedDark
        else -> extendedLight
    }

    CompositionLocalProvider(
        LocalExtendedColorScheme provides extendedColorScheme
    ){
        MaterialTheme(
            colorScheme = colorScheme,
            typography = AppTypography,
            content = content
        )
    }

}

