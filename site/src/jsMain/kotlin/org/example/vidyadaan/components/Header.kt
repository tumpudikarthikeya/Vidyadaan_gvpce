package org.example.vidyadaan.components

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaBars
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayIf
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayUntil
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.components.text.SpanTextStyle
import com.varabyte.kobweb.silk.init.initSilk
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.document
import kotlinx.browser.window
import org.example.vidyadaan.updateTheme
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun abc(ctx :PageContext ) {
    var breakpoint = rememberBreakpoint()
    val image = document.getElementById("headerimage")
    var scroll  by remember { mutableStateOf(0.0) }
    var headercolor = remember { mutableStateOf(null) }
    //var logosize by remember { mutableStateOf(50.px) }

    LaunchedEffect(Unit) {
        window.addEventListener(type = "scroll" , callback =  {
            scroll = window.pageYOffset

        })
    }

    Box(contentAlignment = Alignment.TopCenter) {

        Box(Modifier.id("headerimage")) {
            Image(src = "grouppic_1.jpg", modifier = Modifier.fillMaxWidth().objectFit(ObjectFit.Cover).height(100.vh))
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(100.vh)
                .backgroundColor(rgba(0,0,0,0.2f)))
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                //.minHeight(80.px)
                .transition(CSSTransition(property = TransitionProperty.All, timingFunction = AnimationTimingFunction.EaseIn, duration = (0.2).s))
                .thenIf(scroll > 80.0 , Modifier.backgroundColor(Colors.White))
                .position(Position.Fixed)
        ) {
            Row(Modifier.fillMaxWidth().fillMaxHeight() , verticalAlignment = Alignment.CenterVertically) {
                Image(src = "VIDYADAAN_LOGO.png", modifier = Modifier.size(50.px).margin(left = 20.px))

                        Text("Home",)
                        q(ctx)
                        Text("Team")



                FaBars(Modifier.displayUntil(Breakpoint.LG))
            }
        }
    }
}

@Composable
fun q(ctx : PageContext) {
    var submenu = remember { mutableStateOf(false) }
    Column {
        SpanText("Events", modifier = Modifier.position(Position.Relative).onClick {
            //ctx.router.navigateTo("/events/2025")
            submenu.value = true
        })
        Column(Modifier.visibility(if(submenu.value) Visibility.Visible else Visibility.Hidden).backgroundColor(Colors.White).position(
            Position.Absolute)) {
            Text("2021")
            Text("2022")
            Text("2021")
            Text("2022")
            Text("2021")
            Text("2022")
        }
    }
}