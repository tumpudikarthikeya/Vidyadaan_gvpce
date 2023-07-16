package org.example.vidyadaan.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.vidyadaan.Styles.Updates_Box
import org.example.vidyadaan.components.SectionHeader
import org.example.vidyadaan.components.UpdatesCarousal

@Composable
fun Updates() {
    Box(modifier = Updates_Box.toModifier() ,
        contentAlignment = Alignment.Center) {
        Column(modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SectionHeader("Updates")
            UpdatesCarousal()
        }
    }
}