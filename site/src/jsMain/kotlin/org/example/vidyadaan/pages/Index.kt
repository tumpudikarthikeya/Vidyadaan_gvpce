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
import org.example.vidyadaan.Styles.HeaderBackground
import org.example.vidyadaan.Styles.MenuItemStyle
import org.example.vidyadaan.Styles.SubMenuItemStyle
import org.example.vidyadaan.components.*
import org.example.vidyadaan.sections.*
import org.example.vidyadaan.sections.OurTeam
import org.jetbrains.compose.web.css.px

@Page
@Composable
fun HomePage() {
    var menuOpend by remember { mutableStateOf(false) }
    val ctx = rememberPageContext()

    Box(modifier = Modifier.fillMaxWidth( ).overflow(Overflow.Clip),
        contentAlignment = Alignment.Center) {
        Column(Modifier
            .fillMaxWidth()
            .rowGap(100.px)
        , horizontalAlignment = Alignment.CenterHorizontally) {
            Header(ctx, MenuItemStyle, SubMenuItemStyle, HeaderBackground, onMenuClicked = { menuOpend = true })
            if (menuOpend){
                OverFlowMenu(onMenuClosed = { menuOpend = false })
            }
            ImageCarousel()
            Updates()
            AboutUs()
            OurTeam(ctx)
            Experience(events = 30 , volunteers = 200 , experience = 8)
            WhatWeDo()
            ContactInfo()

        }
        BackToTop()

    }
}
