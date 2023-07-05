package org.example.vidyadaan.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import org.example.vidyadaan.Events.sections.eventlists
import org.example.vidyadaan.components.MenuWithSubmenu
import org.example.vidyadaan.components.abc
import org.example.vidyadaan.components.q
import org.jetbrains.compose.web.css.vh

@Page
@Composable
fun HomePage() {
    // TODO: Add content here
    val ctx = rememberPageContext()
    Column(Modifier.fillMaxSize()) {
        eventlists(ctx , 2023)
      /*      Box {
                        //abc(ctx)
                Image(src = "grouppic_1.jpg", modifier = Modifier.fillMaxWidth().objectFit(ObjectFit.Cover).height(100.vh))
                MenuWithSubmenu()
            }
            Image(src = "grouppic_1.jpg", modifier = Modifier.fillMaxWidth().objectFit(ObjectFit.Cover).height(100.vh))
            q(ctx)*/

    }
}
