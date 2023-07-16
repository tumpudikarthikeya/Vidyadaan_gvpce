package org.example.vidyadaan.EventDetails.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.vidyadaan.EventDetails.style.EventBasicDetailsContainer
import org.example.vidyadaan.EventDetails.style.heading
import org.example.vidyadaan.EventDetails.style.headingValue
import org.example.vidyadaan.Events.BasicDetails
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun EventBasicDetails( details: BasicDetails) {

    Column(modifier = EventBasicDetailsContainer.toModifier()) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            SpanText(text = "Date : " , modifier = heading.toModifier())
            SpanText(text = "${details.date} ${details.month} , ${details.year}" , modifier = headingValue.toModifier())
        }
        if (details.time != ""){
            Row(verticalAlignment = Alignment.CenterVertically) {
                SpanText(text = "Time : ", modifier = heading.toModifier())
                SpanText(text = details.time!!, modifier = headingValue.toModifier())
            }
        }
        if (details.platform != ""){
            Row(verticalAlignment = Alignment.CenterVertically) {
                SpanText(text = "Platform : ", modifier = heading.toModifier())
                SpanText(text = details.platform!!, modifier = headingValue.toModifier())
            }
        }
        if (details.venue != ""){
            Row(verticalAlignment = Alignment.CenterVertically) {
                SpanText(text = "Venue : ", modifier = heading.toModifier())
                SpanText(text = details.venue!!, modifier = headingValue.toModifier())
            }
        }

        Box(modifier = Modifier.height(2.px).fillMaxWidth().margin(top = 30.px).backgroundColor(Colors.Black))

    }
}