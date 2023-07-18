package org.example.vidyadaan.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.ScrollBehavior
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.vidyadaan.EventDetails.style.RegButtonStyle
import org.example.vidyadaan.Team.model.CoreTeam
import org.example.vidyadaan.Team.model.Faculty
import org.example.vidyadaan.Team.utils.displayTeam
import org.example.vidyadaan.components.SectionHeader
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button

@Composable
fun OurTeam(ctx : PageContext) {
    Box(modifier = Modifier.fillMaxWidth().margin(topBottom = 50.px)) {
        Column(modifier = Modifier.fillMaxWidth() , horizontalAlignment = Alignment.CenterHorizontally) {
            SectionHeader("Our Team")
            displayTeam(team = Faculty.FacultyTeam)
            displayTeam( CoreTeam.coreTeam[2023]!!)
            Button(attrs = RegButtonStyle.toModifier()
                .padding(topBottom = 15.px  , leftRight = 20.px)
                .onClick {  ctx.router.navigateTo("/team") }
                .toAttrs()) {
                SpanText("Complete Team" ,
                    modifier = Modifier
                        .fontFamily("poppins")
                        .fontSize(FontSize.Medium)
                )
            }
        }
    }
}