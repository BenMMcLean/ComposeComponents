package cl.emilym.component.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

var baseSp = 16.sp

val Double.rsp: TextUnit get() = baseSp * this
val Float.rsp: TextUnit get() = baseSp * this
val Int.rsp: TextUnit get() = baseSp * this

var baseDp = 16.dp

val Double.rdp: Dp get() = baseDp * this.toFloat()
val Float.rdp: Dp get() = baseDp * this
val Int.rdp: Dp get() = baseDp * this

val Int.px: Dp
    @Composable
    get() = (this.toFloat() / LocalDensity.current.density).dp
val Float.px: Dp
    @Composable
    get() = (this / LocalDensity.current.density).dp
val Double.px: Dp
    @Composable
    get() = (this / LocalDensity.current.density).dp