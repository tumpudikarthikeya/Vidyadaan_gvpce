package org.example.vidyadaan.Contact_Us

import androidx.compose.runtime.Composable
import com.example.compose.Primary
import com.example.compose.Secondary
import com.example.compose.Tertiary
import com.example.compose.White_Color
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.style.KobwebComposeStyleSheet.attr
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayIf
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayUntil
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun ContactForm() {
    Column(modifier = Modifier.fillMaxSize().margin(bottom = 30.px) , horizontalAlignment = Alignment.CenterHorizontally) {
        Box( modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(src = "/wave.svg", modifier = Modifier.fillMaxWidth())
            SpanText(text = "Contact Us",
                modifier = Modifier
                    .displayIf(Breakpoint.MD)
                    .fontSize(45.px)
                    .fontWeight(FontWeight.Bolder)
                    .color(White_Color))
        }
        SpanText(text = "Contact Us",
            modifier = Modifier
                .displayUntil(Breakpoint.MD)
                .margin(bottom = 30.px)
                .fontSize(FontSize.XXLarge)
                .fontWeight(FontWeight.Bold)
                .color(Primary))

        Row(modifier = Modifier.fillMaxWidth(75.percent).columnGap(30.px),
            horizontalArrangement = Arrangement.Center , verticalAlignment = Alignment.CenterVertically) {
            Image(src = "/Contact.jpg"  , modifier = Modifier.size(400.px).displayIf(Breakpoint.LG))
            Box(modifier = Modifier
                .fillMaxWidth()) {
                Form(action = "https://formspree.io/f/xdororrq",
                    attrs = Modifier
                        .fillMaxWidth()
                        .attrsModifier {
                            attr("method", "POST")
                        }
                        .toAttrs()) {
                    Label(
                        attrs = Modifier
                            .classNames("form-label")
                            .toAttrs(),
                        forId = "inputName"
                    ) {
                        Text("Name")
                    }
                    Input(type = InputType.Text,
                        attrs = Modifier
                            .fillMaxWidth()
                            .id("inputName")
                            .classNames("form-control")
                            .boxShadow(0.px, 0.px, 0.px, 0.px, null)
                            .margin(bottom = 20.px)
                            .backgroundColor(Tertiary)
                            .attrsModifier {
                                attr("placeholder", "Full Name")
                                attr("name", "name")
                                attr("required", "true")
                            }
                            .toAttrs()
                    )
                    Label(
                        attrs = Modifier
                            .classNames("form-label")
                            .toAttrs(),
                        forId = "inputEmail"
                    ) {
                        Text("Email")
                    }
                    Input(type = InputType.Email,
                        attrs = Modifier
                            .id("inputEmail")
                            .classNames("form-control")
                            .boxShadow(0.px, 0.px, 0.px, 0.px, null)
                            .margin(bottom = 20.px)
                            .fillMaxWidth()
                            .backgroundColor(Tertiary)
                            .attrsModifier {
                                attr("placeholder", "Email Address")
                                attr("name", "email")
                                //attr("required", "true")
                            }
                            .toAttrs()
                    )
                    Label(
                        attrs = Modifier
                            .classNames("form-label")
                            .toAttrs(),
                        forId = "inputMessage"
                    ) {
                        Text("Message")
                    }
                    TextArea(
                        attrs = Modifier
                            .id("inputMessage")
                            .classNames("form-control")
                            .boxShadow(0.px, 0.px, 0.px, 0.px, null)
                            .margin(bottom = 30.px)
                            .height(150.px)
                            .fillMaxWidth()
                            .backgroundColor(Tertiary)
                            .attrsModifier {
                                attr("placeholder", "Your Message")
                                attr("name", "message")
                                attr("required", "true")
                            }
                            .toAttrs()
                    )
                    Button(
                        attrs = SendButtonStyle.toModifier()
                            .border(width = 0.px)
                            .borderRadius(30.px)
                            .padding(topBottom = 10.px , leftRight = 30.px)
                            .backgroundColor(Secondary)
                            .color(Colors.White)
                            .cursor(Cursor.Pointer)
                            .toAttrs()
                    ) {
                        Text("Send Message")
                    }
                }
            }
        }
    }
}