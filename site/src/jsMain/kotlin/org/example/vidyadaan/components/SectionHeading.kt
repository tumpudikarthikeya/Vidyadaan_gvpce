package org.example.vidyadaan.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb

@Composable
fun SectionHeader(name : String) {
    Column(modifier = Modifier.margin(bottom = 30.px)) {
        SpanText(text = name ,
            modifier = Modifier
                .fontFamily("poppins")
                .fontSize(FontSize.XXLarge)
                .fontWeight(FontWeight.Bold)
                .color(rgb(50,10,114)))
        Image(src = "underline.svg" )
    }
}