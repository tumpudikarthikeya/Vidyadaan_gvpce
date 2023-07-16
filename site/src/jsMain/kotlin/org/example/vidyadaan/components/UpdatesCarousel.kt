package org.example.vidyadaan.components

import androidx.compose.runtime.Composable
import com.example.compose.Primary
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.icons.fa.FaChevronLeft
import com.varabyte.kobweb.silk.components.icons.fa.FaChevronRight
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.example.vidyadaan.Styles.Updates_Container
import org.example.vidyadaan.Styles.Updates_text_Style
import org.example.vidyadaan.models.EventUpdates
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun UpdatesCarousal() {
    val ctx = rememberPageContext()
    val size = EventUpdates.values().size
    Box(modifier = Modifier.id("AllUpdates")
        .fillMaxWidth()
        .padding(50.px)
        .classNames("carousel","slide")
        .attrsModifier { attr("data-bs-ride","carousel")
            attr("data-interval","2000") },
        contentAlignment = Alignment.Center) {

        Ol(attrs = Modifier.classNames("carousel-indicators").columnGap(10.px).toAttrs()) {
            Button(attrs = Modifier
                .backgroundColor(Primary)
                .attrsModifier {
                attr("data-bs-target", "#AllUpdates")
                attr("data-bs-slide-to", "0")
            }.classNames("active").toAttrs())
            for (i in 1 until size ) {
                Button(attrs = Modifier
                    .backgroundColor(Primary)
                    .attrsModifier {
                    attr("data-bs-target", "#AllUpdates")
                    attr("data-bs-slide-to", "$i")
                }.toAttrs())
            }
        }
        Row(modifier = Modifier.fillMaxWidth()
            ,verticalAlignment = Alignment.CenterVertically
        , horizontalArrangement = Arrangement.Center) {
            Button(attrs = Modifier.classNames("carousel-control-prev")
                .padding(2.px)
                .attrsModifier {
                    attr("data-bs-target", "#AllUpdates")
                    attr("data-bs-slide", "prev")
                }.toAttrs()) {
                FaChevronLeft(size = IconSize.LG,
                    modifier = Modifier
                        .color(Primary)
                )
            }
            Div(
                attrs = Updates_Container.toModifier()
                    .padding(topBottom = 40.px )
                    .classNames("carousel-inner")
                    .toAttrs()
            ) {
                Div(attrs = Modifier.classNames("carousel-item", "active").toAttrs()) {
                    SpanText(
                        text = EventUpdates.values()[0].info + ". Check the details ",
                        modifier = Updates_text_Style.toModifier()
                    )
                    A(attrs = Modifier
                        .onClick { ctx.router.navigateTo("EventDetails/${EventUpdates.values()[0].year}/${EventUpdates.values()[0].eventNo}") }
                        .toAttrs()
                    ) {
                        SpanText(
                            text = "here",
                            modifier = Updates_text_Style.toModifier()
                                .color(Colors.SkyBlue)
                                .cursor(Cursor.Pointer)
                        )
                    }
                }
                EventUpdates.values().slice(1 until size).forEach { item ->
                    Div(attrs = Modifier.classNames("carousel-item").toAttrs()) {
                        SpanText(
                            text = item.info + ". Check the details ",
                            modifier = Updates_text_Style.toModifier()
                        )
                        A(attrs = Modifier.onClick { ctx.router.navigateTo("EventDetails/${item.year}/${item.eventNo}") }
                            .toAttrs()) {
                            SpanText(
                                text = "here",
                                modifier = Updates_text_Style.toModifier()
                                    .color(Colors.SkyBlue)
                                    .cursor(Cursor.Pointer)

                            )
                        }
                    }
                }


            }


            Button(attrs =
            Modifier.classNames("carousel-control-next")
                .padding(2.px)
                .attrsModifier {
                    attr("data-bs-target", "#AllUpdates")
                    attr("data-bs-slide", "next")
                }.toAttrs()) {
                FaChevronRight(size = IconSize.LG, modifier = Modifier.color(Primary))

            }
        }
    }
}