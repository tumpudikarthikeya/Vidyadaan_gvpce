package org.example.vidyadaan.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgba
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.css.vw
import org.jetbrains.compose.web.dom.*

@Composable
fun ImageCarousel() {
    Div(attrs = Modifier.id("Example")
        .classNames("carousel","slide")
        .attrsModifier { attr("data-bs-ride","carousel")
        attr("data-interval","2000") }.toAttrs()) {

        Ol(attrs = Modifier.classNames("carousel-indicators").columnGap(10.px).toAttrs()) {
            Button(attrs = Modifier.attrsModifier {
                attr("data-bs-target", "#Example")
                attr("data-bs-slide-to", "0")
            }.classNames("active").toAttrs())
            Button( attrs = Modifier.attrsModifier { attr("data-bs-target","#Example")
                attr("data-bs-slide-to","1")}.toAttrs())
            Button( attrs = Modifier.attrsModifier { attr("data-bs-target","#Example")
                attr("data-bs-slide-to","2")}.toAttrs())
        }
            Div(attrs = Modifier.classNames("carousel-inner").toAttrs()) {
                Box(modifier = Modifier.classNames("carousel-item", "active" )) {
                    ImageWithCover("grouppic_1.jpg")
                    Div(attrs = Modifier.classNames("carousel-caption").toAttrs()){
                        SpanText(text = "Vidyadaan Club of GVPCE(A)" ,
                            modifier = Modifier
                                .fontFamily("poppins")
                                .fontSize(FontSize.XLarge)
                                .fontWeight(FontWeight.SemiBold)
                        )
                    }
                }
                Div(attrs = Modifier.classNames("carousel-item").toAttrs()) {
                    ImageWithCover("grouppic2.jpg")
                }
                Div(attrs = Modifier.classNames("carousel-item").toAttrs()) {
                    ImageWithCover("grouppic_1.jpg")
                }


            }

        Button( attrs = Modifier.classNames("carousel-control-prev")
            .attrsModifier { attr("data-bs-target","#Example")
            attr("data-bs-slide" ,"prev")} .toAttrs()) {
            Span(attrs = Modifier.classNames("carousel-control-prev-icon")
                .attrsModifier { attr("aria-hidden","true")}.toAttrs()){
                Span(attrs = Modifier.classNames("visually-hidden").toAttrs()) {
                    Text("Previous")
                }
            }

        }
        Button( attrs = Modifier.classNames("carousel-control-next")
            .attrsModifier { attr("data-bs-target","#Example")
                attr("data-bs-slide" ,"next")} .toAttrs()) {
            Span(attrs = Modifier.classNames("carousel-control-next-icon")
                .attrsModifier { attr("aria-hidden","true")}.toAttrs())
            Span(attrs = Modifier.classNames("visually-hidden").toAttrs()) {
                Text("Next")
            }

        }
    }
}

@Composable
fun ImageWithCover(pic : String) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            src = pic,
            modifier = Modifier.height(100.vh).width(100.vw).objectFit(ObjectFit.Cover)
        )
        Box(modifier = Modifier.fillMaxSize().backgroundColor(rgba(0,0,0,0.4f)))
    }
}