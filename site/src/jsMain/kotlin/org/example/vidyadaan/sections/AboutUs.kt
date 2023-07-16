package org.example.vidyadaan.sections

import androidx.compose.runtime.Composable
import com.example.compose.Light_Blue
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.example.vidyadaan.Styles.aboutUsContainer
import org.example.vidyadaan.Team.styles.V_logoStyle
import org.example.vidyadaan.components.SectionHeader
import org.example.vidyadaan.models.Constants.aboutUsContent
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb
import org.jetbrains.compose.web.dom.Pre

@Composable
fun AboutUs() {
    val breakpoint = rememberBreakpoint()
    Box(modifier = Modifier.fillMaxWidth()
        .margin(topBottom = 40.px)
        .backgroundColor(Light_Blue)
        .padding(topBottom = 30.px)
        .overflow(Overflow.Hidden)
        , contentAlignment = Alignment.Center) {
        Column(modifier = aboutUsContainer.toModifier() , horizontalAlignment = Alignment.CenterHorizontally) {
            SectionHeader("About Us")
            SimpleGrid(numColumns = numColumns(base = 1 , md = 2 , sm = 1) , modifier = Modifier.fillMaxWidth()) {
                Row(modifier = Modifier.fillMaxWidth()
                    , verticalAlignment = Alignment.CenterVertically
                , horizontalArrangement = Arrangement.Center) {
                    Image(src = "/V_logo.png"
                        , modifier = V_logoStyle.toModifier()
                            .margin(right = if (breakpoint > Breakpoint.MD) 150.px else 0.px))
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Column(modifier = Modifier.fillMaxWidth().margin(bottom = 20.px)) {
                        SpanText(
                            text = "Vidyadaan", modifier = Modifier
                                .fontSize(FontSize.XLarge)
                                .fontWeight(FontWeight.SemiBold)
                                .color(Colors.Black)
                        )
                        Box(modifier = Modifier.height(2.px).width(100.px).backgroundColor(Colors.Black))
                    }
                    Pre(attrs = Modifier
                        .whiteSpace(WhiteSpace.PreWrap)
                        .toAttrs()) {
                        SpanText(
                            text = aboutUsContent
                            , modifier = Modifier
                                .fontFamily("poppins")
                                .fontSize(FontSize.Medium)
                        )
                    }
                }
            }
        }
    }
}