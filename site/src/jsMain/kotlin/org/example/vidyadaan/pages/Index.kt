package org.example.vidyadaan.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import org.example.vidyadaan.Events.sections.eventlists
import org.example.vidyadaan.Events.utils.AllEvents
import org.example.vidyadaan.Styles.HeaderBackground
import org.example.vidyadaan.Styles.MenuItemStyle
import org.example.vidyadaan.Styles.SubMenuItemStyle
import org.example.vidyadaan.components.EventBox
import org.example.vidyadaan.components.Header
import org.example.vidyadaan.components.ImageCarousel
import org.example.vidyadaan.components.OverFlowMenu
import org.example.vidyadaan.sections.*
import org.example.vidyadaan.sections.OurTeam

@Page
@Composable
fun HomePage() {
    // TODO: Add content here
    var menuOpend by remember { mutableStateOf(false) }
    val ctx = rememberPageContext()

    Box(modifier = Modifier.fillMaxWidth( ) ,
        contentAlignment = Alignment.Center) {
        Column(Modifier.fillMaxWidth()
        , horizontalAlignment = Alignment.CenterHorizontally) {
            Header(ctx, MenuItemStyle, SubMenuItemStyle, HeaderBackground, onMenuClicked = { menuOpend = true })

            ImageCarousel()
            LatestEvents()
            AboutUs()
            OurTeam(ctx)
            ContactInfo()

        }

        if (menuOpend){
            OverFlowMenu(onMenuClosed = { menuOpend = false })
        }
    }
}
