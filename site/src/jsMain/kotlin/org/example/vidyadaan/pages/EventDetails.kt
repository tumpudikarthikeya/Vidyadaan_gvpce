package org.example.vidyadaan.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import org.example.vidyadaan.EventDetails.sections.*
import org.example.vidyadaan.Events.utils.AllEvents
import org.example.vidyadaan.Styles.HeaderBackground
import org.example.vidyadaan.Styles.MenuItemStyle
import org.example.vidyadaan.Styles.SubMenuItemStyle
import org.example.vidyadaan.components.Header
import org.example.vidyadaan.components.OverFlowMenu
import org.example.vidyadaan.models.Constants
import org.example.vidyadaan.sections.ContactInfo
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb

@Page("EventDetails/{year}/{index}")
@Composable
fun EventDetails() {
    var menuOpend by remember { mutableStateOf(false) }
    val ctx = rememberPageContext()
    val year = ctx.route.params.get("year")?.toInt()
    val index = ctx.route.params.get("index")?.toInt()
    val event = AllEvents.AllEvents[year]?.get(index!!)
    Box(Modifier.fillMaxSize().backgroundColor(rgb(50,10,114)).overflow(Overflow.Hidden)) {
        Column(Modifier.fillMaxWidth().rowGap(30.px) ,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Header(ctx, MenuItemStyle, SubMenuItemStyle, HeaderBackground, onMenuClicked = { menuOpend = true })
            EventPoster1(event!!)
            BasicEventDetails1(event.details)
            EventCompleteDetails1(event)
            if (event.qr != "") {
                PaymentSection(event.upiId, event.poster, event.paynumber)
            }
            ResultSection(event.results)
            ContactInfo()
        }
        CheckResult()
    }
    if (menuOpend){
        OverFlowMenu(onMenuClosed = { menuOpend = false })
    }
}


/*EventPoster(event!!.poster, event.title)
EventBasicDetails(event.details)
EventCompleteDetails(event)
Image(src = "/${event.results}" , modifier = PosterStyle.toModifier().id("result") ) */