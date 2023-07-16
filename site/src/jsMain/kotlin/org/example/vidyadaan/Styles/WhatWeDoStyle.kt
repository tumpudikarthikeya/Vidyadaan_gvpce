package org.example.vidyadaan.Styles

import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

val WhatWeDoStyle by ComponentStyle {
    Breakpoint.ZERO{
        Modifier.fillMaxWidth(90.percent)
    }
    Breakpoint.MD{
        Modifier.fillMaxWidth(80.percent)
    }
    Breakpoint.LG{
        Modifier.fillMaxWidth(75.percent)
    }
}

val GroupPicStyle by ComponentStyle {
    Breakpoint.ZERO{
        Modifier.width(400.px)
    }
    Breakpoint.MD{
        Modifier.width(500.px)
    }
}

val WhatwedoTitle by ComponentStyle {
    Breakpoint.ZERO{
        Modifier.fontSize(FontSize.XLarge)
    }
    Breakpoint.MD{
        Modifier.fontSize(FontSize.Large)
    }
}
val WhatwedoDesc by ComponentStyle {
    Breakpoint.ZERO{
        Modifier.fontWeight(FontWeight.Medium)
    }
    Breakpoint.MD{
        Modifier.fontWeight(FontWeight.SemiBold)
    }
}