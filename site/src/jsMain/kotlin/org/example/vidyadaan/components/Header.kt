package org.example.vidyadaan.components

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.dom.ElementTarget
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaBars
import com.varabyte.kobweb.silk.components.icons.fa.FaCaretDown
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayIf
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayUntil
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.overlay.KeepPopupOpenStrategy
import com.varabyte.kobweb.silk.components.overlay.Popover
import com.varabyte.kobweb.silk.components.overlay.onHover
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import kotlinx.coroutines.launch
import org.example.vidyadaan.models.HeaderContent
import org.example.vidyadaan.models.SubMenu
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.dom.Col
import org.jetbrains.compose.web.dom.Nav

@Composable
fun Header(ctx: PageContext, MenuStyle:ComponentStyle, SubMenuStyle:ComponentStyle, HeaderStyle:ComponentStyle, onMenuClicked:() -> Unit) {
    Column(modifier = Modifier.fillMaxWidth().position(Position.Fixed).zIndex(5)) {
        Row(
            modifier = HeaderStyle.toModifier()
                .overflow(Overflow.Hidden)
                //.position(Position.Fixed)
                .padding(topBottom = 15.px)
                //.zIndex(5)
            ,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Logo(ctx)
            Row(
                modifier = Modifier.displayIf(Breakpoint.LG).margin(right = 50.px),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RightPart(ctx, MenuStyle, SubMenuStyle)
            }

            FaBars(size = IconSize.LG,
                modifier = Modifier
                    .margin(right = 50.px)
                    .cursor(Cursor.Pointer)
                    .color(Colors.White)
                    .displayUntil(Breakpoint.LG)
                    .onClick { onMenuClicked() })
        }
        recruitment()
    }
}




@Composable
fun RightPart(ctx: PageContext , MenuStyle: ComponentStyle , SubMenuStyle: ComponentStyle) {
    HeaderContent.values().forEach {
        if (it.subMenu !=1) {
            MenuWithoutSubMenu(it.pagename , it.path,ctx , MenuStyle)
        }
        else {
            MenuWithSubMenu(it.pagename ,
                ctx ,
                listOf(SubMenu("2023","/events"),SubMenu("2022","/events"),SubMenu("2021","/events"))
                , SubMenuStyle , MenuStyle)

        }
    }
}
@Composable
fun Logo(ctx: PageContext) {
    Image(src="/VIDYADAAN_LOGO.png" ,
        modifier = Modifier
            .cursor(Cursor.Pointer)
            .margin(left = 30.px)
            .size(40.px)
            .onClick { ctx.router.navigateTo("/") })
}

@Composable
fun MenuWithoutSubMenu(name: String, path: String, ctx: PageContext, MenuStyle: ComponentStyle) {
    Nav {
        SpanText(text = name,
            modifier = MenuStyle.toModifier()
                .onClick { ctx.router.navigateTo(path) }
                .padding(topBottom = 10.px, leftRight = 30.px)
                .cursor(Cursor.Pointer))
    }

}

@Composable
fun MenuWithSubMenu(
    name: String,
    ctx: PageContext,
    submenu: List<SubMenu>,
    SubMenuStyle: ComponentStyle,
    MenuStyle: ComponentStyle
) {
    Column( horizontalAlignment = Alignment.CenterHorizontally) {
        val keepOpenStrategyHover = remember { KeepPopupOpenStrategy.onHover() }
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = MenuStyle.toModifier().padding(topBottom = 10.px, leftRight = 30.px).columnGap(10.px).cursor(Cursor.Pointer)
        ) {
            SpanText(
                text = name,
                modifier = Modifier
                    .fontFamily("poppins")
            )
            FaCaretDown(size = IconSize.SM)
        }
            Popover(ElementTarget.PreviousSibling ,
                modifier = Modifier.margin(top = -0.5.cssRem).zIndex(6) ,
                keepOpenStrategy = keepOpenStrategyHover,
                hideDelayMs = 100) {
                Column(modifier = Modifier
                    .backgroundColor(Colors.White)
                    .borderRadius(3.px)
                    .padding(topBottom = 5.px)
                    .alignItems(AlignItems.Stretch),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    submenu.forEach { subitem ->
                        SpanText(text = subitem.subMenu,
                            modifier = SubMenuStyle.toModifier()
                                .padding(topBottom =8.px , leftRight = 40.px)
                                .onClick { ctx.router.navigateTo("${subitem.path}/${subitem.subMenu}") }
                                .fontFamily("poppins")
                                .fontSize(FontSize.Medium)
                                .cursor(Cursor.Pointer))
                    }
                }
            }
        }

}