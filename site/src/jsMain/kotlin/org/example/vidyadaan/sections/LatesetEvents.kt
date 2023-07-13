package org.example.vidyadaan.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaChevronLeft
import com.varabyte.kobweb.silk.components.icons.fa.FaChevronRight
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.text.SpanText
import kotlinx.browser.document
import org.example.vidyadaan.Events.utils.AllEvents
import org.example.vidyadaan.components.EventBox
import org.example.vidyadaan.components.ImageWithCover
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun LatestEvents() {
    val latestEvents = listOf( AllEvents.AllEvents[2023]!![0],
        AllEvents.AllEvents[2023]!![0],
        AllEvents.AllEvents[2023]!![0],
        AllEvents.AllEvents[2023]!![0],
        AllEvents.AllEvents[2023]!![0],
        AllEvents.AllEvents[2023]!![0] ,
        AllEvents.AllEvents[2023]!![0],
        AllEvents.AllEvents[2023]!![0])
    Box(modifier = Modifier.fillMaxWidth().padding(30.px)){
        Row(modifier = Modifier.fillMaxWidth() , verticalAlignment = Alignment.CenterVertically) {
            FaChevronLeft(size = IconSize.LG ,
                modifier = Modifier
                    .color(Colors.Black)
                    .onClick { document.getElementById("EventBox")!!.scrollBy( x=(-350.0) , y=0.0)  })
            Row(modifier = Modifier
                .fillMaxWidth(80.percent)
                .columnGap(20.px)
                .overflow(Overflow.Hidden)
                .id("EventBox")) {
                latestEvents.forEach {
                    EventBox(it)
                }
            }
            FaChevronRight(size = IconSize.LG ,
                    modifier = Modifier
                        .color(Colors.Black)
                    .onClick { document.getElementById("EventBox")!!.scrollBy( x=(350.0) , y=0.0)  })
        }
    }
}


