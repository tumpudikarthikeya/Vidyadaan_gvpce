package org.example.vidyadaan.components

import androidx.compose.runtime.*
import com.example.compose.Dark_Green
import com.example.compose.Primary
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowUp
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.document
import kotlinx.browser.window
import org.example.vidyadaan.Styles.BackToTopStyle
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px


@Composable
fun BackToTop() {
    val breakpoint = rememberBreakpoint()
    var scroll : Double? by remember { mutableStateOf(null) }

    LaunchedEffect(Unit) {
        window.addEventListener(type = "scroll",callback = {
            scroll = document.documentElement?.scrollTop
        })
    }
    Box(modifier = Modifier.fillMaxHeight()
        .fillMaxWidth()
        .styleModifier {
            property("pointer-events", "none")
        }

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .position(Position.Fixed)
                .zIndex(5)
                .styleModifier {
                    property("pointer-events", "none")
                },
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.End
        ) {
            Box(
                modifier = BackToTopStyle.toModifier()
                    .size(if (breakpoint > Breakpoint.MD) 50.px else 30.px)
                    .visibility(
                        if (scroll != null && scroll!! > 400.0) Visibility.Visible
                        else Visibility.Hidden
                    )
                    .borderRadius(if (breakpoint >= Breakpoint.MD) 30.px else 20.px)
                    .margin(
                        bottom = if (breakpoint > Breakpoint.MD) 40.px else 15.px,
                        right = if (breakpoint > Breakpoint.MD) 40.px else 15.px
                    )
                    .backgroundColor(Dark_Green)
                    .opacity(0.5f)
                    .cursor(Cursor.Pointer)
                    .onClick { document.documentElement?.scroll(0.0, 0.0) }
                    .styleModifier {
                        property("pointer-events", "auto")
                    },
                contentAlignment = Alignment.Center
            ) {
                FaArrowUp(
                    modifier = Modifier.color(Colors.White),
                    size = if (breakpoint > Breakpoint.MD) IconSize.LG else IconSize.XS
                )
            }

        }
    }
}