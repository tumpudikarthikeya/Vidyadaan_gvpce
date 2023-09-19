
package org.example.vidyadaan.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.dom.GenericTag
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.layout.Surface
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import com.example.compose.*
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayIf
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.vidyadaan.Events.models.mothers_day

@Composable
fun recruitment() {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .backgroundColor(Light_Pink),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(modifier = Modifier
                    .fillMaxHeight()
                    .width(200.px)
                    .backgroundColor(rgb(111, 178, 148))
                    .borderRadius(topRight = 30.px, bottomRight = 10.px),
                    verticalAlignment = Alignment.CenterVertically
                ){

                        SpanText(text = "Recruitment", modifier = Modifier.padding(10.px))
                        SpanText(" \uD83D\uDCE2" , modifier = Modifier.displayIf(Breakpoint.SM))
                }
                GenericTag("marquee") {
                H6(attrs = Modifier.padding(10.px).toAttrs()) {
                    Text(" ⚡ Vidyadaan club of GVPCE(A) is recruiting , ")
                    A(
                        href = "https://forms.gle/XC7oF3sGaYoxRYNd9",
                        attrs = Modifier
                            .fillMaxWidth()
                            .attrsModifier {
                                attr("target", "_blank")
                            }.toAttrs()
                    ) {
                        Text("Click here")
                    }
                    Text(" to join our club ⚡ ")
                }
            }
        }
    }
}
