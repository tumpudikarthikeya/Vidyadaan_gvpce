package org.example.vidyadaan.components

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.icons.fa.FaCaretDown
import com.varabyte.kobweb.silk.components.icons.fa.FaXmark
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.example.vidyadaan.Styles.MenuItemStyle
import org.example.vidyadaan.Styles.MenuItemStyle2
import org.example.vidyadaan.Styles.SubMenuItemStyle2
import org.example.vidyadaan.models.HeaderContent
import org.example.vidyadaan.models.SubMenu
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun OverFlowMenu(onMenuClosed : () -> Unit) {
    val ctx = rememberPageContext()
    val breakpoint = rememberBreakpoint()
    val scope = rememberCoroutineScope()
    var translateX by remember { mutableStateOf((-100).percent) }

    LaunchedEffect(breakpoint) {
        translateX = 0.percent
        if (breakpoint > Breakpoint.MD) {
            translateX = (-100).percent
            delay(500)
            onMenuClosed()
        }
    }
    Column(
        modifier = Modifier
            .zIndex(5)
            .backgroundColor(rgb(72, 22, 148))
            .height(100.vh)
            .width(100.vw)
            .position(Position.Fixed)
            //.padding(all = 25.px)
            .overflow(Overflow.Auto)
            .scrollBehavior(ScrollBehavior.Smooth)
            .translateX(tx = translateX)
            .transition(CSSTransition(property = "translateX", duration = 500.s))
        , horizontalAlignment = Alignment.CenterHorizontally
    ) {Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding( 30.px)
            .margin(bottom = 20.px)) {
        P(
            attrs = Modifier
                .fontFamily("poppins")
                .fontSize(20.px)
                .margin(right = 10.px)
                .fontWeight(FontWeight.Bold)
                .color(Colors.White)
                .toAttrs()
        ) {
            Text(value = "Vidyadaan")
        }
        FaXmark(modifier = Modifier
            .cursor(Cursor.Pointer)
            .color(Colors.Red)
            .margin(right = 20.px)
            .onClick {
                scope.launch {
                    translateX = (-100).percent
                    onMenuClosed()
                }
            },
            size = IconSize.X1
        )

    }
        HeaderContent.values().forEach {item ->
            if (item.subMenu !=1) {
                SpanText(text = item.pagename ,
                    modifier = MenuItemStyle2.toModifier()
                        .onClick {
                            ctx.router.navigateTo(item.path)
                            scope.launch {
                                translateX = (-100).percent
                                onMenuClosed()
                            }
                        }
                        .padding(topBottom = 10.px , leftRight = 30.px)
                        .fontFamily("poppins")
                        .fontSize(FontSize.Medium)
                        .cursor(Cursor.Pointer))
            }
            else {
                OverflowMenuWithSubMenu(item.pagename ,
                    ctx ,
                    listOf(SubMenu("2023","/events"), SubMenu("2022","/events"), SubMenu("2021","/events"))
                    , SubMenuItemStyle2 , MenuItemStyle)

            }
        }
    }
}




@Composable
fun OverflowMenuWithSubMenu(
    name: String,
    ctx: PageContext,
    submenu: List<SubMenu>,
    SubMenuStyle: ComponentStyle,
    MenuStyle: ComponentStyle
) { var clicked by remember { mutableStateOf(false) }
    Column( horizontalAlignment = Alignment.CenterHorizontally ,
        modifier = Modifier.backgroundColor(if(clicked) rgb(50, 10, 114) else rgb(72, 22, 148))) {
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = MenuItemStyle2.toModifier()
                .cursor(Cursor.Pointer)
                .onClick { clicked = !clicked }
                .padding(topBottom = 10.px, leftRight = 30.px)
                .columnGap(10.px) ) {
            SpanText(
                text = name,
                modifier = Modifier
                    .fontFamily("poppins")
                    .fontSize(FontSize.Medium)

            )
            FaCaretDown(size = IconSize.SM )
        }
        if (clicked) {
            Column(modifier = Modifier
                .borderRadius(3.px)
                .padding(topBottom = 5.px)
                .alignItems(AlignItems.Stretch),
                horizontalAlignment = Alignment.CenterHorizontally) {
                submenu.forEach { subitem ->
                    SpanText(text = subitem.subMenu,
                        modifier = SubMenuStyle.toModifier()
                            .padding(topBottom = 8.px, leftRight = 40.px)
                            .onClick { ctx.router.navigateTo("${subitem.path}/${subitem.subMenu}") }
                            .fontFamily("poppins")
                            .fontSize(FontSize.Medium)
                            .cursor(Cursor.Pointer))
                }
            }
        }
    }

}

