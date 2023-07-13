package org.example.vidyadaan.EventDetails.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.vidyadaan.EventDetails.style.*
import org.example.vidyadaan.Events.ContackDetails
import org.example.vidyadaan.Events.EventDetails
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Button

@Composable
fun EventCompleteDetails1(details: EventDetails) {
    Box(modifier = Modifier.fillMaxSize().backgroundColor(Colors.White).margin(top = 150.px).padding(topBottom = 20.px)
    , contentAlignment = Alignment.Center
    ){
        Column(
            modifier = EventCompleteDetailsContainer.toModifier().rowGap(20.px)
        ) {

            SpanText(text = "Introduction ", modifier = heading1.toModifier())
            SpanText(text = details.intro, modifier = headingvalue1.toModifier())

            SpanText(text = "Details  ", modifier = heading1.toModifier())
            SpanText(text = details.description, modifier = headingvalue1.toModifier())

            /* A(href = "upi://pay?pa=6302418845&amp;cu=INR"){
            Text("PayNow")
        } */
            Link(
                path = details.link, modifier = Modifier
                    .textDecorationLine(TextDecorationLine.None) ,
                openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
            ) {
                Button(
                    attrs = RegButtonStyle.toModifier()
                        .height(35.px)
                        .borderRadius(10.px)
                        .borderColor(rgb(72,22,148))
                        .toAttrs()
                ) {
                    SpanText(
                        text = "Register Here",
                        modifier = Modifier
                            .fontFamily("poppins")
                            .fontSize(FontSize.Medium)
                    )
                }
            }
            ContactPersons(details.Contact)
        }

    }
}

@Composable
fun ContactPersons(details: List<ContackDetails>) {
    SpanText(text = "Contact  ", modifier = heading1.toModifier())
    Column(verticalArrangement = Arrangement.Center) {
        for (i in details) {
            Row {
                SpanText(text = i.name, modifier = headingvalue1.toModifier())
                A(
                    href = "tel:+91${i.num}", attrs = Modifier
                        .textDecorationLine(TextDecorationLine.None)
                        .color(Colors.Blue)
                        .toAttrs()
                ) {
                    SpanText(text = ": ${i.num}", modifier = headingvalue1.toModifier())
                }
            }
        }
    }

}