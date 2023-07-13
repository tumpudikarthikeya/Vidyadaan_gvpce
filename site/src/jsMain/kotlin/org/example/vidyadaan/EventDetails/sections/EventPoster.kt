package org.example.vidyadaan.EventDetails.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayIf
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayUntil
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.vidyadaan.EventDetails.style.PosterStyle
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb
import org.jetbrains.compose.web.css.vh

@Composable
fun EventPoster(  poster :String  , title :String) {

    Box (modifier = Modifier.fillMaxWidth().height(90.vh).backgroundColor(rgb(41, 62, 70))
    , contentAlignment = Alignment.Center) {
            /*SimpleGrid(numColumns = numColumns(base = 1, sm = 2), modifier = Modifier.fillMaxWidth(75.percent).backgroundColor(
                Colors.Yellow)) {
                Image(src = "/$poster", modifier = PosterStyle.toModifier().borderRadius(2.px))
                SpanText(
                    text = title,
                    modifier = Modifier
                        .fontFamily("poppins")
                        .fontSize(FontSize.XXLarge)
                        .fontWeight(FontWeight.SemiBold)
                        .textAlign(TextAlign.Center)
                )
            }*/
        Column(modifier = Modifier
            .fillMaxWidth(75.percent)
            .displayUntil(Breakpoint.MD)
            ,
            horizontalAlignment = Alignment.CenterHorizontally ,
            verticalArrangement = Arrangement.Center) {
            Image(src = "/$poster", modifier = PosterStyle.toModifier().borderRadius(2.px))
            SpanText(
                text = title,
                modifier = Modifier
                    .color(Colors.White)
                    .fontFamily("poppins")
                    .fontSize(FontSize.XXLarge)
                    .fontWeight(FontWeight.SemiBold)
                    .textAlign(TextAlign.Center)
            )
        }
        Row(modifier = Modifier
            .fillMaxWidth(75.percent)
            .displayIf(Breakpoint.MD),
            verticalAlignment = Alignment.CenterVertically ,
            horizontalArrangement = Arrangement.Center) {
            Image(src = "/$poster", modifier = PosterStyle.toModifier().borderRadius(2.px))
            SpanText(
                text = title,
                modifier = Modifier
                    .color(Colors.White)
                    .fontFamily("poppins")
                    .fontSize(FontSize.XXLarge)
                    .fontWeight(FontWeight.SemiBold)
                    .textAlign(TextAlign.Center)
            )
        }


    }

}