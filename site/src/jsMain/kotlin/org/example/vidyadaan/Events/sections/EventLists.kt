@file:Suppress("DEPRECATION")

package org.example.vidyadaan.Events.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.functions.url
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.vidyadaan.Events.components.EventItem
import org.example.vidyadaan.Events.utils.AllEvents
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Text

@Composable
fun eventlists(ctx : PageContext , year : Int) {

        Box(
            modifier = Modifier.fillMaxSize()
                .backgroundImage(url("/backdrop.jpg")).backgroundSize(BackgroundSize.Cover)
                .backgroundPosition(BackgroundPosition.Center).backgroundAttachment(BackgroundAttachment.Fixed)
        ) {

            Box(Modifier.fillMaxSize().backgroundColor(rgba(0, 0, 0, 0.15f)))
            Column(modifier = Modifier.fillMaxSize()) {
                EventYear()
            Column(Modifier.rowGap(30.px).fillMaxWidth()) {
                for (i in 1..10) {
                    AllEvents.AllEvents[year]?.forEachIndexed { index ,item  ->
                        EventItem(ctx , event = item , year , index )
                    }
                }
            }
        }
    }

}

@Composable
fun EventYear() {
    Box(modifier = Modifier.fillMaxWidth()
        .height(80.vh), contentAlignment = Alignment.Center) {
        Column(modifier = Modifier.fillMaxSize()
            , verticalArrangement = Arrangement.Center , horizontalAlignment = Alignment.CenterHorizontally){
            SpanText("Our Events" ,
                modifier = Modifier.fontFamily("poppins")
                .fontSize(FontSize.XXLarge)
                .fontWeight(FontWeight.Bold)
            )
            SpanText("2023",
                modifier = Modifier.fontFamily("poppins")
                    .fontSize(FontSize.XXLarge)
                    .fontWeight(FontWeight.Bold))
        }
    }
}