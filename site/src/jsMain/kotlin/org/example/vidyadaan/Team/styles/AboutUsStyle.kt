package org.example.vidyadaan.Team.styles

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.px

val V_logoStyle by ComponentStyle {
    Breakpoint.ZERO {
        Modifier.width(200.px)
    }
    Breakpoint.LG {
        Modifier.width(300.px)
    }
}
