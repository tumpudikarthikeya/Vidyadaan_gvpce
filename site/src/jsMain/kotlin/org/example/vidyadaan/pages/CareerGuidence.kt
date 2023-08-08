package org.example.vidyadaan.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.example.vidyadaan.CareerGuidence.model.careerGuidenceModel
import org.example.vidyadaan.CareerGuidence.streamBoxStyle
import org.example.vidyadaan.Styles.HeaderBackground
import org.example.vidyadaan.Styles.MenuItemStyle
import org.example.vidyadaan.Styles.SubMenuItemStyle
import org.example.vidyadaan.components.BackToTop
import org.example.vidyadaan.components.Header
import org.example.vidyadaan.components.OverFlowMenu
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.A

@Page("careerGuidance")
@Composable
fun careerGuidance(){
    val ctx = rememberPageContext()
    var menuOpend by remember { mutableStateOf(false) }
    Box(modifier = Modifier
        .fillMaxSize()
        .overflow(Overflow.Hidden)
        , contentAlignment = Alignment.TopCenter) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.rowGap(30.px)
        ) {
            Header(ctx, MenuItemStyle, SubMenuItemStyle, HeaderBackground, onMenuClicked = { menuOpend = true })
            if (menuOpend) {
                OverFlowMenu(onMenuClosed = { menuOpend = false })
            }
            SpanText("Career Guidance" ,
                modifier = Modifier
                    .margin(top = 200.px , bottom = 60.px)
                    .fontWeight(FontWeight.Bolder)
                    .fontSize(FontSize.XLarge))
            SimpleGrid(numColumns = numColumns(base = 1, lg = 2),
                modifier = streamBoxStyle.toModifier()) {
                careerGuidenceModel.values().forEach {
                    streamContent(it)
                }
            }


        }
        BackToTop()
    }
}

@Composable
fun streamContent(item : careerGuidenceModel){
        A(attrs = Modifier
            .attrsModifier {
                attr("download",item.streamName)
            }
            .toAttrs() , href = "/After10th/${item.ppt}") {
            Box(contentAlignment =Alignment.CenterEnd) {
                Box(
                    modifier = item.color
                        .borderRadius(30.px)
                        .color(Colors.Black), contentAlignment = Alignment.Center
                ) {
                    SpanText(
                        text = item.streamName,
                        modifier = Modifier
                            .padding(left =50.px  ,right = 250.px , top = 50.px , bottom = 50.px)
                            .fontSize(FontSize.Large)
                    )

                }
                Image(src = "/After10th/student1.png"
                    , modifier = Modifier
                        .height(250.px)
                        .padding(bottom = 50.px))
            }
        }
}