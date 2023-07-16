package org.example.vidyadaan.Contact_Us

import com.example.compose.DarkSecondary
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.px

val WaveStyle by ComponentStyle {
    Breakpoint.LG{
        Modifier.margin(top = 0.px)
    }
    Breakpoint.MD{
        Modifier.margin(top = 40.px)
    }
    Breakpoint.SM{
        Modifier.margin(top = 50.px)
    }
}

val SendButtonStyle by ComponentStyle {
    hover {
        Modifier
            .backgroundColor(DarkSecondary)
    }
}