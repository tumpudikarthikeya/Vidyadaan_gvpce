package org.example.vidyadaan.sections

import androidx.compose.runtime.Composable
import com.example.compose.Primary
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.WhiteSpace
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.vidyadaan.Styles.*
import org.example.vidyadaan.models.Constants.address
import org.example.vidyadaan.models.Constants.contactname_1
import org.example.vidyadaan.models.Constants.contactname_2
import org.example.vidyadaan.models.Constants.contactnum_1
import org.example.vidyadaan.models.Constants.contactnum_2
import org.example.vidyadaan.models.Constants.email
import org.example.vidyadaan.models.SocialBar
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun ContactInfo() {
    Box(modifier = ContactSectionContainer.toModifier()
        .width(100.vw)
        .backgroundColor(Primary)
        , contentAlignment = Alignment.Center) {
        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            /*Link( path="https://www.coolseotools.com/website-visitor-counter"
                , openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB ) {
                Image(
                    src = "https://www.coolseotools.com/website-visitor-counter/count/&style=style6&show=p&num=5&uid=ot",
                    desc = "AtoZSEOTools Web Counter"
                )
            }*/
            SpanText("Contact Us" ,
                modifier = TitleStyle.toModifier()
            )
            details()
        }

    }
}

@Composable
fun details() {
    SimpleGrid(numColumns = numColumns(base = 1 , lg = 3) , modifier = Modifier.fillMaxWidth() ) {
        Column(modifier = Modifier.fillMaxWidth() ,
            horizontalAlignment = Alignment.CenterHorizontally) {
                SpanText("ADDRESS" ,
                    modifier = TitleStyle1.toModifier())
            Pre(attrs = Modifier
                .whiteSpace(WhiteSpace.PreWrap)
                .toAttrs()) {
                SpanText(address,
                    modifier = dataStyle.toModifier()
                        .fontFamily("poppins")
                        .maxWidth(600.px))
            }


        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                SpanText(
                "ContactInfo",
                modifier = TitleStyle1.toModifier()
            )
            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start) {
                SpanText(
                    "E-Mail :",
                    modifier = TitleStyle2.toModifier()
                )
                A(href = "mailto:$email" , attrs = Modifier.textDecorationLine(TextDecorationLine.None).toAttrs()) {
                    SpanText(email, modifier = dataStyle.toModifier())
                }
            }
            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start) {
                SpanText(
                    "Mobile :",
                    modifier = TitleStyle2.toModifier()
                )
                A(href = "tel:+91$contactnum_1"
                    , attrs = Modifier.textDecorationLine(TextDecorationLine.None).toAttrs()) {
                    SpanText("$contactnum_1 ($contactname_1)", modifier = dataStyle.toModifier())
                }
            }
            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start) {
                SpanText(
                    "Mobile :",
                    modifier = TitleStyle2.toModifier()
                )
                A(href = "tel:+91$contactnum_2"
                    , attrs = Modifier.textDecorationLine(TextDecorationLine.None).toAttrs()) {
                    SpanText("$contactnum_2 ($contactname_2)", modifier = dataStyle.toModifier())
                }
            }
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            SpanText("FOLLOW US" ,
                modifier = TitleStyle1.toModifier())
            SocialBar()
        }
    }
}





