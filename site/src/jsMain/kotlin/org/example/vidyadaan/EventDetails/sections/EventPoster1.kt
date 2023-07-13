package org.example.vidyadaan.EventDetails.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.vidyadaan.EventDetails.style.PosterStyle
import org.example.vidyadaan.EventDetails.style.PosterStyle1
import org.example.vidyadaan.EventDetails.style.titlestyle
import org.example.vidyadaan.Events.EventDetails
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh

@Composable
fun EventPoster1(details: EventDetails) {
    Box(Modifier.fillMaxWidth().height(100.vh).overflow(Overflow.Hidden) , contentAlignment = Alignment.Center) {
        Image(src = "/imagebackdecor.svg" , modifier = PosterStyle1.toModifier())
        Column(modifier = Modifier.zIndex(1) ,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Image(src = "/${details.poster}", modifier = PosterStyle.toModifier().borderRadius(2.px))
            SpanText(
                text = details.title,
                modifier = titlestyle.toModifier()
                    .color(Colors.White)
                    .fontFamily("poppins")
                    .fontWeight(FontWeight.SemiBold)
                    .textAlign(TextAlign.Center)
            )
        }
    }
}