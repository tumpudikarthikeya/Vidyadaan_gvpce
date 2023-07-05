package org.example.vidyadaan.components

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.AnimationTimingFunction
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.dom.Text

@Composable
fun MenuWithSubmenu() {
    var isMenuClicked by remember { mutableStateOf(false) }

    Column(Modifier.position(Position.Fixed)) {
        SpanText(text = "Menu" , modifier = Modifier.onClick { isMenuClicked = !isMenuClicked })

        if (isMenuClicked) {
            Submenu()
        }
    }
}

@Composable
fun Submenu() {
    Column(Modifier.transition(CSSTransition(property = TransitionProperty.All, timingFunction = AnimationTimingFunction.EaseInOut))) {
        SpanText("2021")
        SpanText("2021")
        SpanText("2021")
        SpanText("2021")
    }
}