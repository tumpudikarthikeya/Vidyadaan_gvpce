package org.example.vidyadaan.sections

import androidx.compose.runtime.Composable
import com.example.compose.Secondary
import com.example.compose.Tertiary
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaTicket
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun Experience(  events :Int , volunteers :Int , experience :Int ) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .backgroundColor(Tertiary)
        .padding(topBottom = 70.px)
        , contentAlignment = Alignment.Center) {
        SimpleGrid(numColumns = numColumns(base = 1 , sm = 1 , lg = 3 , md = 3)
            , modifier = Modifier
                .fillMaxWidth(75.percent)
                .rowGap(30.px)) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(src = "/event.png" , modifier = Modifier.size(100.px))
                SpanText(text = "$events"
                    , modifier = Modifier
                        .fontSize(FontSize.XXLarge)
                        .fontWeight(FontWeight.Bold))
                SpanText(text = "Events" ,
                    modifier = Modifier.fontSize(FontSize.Medium))
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(src = "/group.png", modifier = Modifier.size(100.px))
                SpanText(text = "$volunteers"
                    , modifier = Modifier
                        .fontSize(FontSize.XXLarge)
                        .fontWeight(FontWeight.Bold))
                SpanText(text = "Volunteers" ,
                    modifier = Modifier.fontSize(FontSize.Medium))
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(src = "/Calender_icon.svg", modifier = Modifier.size(100.px))
                SpanText(text = "$experience"
                    , modifier = Modifier
                        .fontSize(FontSize.XXLarge)
                        .fontWeight(FontWeight.Bold))
                SpanText(text = "Years of Volunteering" ,
                    modifier = Modifier.fontSize(FontSize.Medium))
            }
        }
    }
}