package org.example.vidyadaan.Styles

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.percent

val aboutUsContainer by ComponentStyle {
    Breakpoint.ZERO {
        Modifier
            .fillMaxWidth(90.percent)
    }
    Breakpoint.MD {
        Modifier
            .fillMaxWidth(55.percent)
    }
}