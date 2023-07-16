package org.example.vidyadaan.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import org.example.vidyadaan.Contact_Us.ContactForm
import org.example.vidyadaan.Styles.HeaderBackground
import org.example.vidyadaan.Styles.MenuItemStyle
import org.example.vidyadaan.Styles.SubMenuItemStyle
import org.example.vidyadaan.components.Header
import org.example.vidyadaan.components.OverFlowMenu

@Page("contact_us")
@Composable
fun Contact() {
    val ctx = rememberPageContext()
    var menuOpend by remember { mutableStateOf(false) }
    Box(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Header(ctx, MenuItemStyle, SubMenuItemStyle, HeaderBackground, onMenuClicked = { menuOpend = true })
            if (menuOpend){
                OverFlowMenu(onMenuClosed = { menuOpend = false })
            }
            ContactForm()
        }
    }
}