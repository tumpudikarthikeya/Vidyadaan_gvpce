package org.example.vidyadaan.EventDetails.style

import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb

val mainHeading by ComponentStyle {
    base {
        Modifier
            .fontFamily("poppins")
            .fontWeight(FontWeight.Bold)
            .color(rgb(12,46,95))
    }
    Breakpoint.ZERO {
        Modifier
            .fontSize(FontSize.Medium)
    }
    Breakpoint.MD {
        Modifier
            .fontSize(FontSize.XLarge)
    }
}
val heading by ComponentStyle {
    base {
        Modifier
            .fontFamily("poppins")
            .fontWeight(FontWeight.SemiBold)
            .color(rgb(255,77,109))
    }
    Breakpoint.ZERO {
       Modifier
           .fontSize(FontSize.Medium)
    }
    Breakpoint.MD {
        Modifier
            .fontSize(FontSize.XLarge)
    }
}

val headingValue by ComponentStyle {
    base {
        Modifier
            .fontFamily("poppins")
            .color(Colors.Black)
    }
    Breakpoint.ZERO {
        Modifier
            .fontSize(FontSize.Medium)
    }
    Breakpoint.MD {
        Modifier
            .fontSize(FontSize.XLarge)
    }
}

val EventBasicDetailsContainer by ComponentStyle {

    Breakpoint.ZERO {
        Modifier.fillMaxWidth(90.percent)
    }
    Breakpoint.MD {
        Modifier.fillMaxWidth(75.percent)
    }

}
val EventBasicDetails1Container by ComponentStyle {

    Breakpoint.MD {
        Modifier.margin(topBottom = 150.px)
    }

}