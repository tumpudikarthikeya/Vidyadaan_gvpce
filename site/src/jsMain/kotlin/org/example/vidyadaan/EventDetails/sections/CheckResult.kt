package org.example.vidyadaan.EventDetails.sections

import androidx.compose.runtime.Composable
import com.example.compose.Dark_Green
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.VerticalAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh

@Composable
fun CheckResult() {
    Box( modifier = Modifier.margin(top = 50.vh), contentAlignment = Alignment.CenterStart) {
        Link(path = "#result" , modifier = Modifier.zIndex(1).position(Position.Fixed)) {
            Box(contentAlignment = Alignment.Center , modifier = Modifier.backgroundColor(Dark_Green)) {
                SpanText(
                    text = "Check Results",
                    modifier = resultLinkStyle.toModifier()
                        .fontFamily("poppins")
                        .color(Colors.White)
                )
            }
        }
    }
}

val resultStyle by ComponentStyle {
    Breakpoint.ZERO {
        Modifier.width(100.px)
    }
    Breakpoint.MD {
        Modifier
            .width(150.px)
    }
}

val resultLinkStyle by ComponentStyle {
    Breakpoint.ZERO {
        Modifier
            .fontSize(FontSize.Small)
            .padding(leftRight = 10.px , topBottom = 10.px)

    }
    Breakpoint.MD {
        Modifier
            .fontSize(FontSize.Medium)
            .fontWeight(FontWeight.Medium)
            .padding(leftRight = 20.px , topBottom = 15.px)
    }
}