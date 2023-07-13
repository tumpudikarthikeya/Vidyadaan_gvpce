package org.example.vidyadaan.Styles

import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val TitleStyle by ComponentStyle {
    base {
        Modifier
            .fontFamily("poppins")
            .fontSize(FontSize.XLarge)
            .fontWeight(FontWeight.Bold)
            .color(Colors.White)
    }
    Breakpoint.ZERO {
        Modifier
            .margin(topBottom = 20.px)
    }
    Breakpoint.LG{

        Modifier
            .margin(topBottom = 40.px)
    }
}
val TitleStyle1 by ComponentStyle {
    base {
        Modifier
            .fontFamily("poppins")
            .fontSize(FontSize.XLarge)
            .fontWeight(FontWeight.SemiBold)
            .color(Colors.White)
            .margin(topBottom = 40.px)
    }
}

val TitleStyle2 by ComponentStyle {
    base {
        Modifier
            .fontFamily("poppins")
            .fontSize(FontSize.Large)
            .fontWeight(FontWeight.SemiBold)
            .color(Colors.White)
    }
}

val dataStyle by ComponentStyle {
    base {
        Modifier
            .fontFamily("poppins")
            .fontSize(FontSize.Medium)
            .color(Colors.White)
    }

}

val SocialLinkIconLink by ComponentStyle {
    base {
        Modifier
            .color(Colors.White)
    }
}

val ContactSectionContainer by ComponentStyle {
    Breakpoint.ZERO {
        Modifier
        .padding(leftRight = 20.px , topBottom = 40.px)
    }
    Breakpoint.LG{

        Modifier
            .padding(leftRight = 40.px , topBottom = 40.px)
    }
}