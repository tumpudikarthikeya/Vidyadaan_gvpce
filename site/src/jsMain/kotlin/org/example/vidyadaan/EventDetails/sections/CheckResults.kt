package org.example.vidyadaan.EventDetails.sections

import androidx.compose.runtime.CheckResult
import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text

@Composable
fun Result() {
    Column( modifier = Modifier.fillMaxHeight()
    , horizontalAlignment = Alignment.Start
    , verticalArrangement = Arrangement.Center) {
                Box(
                    Modifier
                        .height(60.px)
                        .backgroundColor(Colors.Yellow)
                        .position(Position.Fixed)
                ) {
                    Link(path = "#result") {
                        SpanText(
                            "Check Results",
                            modifier = Modifier
                                .padding(20.px)
                                .fontFamily("poppins")
                        )
                    }
                }
            }
}
