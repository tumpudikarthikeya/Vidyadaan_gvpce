package org.example.vidyadaan.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.vidyadaan.EventDetails.style.RegButtonStyle
import org.example.vidyadaan.Events.EventDetails
import org.example.vidyadaan.Styles.EventBoxStyle
import org.example.vidyadaan.Styles.EventPosterStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb
import org.jetbrains.compose.web.css.rgba
import org.jetbrains.compose.web.dom.Button

@Composable
fun EventBox(event: EventDetails ) {
    val ctx = rememberPageContext()
    Box(modifier = EventBoxStyle.toModifier()
        .backgroundColor(Colors.White)
        .minWidth(500.px)
        .borderRadius(10.px)
        .boxShadow(5.px , 5.px , color = rgba(0,0,0,0.2f) , blurRadius = 5.px)
        .padding(topBottom = 30.px , leftRight =  20.px),
        contentAlignment = Alignment.Center) {
        Column(modifier = Modifier.fillMaxWidth().rowGap(20.px) ,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(src = event.poster ,
                modifier = EventPosterStyle.toModifier()
                .borderRadius(5.px))
            SpanText(text = event.title ,
                modifier = Modifier
                    .fontFamily("poppins")
                    .fontSize(FontSize.Large)
                    .fontWeight(FontWeight.SemiBold)
            )
            SpanText(text = event.type ,
                modifier = Modifier
                    .fontFamily("poppins")
                    .fontSize(FontSize.Medium)
            )
            Button(
                attrs = RegButtonStyle.toModifier()
                    .height(35.px)
                    .onClick { ctx.router.navigateTo("/EventDetails/${event.details.year}/${event.eventNo}") }
                    .borderRadius(10.px)
                    .borderColor(rgb(72,22,148))
                    .toAttrs()
            ) {
                SpanText(
                    text = "Know More",
                    modifier = Modifier
                        .fontFamily("poppins")
                        .fontSize(FontSize.Small)
                )
            }
        }
        }
    }
