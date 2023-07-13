package org.example.vidyadaan.Styles

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb
import org.jetbrains.compose.web.css.s



val MenuItemStyle2 by ComponentStyle {
    base{

            Modifier
                .color(Colors.White)

    }
    hover  {
        Modifier
            .transition(CSSTransition("backgroundColor" , duration = 1.s))
            .backgroundColor(rgb(50, 10, 114))

    }
}

val HeaderBackground2 by ComponentStyle {
    base {
        Modifier
            .backgroundColor(Colors.White)
    }
}

val SubMenuItemStyle2 by ComponentStyle {
    base{
        Modifier
            .color(Colors.White)
    }
    hover {
        Modifier
            .transition(CSSTransition("backgroundColor" , duration = 1.s))
            .backgroundColor(rgb(209, 148, 198))
    }
}



val MenuItemStyle by ComponentStyle {
    base{

        Modifier
            .color(Colors.White)
    }
    hover  {
        Modifier
            .transition(CSSTransition("backgroundColor" , duration = 1.s))
            .backgroundColor(Colors.White)
            .color(rgb(72, 22, 148))
    }
}

val HeaderBackground by ComponentStyle {
    base {
        Modifier

            .margin(topBottom =20.px )
            .fillMaxWidth(90.percent)
            .backgroundColor(rgb(72, 22, 148))
            .borderRadius(40.px)
    }
}

val SubMenuItemStyle by ComponentStyle {
    base{
        Modifier
            .color(rgb(72, 22, 148))
    }
    hover {
        Modifier
            .transition(CSSTransition("backgroundColor" , duration = 1.s))
            .backgroundColor(rgb(72, 22, 148))
            .color(Colors.White)
    }
}