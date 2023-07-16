package org.example.vidyadaan.Styles

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.compose.*
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.*


val MenuItemStyle2 by ComponentStyle {
    base{

            Modifier
                .color(White_Color)

    }
    hover  {
        Modifier
            .transition(CSSTransition("backgroundColor" , duration = 1.s))
            .backgroundColor(Secondary)

    }
}

val HeaderBackground2 by ComponentStyle {
    base {
        Modifier
            .backgroundColor(White_Color)
    }
}

val SubMenuItemStyle2 by ComponentStyle {
    base{
        Modifier
            .color(White_Color)
    }
    hover {
        Modifier
            .transition(CSSTransition("backgroundColor" , duration = 1.s))
            .color(Colors.Black)
            .backgroundColor(Tertiary)
    }
}



val MenuItemStyle by ComponentStyle {
    base{

        Modifier
            .color(White_Color)
            .border(2.px)
            .borderRadius(25.px)
            .borderColor(Primary)
            .borderStyle(LineStyle.Solid)
    }
    hover  {
        Modifier
            .border(2.px)
            .borderRadius(25.px)
            .borderColor(Colors.White)
            .borderStyle(LineStyle.Solid)
            //.backgroundColor(Colors.White)
            //.color(rgb(140, 7, 221))
    }
}

val HeaderBackground by ComponentStyle {
    base {
        Modifier

            .fillMaxWidth()
            .backgroundColor(Primary)
    }
}

val SubMenuItemStyle by ComponentStyle {
    base{
        Modifier
            .color(Primary)
    }
    hover {
        Modifier
            .transition(CSSTransition("backgroundColor" , duration = 1.s))
            .backgroundColor(Primary)
            .color(White_Color)
    }
}