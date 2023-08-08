package org.example.vidyadaan.CareerGuidence

import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

val greenGradient = Modifier
    .backgroundImage(
        linearGradient(120.deg) {
            add(Color.rgb(0xd4fc79), 0.percent)
            add(Color.rgb(0x96e6a1), 100.percent)
        }
    )
val blueGradient = Modifier
    .backgroundImage(
        linearGradient(95.2.deg) {
            add(Color.rgba(173, 252, 234, 1f), 26.8.percent)
            add(Color.rgba(192, 229, 246, 1f), 64.percent)
        }
    )
val purpleGradient = Modifier
    .backgroundImage(
        linearGradient(LinearGradient.Direction.ToRight,
            Color.rgb(0x9796f0), Color.rgb(0xfbc7d4))
    )

val pinkGradient = Modifier
    .backgroundImage(
        linearGradient(LinearGradient.Direction.ToRight,
            Color.rgb(0xff6e7f), Color.rgb(0xbfe9ff))
    )

val streamBoxStyle by ComponentStyle {
    base {
        Modifier
            .fillMaxWidth(90.percent)
            .columnGap(100.px)
    }
    Breakpoint.LG{
        Modifier
            .rowGap(100.px)
            .fillMaxWidth()
    }
}
