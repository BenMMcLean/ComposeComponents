package cl.emilym.component.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cl.emilym.component.activity.UnifiedComposeActivity
import cl.emilym.component.compose.button.StandardButton
import cl.emilym.component.compose.error.ErrorWidget
import cl.emilym.component.compose.ui.theme.ComposeComponentsTheme
import cl.emilym.component.markdown.MarkdownText
import java.lang.IllegalArgumentException

class MainActivity : UnifiedComposeActivity() {

    @Composable
    override fun Root() {
        ComposeComponentsTheme {
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                Column {
                    Greeting("Android")
                    StandardButton(onClick = { }) {
                        Text("Test")
                    }
                    ErrorWidget(
                        exception = IllegalArgumentException(),
                        retry = {}
                    )
                    MarkdownText("This is a **test**")
                }
            }
        }
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeComponentsTheme {
        Greeting("Android")
    }
}