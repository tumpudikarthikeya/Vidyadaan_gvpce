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
import com.varabyte.kobweb.silk.components.style.toModifier
import org.example.vidyadaan.EventDetails.sections.*
import org.example.vidyadaan.EventDetails.style.EventCompleteDetailsContainer
import org.example.vidyadaan.Events.utils.AllEvents
import org.example.vidyadaan.Styles.HeaderBackground
import org.example.vidyadaan.Styles.MenuItemStyle
import org.example.vidyadaan.Styles.SubMenuItemStyle
import org.example.vidyadaan.components.BackToTop
import org.example.vidyadaan.components.Header
import org.example.vidyadaan.components.OverFlowMenu
import org.example.vidyadaan.sections.ContactInfo
import org.jetbrains.compose.web.css.px

@Page("EventDetails/{year}/{index}")
@Composable
fun EventDetails() {
    var menuOpend by remember { mutableStateOf(false) }
    val ctx = rememberPageContext()
    val year = ctx.route.params["year"]?.toInt()
    val index = ctx.route.params["index"]?.toInt()
    val event = AllEvents.AllEvents[year]?.get(index!!)
    Box(Modifier.fillMaxSize().overflow(Overflow.Hidden)) {
        Column(
            Modifier.fillMaxWidth().rowGap(30.px),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Header(ctx, MenuItemStyle, SubMenuItemStyle, HeaderBackground, onMenuClicked = { menuOpend = true })

            EventPoster(event!!.poster , event.title)
            EventBasicDetails(event.details)
            Box(modifier = EventCompleteDetailsContainer.toModifier() , contentAlignment = Alignment.CenterStart) {
                EventCompleteDetails(event)
            }
            if (event.winners != "" || event.results.isNotEmpty()) {
                ResultSection(event.winners, event.results)
            }
            ContactInfo()
        }
        if (event!!.winners != "" || event.results.isNotEmpty()) {
            CheckResult()
        }
        BackToTop()
        }
        if (menuOpend) {
            OverFlowMenu(onMenuClosed = { menuOpend = false })
        }
    }

