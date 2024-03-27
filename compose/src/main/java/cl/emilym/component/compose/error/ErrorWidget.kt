package cl.emilym.component.compose.error

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import cl.emilym.component.compose.button.StandardButton
import cl.emilym.component.compose.rdp

@Composable
fun ErrorWidget(
    exception: java.lang.Exception?,
    message: String? = null,
    retry: (() -> Unit)? = null
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(0.5.rdp)
    ) {
        Text(stringResource(ErrorWidgetConfig.errorTitleResource), style = MaterialTheme.typography.titleMedium)
        (message ?: exception?.message)?.let {
            Text(it)
        }
        retry?.let {
            StandardButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = { retry() }
            ) {
                Text(stringResource(ErrorWidgetConfig.retryButtonResource))
            }
        }
    }

}