package cl.emilym.component.markdown

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalContext
import io.noties.markwon.AbstractMarkwonPlugin
import io.noties.markwon.Markwon
import io.noties.markwon.core.MarkwonTheme

val LocalMarkwon = staticCompositionLocalOf<Markwon?> { null }