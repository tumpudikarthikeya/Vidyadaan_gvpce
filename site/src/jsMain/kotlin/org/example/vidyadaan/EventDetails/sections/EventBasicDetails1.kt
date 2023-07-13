package org.example.vidyadaan.EventDetails.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.VerticalAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayIf
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayUntil
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.vidyadaan.EventDetails.style.*
import org.example.vidyadaan.Events.BasicDetails
import org.example.vidyadaan.Events.EventDetails
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb
import org.jetbrains.compose.web.css.vw

@Composable
fun BasicEventDetails1(details: BasicDetails) {
        Box(modifier = EventBasicDetails1Container.toModifier().fillMaxWidth(), contentAlignment = Alignment.Center) {
            BackgroundDecor()
            Details(details)
        }
}

@Composable
fun BackgroundDecor() {
    Row(modifier = Modifier.fillMaxSize().displayUntil(Breakpoint.MD) , verticalAlignment = Alignment.CenterVertically
        , horizontalArrangement = Arrangement.SpaceBetween) {
        Image(src = "/decor1.svg" , modifier = Modifier.size(100.px))
        Image(src = "/decor1.svg", modifier = Modifier.size(100.px))
    }
    Box {
        Box(modifier = Modifier.fillMaxSize().displayIf(Breakpoint.MD) , contentAlignment = Alignment.TopStart) {
            Image(src = "/chakra.svg", modifier = Modifier.size(100.px).margin(left = (-50).px , top = (-50).px))
        }
        Box(modifier = Modifier.fillMaxSize().displayIf(Breakpoint.MD) , contentAlignment = Alignment.BottomEnd) {
            Image(src = "/chakra.svg", modifier = Modifier.size(100.px).margin(right = (-50).px , bottom = (-50).px))
        }

        Image(src = "/ticket1.svg", modifier = ticket1style.toModifier())
    }
}

@Composable
fun Details(details: BasicDetails) {
    Column(
        modifier = EventBasicDetailsContainer.toModifier().fillMaxHeight().margin(top = 30.px),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

        SpanText(text = "Details", modifier = mainHeading.toModifier())
        Box(
            modifier = ticket1Underlinestyle.toModifier().height(2.px).margin(topBottom = 5.px)
                .backgroundColor(Colors.Black)
        )
        Row {
            SpanText(text = "Date : ", modifier = heading.toModifier())
            SpanText(
                text = "${details.date} ${details.month} , ${details.year}",
                modifier = headingValue.toModifier()
            )
        }
        if (details.time != "") {
            Row {
                SpanText(text = "Time : ", modifier = heading.toModifier())
                SpanText(text = details.time!!, modifier = headingValue.toModifier())
            }
        }
        if (details.platform != "") {
            Row {
                SpanText(text = "Platform : ", modifier = heading.toModifier())
                SpanText(text = details.platform!!, modifier = headingValue.toModifier())
            }
        }
        if (details.venue != "") {
            Row {
                SpanText(text = "Venue : ", modifier = heading.toModifier())
                SpanText(text = details.venue!!, modifier = headingValue.toModifier())
            }
        }
    }

}