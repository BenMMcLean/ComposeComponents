package cl.emilym.component.activity

import androidx.compose.runtime.Composable

interface UnifiedView {

}

interface UnifiedComposeView: UnifiedView {

    @Composable
    fun Root()

}