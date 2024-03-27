package cl.emilym.component.compose.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.ButtonElevation
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class ButtonStyle(
    val shape: Shape,
    val backgroundColor: Color,
    val contentColor: Color,
    val padding: PaddingValues,
    val contentSpacing: Dp,
    val stroke: BorderStroke?,
    val elevation: ButtonElevation?,
    val minimumHeight: Dp = 24.dp
)

data class ButtonStyles(
    val primary: ButtonStyle,
    val secondary: ButtonStyle,
    val tertiary: ButtonStyle,
    val fallback: ButtonStyle
)

val LocalButtonStyle = staticCompositionLocalOf<ButtonStyles> { error("No ButtonStyle has been provided") }