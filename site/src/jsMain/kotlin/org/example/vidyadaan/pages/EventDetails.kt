package org.example.vidyadaan.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import org.example.vidyadaan.EventDetails.sections.EventPoster
import org.example.vidyadaan.Events.EventDetails
import org.example.vidyadaan.Events.utils.AllEvents
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text

@Page("EventDetails/{year}/{index}")
@Composable
fun EventDetails() {
    val ctx = rememberPageContext()
    val year = ctx.route.params.get("year")?.toInt()
    val index = ctx.route.params.get("index")?.toInt()
    val event = AllEvents.AllEvents[year]?.get(index!!)
    Box(Modifier.fillMaxSize()) {
        EventPoster(event!!.poster , event.title)
    }
}