package org.example.vidyadaan.Styles

import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.percent

val Updates_Container by ComponentStyle {
    Breakpoint.ZERO{
        Modifier
            .fillMaxWidth(80.percent)
    }
    Breakpoint.MD {
        Modifier
            .fillMaxWidth(75.percent)
    }
}
val Updates_Box by ComponentStyle {
    Breakpoint.ZERO{
        Modifier
            .fillMaxWidth()
    }
    Breakpoint.MD {
        Modifier
            .fillMaxWidth(70.percent)
    }
}

val Updates_text_Style by ComponentStyle {
    base {
        Modifier
            .fontFamily("poppins")
            .textAlign(TextAlign.Center)
            .fontSize(FontSize.Medium)
            .fontWeight(FontWeight.SemiBold)
    }
}