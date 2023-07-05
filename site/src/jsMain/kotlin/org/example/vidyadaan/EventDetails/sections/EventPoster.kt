package org.example.vidyadaan.EventDetails.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.VerticalAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb
import org.jetbrains.compose.web.css.vh

@Composable
fun EventPoster(  poster :String  , title :String) {

    Box (modifier = Modifier.fillMaxWidth().height(90.vh).backgroundColor(rgb(41, 62, 70)) , contentAlignment = Alignment.Center) {

        SimpleGrid(numColumns = numColumns(base = 1 , sm = 2) , modifier = Modifier.fillMaxWidth(80.percent)) {
            Image(src = "/$poster" , modifier = Modifier.size(400.px))
            SpanText(text = title ,
                modifier = Modifier
                    .fontFamily("poppins")
                    .fontSize(FontSize.XXLarge)
                    .fontWeight(FontWeight.SemiBold)
                    .textAlign(TextAlign.Center)
            )
        }
    }

}