package org.example.vidyadaan.sections

import androidx.compose.runtime.Composable
import com.example.compose.*
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.AlignContent
import com.varabyte.kobweb.compose.css.functions.url
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.vidyadaan.Styles.GroupPicStyle
import org.example.vidyadaan.Styles.WhatWeDoStyle
import org.example.vidyadaan.models.Constants.WhatWeDoContent
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.P

@Composable
fun WhatWeDo() {
        Box(modifier = Modifier
            .margin(topBottom =  100.px)
            .fillMaxWidth()
            .backgroundImage(url("/clg_photo.jpeg"))
            .backgroundSize(BackgroundSize.Cover)
            .position(Position.Relative),
            contentAlignment = Alignment.Center) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .backgroundColor(rgba(39,31,127, 0.5f))
            )
            Column(
                modifier = WhatWeDoStyle.toModifier()
                    .margin(topBottom = 50.px)
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                SpanText("What We Do At Vidyadaan club of GVPCE(A)" ,
                    modifier = Modifier
                        .color(Yellow_Color)
                        .margin(topBottom = 30.px)
                        .fontSize(FontSize.XLarge)
                        .fontWeight(FontWeight.Bold))
                SimpleGrid(numColumns(base = 1, lg = 2)  ) {
                    Image(src = "/grouppic_1.jpg", modifier = GroupPicStyle.toModifier().margin(bottom = 30.px))
                    P {
                        SpanText(text = WhatWeDoContent ,
                            modifier = Modifier
                                .padding(leftRight = 20.px)
                                .fontSize(FontSize.Medium)
                                .color(White_Color)
                                .fontWeight(FontWeight.SemiBold))
                    }
                }
            }
        }
}