
package org.example.vidyadaan.Events.sections

import androidx.compose.runtime.Composable
import com.example.compose.Pale_Purple
import com.example.compose.Tertiary
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.functions.url
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.vidyadaan.Events.components.EventCard
import org.example.vidyadaan.Events.utils.AllEvents
import org.jetbrains.compose.web.css.*


@Composable
fun EventYear(year: Int) {
    Box(
        modifier = Modifier.fillMaxWidth()
            .height(80.vh), contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SpanText(
                "Our Events",
                modifier = Modifier.fontFamily("poppins")
                    .fontSize(FontSize.XXLarge)
                    .fontWeight(FontWeight.Bold)
            )
            SpanText(
                "$year",
                modifier = Modifier.fontFamily("poppins")
                    .fontSize(FontSize.XXLarge)
                    .fontWeight(FontWeight.Bold)
            )
        }
    }
}

@Composable
fun eventlists(ctx : PageContext , year : Int) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .overflow(Overflow.Hidden)
            .margin(bottom = 100.px)
        , contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .rowGap(30.px)
                .fillMaxWidth()
                .backgroundColor(Tertiary), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            EventYear(year)
                AllEvents.AllEvents[year]?.forEachIndexed { index, item ->
                    EventCard(ctx, details = item, year, index)
            }

        }
    }
}



