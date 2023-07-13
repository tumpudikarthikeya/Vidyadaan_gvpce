package org.example.vidyadaan.Styles

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.px

@OptIn(ExperimentalComposeWebApi::class)
val EventBoxStyle by ComponentStyle {
    hover {
        Modifier
            .transform { translateY(50.px) }
    }
}

val EventPosterStyle by ComponentStyle {
    Breakpoint.ZERO {
        Modifier.size(200.px)
    }
    Breakpoint.MD {
        Modifier.size(300.px)
    }
}