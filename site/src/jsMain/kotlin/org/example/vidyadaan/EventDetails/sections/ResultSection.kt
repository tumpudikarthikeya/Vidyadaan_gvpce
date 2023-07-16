package org.example.vidyadaan.EventDetails.sections

import androidx.compose.runtime.Composable
import com.example.compose.Primary
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.WhiteSpace
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.breakpoint.BreakpointSizes
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.example.vidyadaan.EventDetails.style.PosterStyle
import org.example.vidyadaan.EventDetails.style.headingvalue1
import org.example.vidyadaan.EventDetails.style.titlestyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Pre

@Composable
fun ResultSection(winners: String, results: List<String>) {
    val breakpoint = rememberBreakpoint()
    Column(modifier = Modifier.fillMaxWidth().margin(bottom = 50.px).id("result") ,
            horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        SpanText(
            text = "Result",
            modifier = titlestyle.toModifier()
                .color(Primary)
                .fontWeight(FontWeight.SemiBold)
                .textAlign(TextAlign.Center)
                .margin(bottom = 20.px)
        )
                if (winners != "") {
                    Pre(attrs = Modifier
                        .whiteSpace(WhiteSpace.PreWrap)
                        .toAttrs()) {
                        SpanText(
                            text = winners,
                            modifier = headingvalue1.toModifier()
                        )
                    }
                }
        else {
                SimpleGrid(numColumns = numColumns(base = 1 ,md = 2 )
                    , modifier = Modifier.columnGap(if (breakpoint >= Breakpoint.MD) 20.px else 0.px)) {
                    results.forEach {item ->
                        Image(src = item, modifier = PosterStyle.toModifier())
                    }
                }

        }


    }
}
