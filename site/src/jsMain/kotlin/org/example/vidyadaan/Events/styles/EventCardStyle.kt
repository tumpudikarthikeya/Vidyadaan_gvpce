package org.example.vidyadaan.Events.styles

import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.css.Width
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgba

val EventCardStyle by ComponentStyle {
    Breakpoint.ZERO{
        Modifier.fillMaxWidth(90.percent)
    }
    Breakpoint.LG{
        Modifier.fillMaxWidth(75.percent)
    }
    base {
        Modifier.padding(20.px)
    }
    hover {
        Modifier.boxShadow(3.px,3.px,20.px,10.px, rgba(0,0,0,0.15f))
    }
}

val DateContainerStyle by ComponentStyle {


    Breakpoint.MD {
        Modifier
            .width(200.px)
            //.padding(30.px)
    }
    Breakpoint.ZERO {
        Modifier
           // .margin(leftRight = 20.px , bottom = 20.px)
            .fillMaxWidth()
            .padding(topBottom = 20.px)
    }
}

val EventInfoStyle  by ComponentStyle{
    Breakpoint.MD {
    Modifier
        .maxWidth(500.px)
        .rowGap(10.px)
    }
    Breakpoint.ZERO {
        Modifier
            .fillMaxWidth()
            .rowGap(10.px)
    }
}

val ButtonStyle by ComponentStyle {

    Breakpoint.MD {
        Modifier
            .right(10.px)
    }

}