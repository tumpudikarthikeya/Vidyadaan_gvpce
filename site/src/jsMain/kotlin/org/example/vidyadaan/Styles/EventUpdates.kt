package org.example.vidyadaan.Styles

import androidx.compose.runtime.Composable
import com.example.compose.Tertiary
import com.varabyte.kobweb.compose.dom.GenericTag
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.rowGap
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.HTMLMarqueeElement

@Composable
fun EventUpdates() {
    Box(modifier = Modifier.backgroundColor(Tertiary).margin(topBottom = 50.px)) {
        GenericTag("marquee" , "direction=\"up\"id =\"ex\"" ) {
            Column(modifier = Modifier.rowGap(20.px)) {
                for (i in 1..10) {
                    SpanText("$i news register here" )
                }
            }
        }
    }
}
/*onmouseover = "this.stop();"onmouseout = "this.start();"*/