package org.example.vidyadaan.Events.styles

import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.FlexWrap
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb

val Eventcardstyle by ComponentStyle {
    Breakpoint.ZERO {
        Modifier
            .fillMaxWidth(90.percent)
    }
    Breakpoint.MD {
        Modifier
            .fillMaxWidth(75.percent)
    }

}
val Leftcardstyle by ComponentStyle {
    base {
        Modifier
            .backgroundColor(rgb(72, 22, 148))
    }
    Breakpoint.ZERO{
        Modifier.height(100.px)
            .fillMaxWidth()

    }
    Breakpoint.MD{
        Modifier.height(185.px)
            .fillMaxWidth(40.percent)

    }
}

val dateStyle by ComponentStyle {
    Breakpoint.ZERO {
        Modifier
            .fontSize(FontSize.XXLarge)
    }
    Breakpoint.MD {
        Modifier
            .fontSize(60.px)
    }


}
