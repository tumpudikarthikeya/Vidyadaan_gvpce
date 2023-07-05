package org.example.vidyadaan.Events.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayIf
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayUntil
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.vidyadaan.Events.BasicDetails
import org.example.vidyadaan.Events.EventDetails
import org.example.vidyadaan.Events.styles.Eventcardstyle
import org.example.vidyadaan.Events.styles.Leftcardstyle
import org.example.vidyadaan.Events.styles.dateStyle
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Button


@Composable
fun LeftPart( details: BasicDetails ) {
    Box(Leftcardstyle.toModifier()) {
        Column(Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            SpanText(text = details.date ,
                modifier = dateStyle.toModifier()
                    .fontFamily("poppins")
                    .fontWeight(FontWeight.Bold))
            SpanText(text = details.month ,
                modifier = Modifier.fontFamily("poppins")
                    .fontSize(FontSize.XLarge)
                    .fontWeight(FontWeight.SemiBold))

        }
    }

}

@Composable
fun RightPart(ctx: PageContext, event: EventDetails, year: Int, index: Int) {
    Box(Modifier.backgroundColor(Colors.White).height(185.px).fillMaxWidth().padding(20.px)) {
        Column(Modifier.fillMaxSize()) {
            SpanText(text = event.title ,
                    modifier = Modifier
                    .fontFamily("poppins")
                    .fontSize(FontSize.Large)
                    .fontWeight(FontWeight.Bold))
            SpanText(text = event.description ,
                    modifier = Modifier
                    .fontFamily("poppins")
                    .fontSize(FontSize.Medium))
            Row(modifier = Modifier
                .fillMaxWidth(),
                verticalAlignment = Alignment.Bottom ,
                horizontalArrangement = Arrangement.End) {
                Button(
                    attrs = Modifier
                        .height(30.px)
                        .borderRadius(10.px)
                        .onClick { ctx.router.navigateTo("/EventDetails/$year/$index") }
                        .toAttrs()
                ) {
                    SpanText("View Details" ,
                        modifier = Modifier
                            .fontFamily("poppins")
                            .fontSize(FontSize.Small))
                }
            }
        }
    }
}

@Composable
fun EventItem(ctx: PageContext, event: EventDetails, year: Int, index: Int) {
    Box(Modifier.fillMaxWidth() , contentAlignment = Alignment.Center) {
        Row(modifier = Eventcardstyle.toModifier().displayIf(Breakpoint.MD)) {
            LeftPart(event.details)
            RightPart(ctx, event, year, index)

        }
        Column(modifier = Eventcardstyle.toModifier().displayUntil(Breakpoint.MD)) {
            LeftPart(event.details)
            RightPart(ctx ,event , year , index)

        }
    }
}

