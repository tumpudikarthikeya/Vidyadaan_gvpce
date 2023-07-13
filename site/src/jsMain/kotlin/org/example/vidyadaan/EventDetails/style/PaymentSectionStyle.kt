package org.example.vidyadaan.EventDetails.style

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.px

val qrstyle by ComponentStyle {
    Breakpoint.ZERO {
        Modifier.size(100.px).margin(right = 60.px)
    }
    Breakpoint.MD{
        Modifier.size(150.px).margin(right = 90.px)
    }
}