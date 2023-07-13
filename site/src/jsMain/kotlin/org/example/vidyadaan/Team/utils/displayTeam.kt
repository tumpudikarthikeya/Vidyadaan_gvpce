package org.example.vidyadaan.Team.utils

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.vidyadaan.Team.components.TeamCard
import org.example.vidyadaan.Team.model.TeamDetails
import org.example.vidyadaan.Team.model.WebTeamMembers.Karthikeya
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb

@Composable
fun displayTeam(year : Any , team : List<TeamDetails> = listOf()) {

    Box(modifier = Modifier.margin(80.px).backgroundColor(rgb(246, 248, 255))
    , contentAlignment = Alignment.Center) {
        Column( modifier = Modifier.fillMaxSize() ,horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SpanText(text = "$year" ,
                modifier = Modifier
                    .fontFamily("poppins")
                    .fontSize(FontSize.XLarge)
                    .color(rgb(21, 98, 205))
                    .fontWeight(FontWeight.SemiBold))
            Box(modifier = Modifier.height(2.px).width(100.px).backgroundColor(rgb(255,211,1)))
            SimpleGrid(numColumns(base = 1 , lg = 3, md = 2)) {
                team.forEach {
                    TeamCard(it)
                }
            }
        }
    }

}