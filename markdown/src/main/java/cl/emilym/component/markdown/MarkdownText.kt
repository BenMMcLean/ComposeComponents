package cl.emilym.component.markdown

import android.util.TypedValue
import android.widget.TextView
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.viewinterop.AndroidView
import io.noties.markwon.AbstractMarkwonPlugin
import io.noties.markwon.Markwon
import io.noties.markwon.core.MarkwonTheme

@Composable
fun MarkdownText(
    markdownText: String,
    modifier: Modifier = Modifier,
    style: TextStyle = MaterialTheme.typography.bodyMedium,
) {

    val colour = LocalContentColor.current
    val density = LocalDensity.current
    val markwon = LocalMarkwon.current
    val context = LocalContext.current

    AndroidView(
        factory = { ctx ->
            TextView(ctx).apply{
                setTextSize(TypedValue.COMPLEX_UNIT_SP, style.fontSize.value)
                setTextColor(colour.toArgb())
            }
        },
        modifier = modifier
    ){
        (markwon ?: Markwon
            .builder(context)
            .usePlugin(object: AbstractMarkwonPlugin() {
                override fun configureTheme(builder: MarkwonTheme.Builder) {
                    builder.bulletWidth((density.density * 4).toInt())
                    builder.headingBreakHeight(0)
                    builder.headingTextSizeMultipliers(floatArrayOf(1.75f, 1.375f, 1.25f, 1.125f, 1f, 1f))
                }
            }).build()).setMarkdown(it, markdownText)

    }

}