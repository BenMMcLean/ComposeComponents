package cl.emilym.component.activity

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable

object GlobalComposeProvider {

    var hook: @Composable ((@Composable () -> Unit) -> Unit) = { it() }

}