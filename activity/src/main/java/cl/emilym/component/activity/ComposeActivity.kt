package cl.emilym.component.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.ComposeView

abstract class ComposeActivity: AppCompatActivity(),
    cl.emilym.component.activity.ComposeView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ComposeView(this).apply {
            setContent {
                GlobalComposeProvider.hook {
                    Root()
                }
            }
        })
    }
}