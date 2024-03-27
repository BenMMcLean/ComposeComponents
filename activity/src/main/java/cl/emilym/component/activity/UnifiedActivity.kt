package cl.emilym.component.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.ComposeView

abstract class UnifiedActivity: AppCompatActivity(), UnifiedView

abstract class UnifiedComposeActivity: UnifiedActivity(), UnifiedComposeView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ComposeView(this).apply {
            setContent {
                GlobalComposeProvider.hook(this@UnifiedComposeActivity) {
                    Root()
                }
            }
        })
    }
}