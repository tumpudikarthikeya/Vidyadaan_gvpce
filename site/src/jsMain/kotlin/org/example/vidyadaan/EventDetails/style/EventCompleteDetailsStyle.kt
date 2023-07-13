package org.example.vidyadaan.EventDetails.style

import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.rgb
import org.jetbrains.compose.web.css.s

val heading1 by ComponentStyle {
    base {
        Modifier
            .fontFamily("poppins")
            .fontSize(FontSize.XLarge)
            .fontWeight(FontWeight.SemiBold)
            .color(rgb(255,77,109))
    }
}

val headingvalue1 by ComponentStyle {
    base {
        Modifier
            .fontFamily("poppins")
            .fontSize(FontSize.Medium)
            .color(Colors.Black)
    }
}

val EventCompleteDetailsContainer by ComponentStyle {

    Breakpoint.ZERO {
        Modifier.fillMaxWidth(90.percent)
    }
    Breakpoint.MD {
        Modifier.fillMaxWidth(75.percent)
    }

}

val RegButtonStyle by ComponentStyle {

    base {
        Modifier
            .backgroundColor(Colors.White)
            .color(rgb(72,22,148))
            .transition(CSSTransition("backgroundColor" , duration = 2.s))
    }
    hover {
        Modifier
            .backgroundColor(rgb(72,22,148))
            .color(Colors.White)
    }
}