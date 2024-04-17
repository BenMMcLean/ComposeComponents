package cl.emilym.component.compose.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cl.emilym.component.compose.button.ButtonStyle
import cl.emilym.component.compose.button.ButtonStyles

val primary
    @Composable
    get() = ButtonStyle(
        shape = RoundedCornerShape(8.dp),
        backgroundColor = MaterialTheme.colorScheme.tertiary,
        contentColor = MaterialTheme.colorScheme.onTertiary,
        padding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        contentSpacing = 4.dp,
        null,
        null
    )

val secondary
    @Composable
    get() = primary.copy(
        backgroundColor = MaterialTheme.colorScheme.surface,
        contentColor = MaterialTheme.colorScheme.onSurface,
        stroke = BorderStroke(1.dp, MaterialTheme.colorScheme.tertiary)
    )

val tertiary
    @Composable
    get() = primary.copy(
        backgroundColor = Color.Transparent,
        contentColor = MaterialTheme.colorScheme.tertiary,
    )

val buttonStyles
    @Composable
    get() = ButtonStyles(
        primary,
        secondary,
        tertiary,
        primary
    )