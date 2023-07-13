package org.example.vidyadaan.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.vidyadaan.Styles.HeaderBackground
import org.example.vidyadaan.Styles.MenuItemStyle
import org.example.vidyadaan.Styles.SubMenuItemStyle
import org.example.vidyadaan.Team.sections.VidyadaanTeam
import org.example.vidyadaan.components.Header
import org.example.vidyadaan.components.OverFlowMenu
import org.jetbrains.compose.web.css.*

@Page("team")
@Composable
fun Team() {
    val ctx = rememberPageContext()
    var menuOpend by remember { mutableStateOf(false) }
    Box(modifier = Modifier.fillMaxSize() , contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.rowGap(30.px)) {
            Header(ctx, MenuItemStyle, SubMenuItemStyle, HeaderBackground, onMenuClicked = { menuOpend = true })
            if (menuOpend){
                OverFlowMenu(onMenuClosed = { menuOpend = false })
            }
            TeamBanner()
            SpanText(text = "Vidyadaan Team" ,
                modifier = Modifier
                    .fontFamily("poppins")
                    .fontSize(FontSize.XLarge)
                    .fontWeight(FontWeight.Bold)
                    .color(rgb(72, 22, 148)))
            VidyadaanTeam()
        }

    }
}

@Composable
fun TeamBanner() {
    Box(modifier = Modifier.fillMaxWidth().zIndex(1) , contentAlignment = Alignment.BottomCenter) {
        Image(src = "/grouppic_1.jpg", modifier = Modifier.width(100.vw).height(80.vh).objectFit(ObjectFit.Cover).overflow(
            Overflow.Hidden))
        Box(modifier = Modifier.fillMaxSize().backgroundColor(rgba(0,0,0,0.5f)))
        SpanText("Vidyadaan Club of GVPCE(A)" ,
            modifier = Modifier
                .fontFamily("poppins")
                .fontSize(FontSize.XLarge)
                .fontWeight(FontWeight.Bold)
                .color(Colors.White)
                .margin(bottom = 40.px)
        )
    }
}