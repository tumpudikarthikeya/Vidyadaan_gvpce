package org.example.vidyadaan.EventDetails.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
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
import org.example.vidyadaan.EventDetails.style.PosterStyle2
import org.example.vidyadaan.EventDetails.style.titlestyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb

@Composable
fun ResultSection(result :String) {
    Column(modifier = Modifier.fillMaxWidth().margin(bottom = 50.px).id("result") ,
            horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        SpanText(
            text = "Result",
            modifier = titlestyle.toModifier()
                .color(Colors.White)
                .fontFamily("poppins")
                .fontWeight(FontWeight.SemiBold)
                .textAlign(TextAlign.Center)
                .margin(bottom = 0.px)
        )
        Box(modifier = Modifier.fillMaxWidth().margin(top = 20.px), contentAlignment = Alignment.Center) {
            Image(src = "/chakra2.svg", modifier = PosterStyle2.toModifier())
            Column(
                modifier = Modifier.zIndex(1),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(src = "/$result", modifier = PosterStyle.toModifier())
                SpanText(
                    text = "",
                    modifier = titlestyle.toModifier()
                        .color(Colors.White)
                        .fontFamily("poppins")
                        .fontWeight(FontWeight.SemiBold)
                        .textAlign(TextAlign.Center)
                )
            }
        }
    }
}