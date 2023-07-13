package org.example.vidyadaan.Team.sections

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayIf
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayUntil
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.vidyadaan.Team.model.BranchCoordinators.branchCoordinatorsTeam
import org.example.vidyadaan.Team.model.CoreTeam.coreTeam
import org.example.vidyadaan.Team.model.Designing.designingTeam
import org.example.vidyadaan.Team.model.Documentation.documentationTeam
import org.example.vidyadaan.Team.model.EventCoordinators.eventCoordinatorsTeam
import org.example.vidyadaan.Team.model.EventOrganizers.eventOrganizersTeam
import org.example.vidyadaan.Team.model.PublicRelations.publicRelationsTeam
import org.example.vidyadaan.Team.model.WebDesigning.webDesigningTeam
import org.example.vidyadaan.Team.utils.displayTeam
import org.example.vidyadaan.models.Constants.Teams_Names
import org.example.vidyadaan.models.Teams_Tab
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb
import org.jetbrains.compose.web.css.s
import org.jetbrains.compose.web.dom.Option
import org.jetbrains.compose.web.dom.Select

@Composable
fun VidyadaanTeam() {
    Box(modifier = Modifier.fillMaxWidth() , contentAlignment = Alignment.Center) {
        var selectedTeam by remember { mutableStateOf(1) }
        Column(modifier = Modifier.fillMaxWidth() , horizontalAlignment = Alignment.CenterHorizontally) {
            Row(modifier = Modifier.padding(20.px).backgroundColor(rgb(246, 243, 249)).displayIf(Breakpoint.LG)) {
                Teams_Tab.values().forEach { team ->
                    SpanText(text = team.team_name,
                        modifier = Modifier
                            .padding(topBottom = 20.px, leftRight = 30.px)
                            .fontFamily("poppins")
                            .cursor(Cursor.Pointer)
                            .fontSize(FontSize.Medium)
                            .onClick { selectedTeam = team.id }
                            .transition(CSSTransition("backgroundColor", duration = 1.s))
                            .color(if (selectedTeam == team.id) Colors.White else rgb(72, 22, 148))
                            .backgroundColor(if (selectedTeam == team.id) rgb(72, 22, 148) else rgb(246, 243, 249))
                    )
                }
            }

            Select(attrs = Modifier
                .width(260.px)
                .height(35.px)
                .displayUntil(Breakpoint.LG)
                .color(Colors.White)
                .border(0.px)
                .backgroundColor(rgb(72, 22, 148))
                .id("dp")
                .toAttrs {
                    onInput {
                        selectedTeam = it.value!!.toInt() ?: 1

                        }
                    }
                ) {
                    Teams_Tab.values().forEach { team ->
                        Option(value = team.id.toString()
                            , content = {SpanText(text = team.team_name)},
                                attrs = Modifier
                                    .fontFamily("poppins")
                                    .fontSize(FontSize.Medium)
                                    .margin(topBottom = 20.px)
                                    .toAttrs()
                            )
                    }
            }

            Display_Team(selectedTeam)

        }
    }
}

@Composable
fun Display_Team( selectedTeam :Int) {
    Column(
        modifier = Modifier.fillMaxWidth().rowGap(40.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (selectedTeam == 1) {
            displayTeam(Teams_Names[1], coreTeam[2023]!!)
            displayTeam(Teams_Names[2], webDesigningTeam[2023]!!)
            displayTeam(Teams_Names[3], documentationTeam[2023]!!)
            displayTeam(Teams_Names[4], designingTeam[2023]!!)
            displayTeam(Teams_Names[5], eventCoordinatorsTeam[2023]!!)
            displayTeam(Teams_Names[6], branchCoordinatorsTeam[2023]!!)
            displayTeam(Teams_Names[7], eventOrganizersTeam[2023]!!)
            displayTeam(Teams_Names[8], publicRelationsTeam[2023]!!)
        } else if (selectedTeam == 2) {

            displayTeam(2023, coreTeam[2023]!!)
        } else if (selectedTeam == 3) {
            displayTeam(2023, webDesigningTeam[2023]!!)
        } else if (selectedTeam == 4) {
            displayTeam(2023, documentationTeam[2023]!!)
        } else if (selectedTeam == 5) {
            displayTeam(2023, designingTeam[2023]!!)
        } else if (selectedTeam == 6) {
            displayTeam(Teams_Names[5], eventCoordinatorsTeam[2023]!!)
            displayTeam(Teams_Names[6], branchCoordinatorsTeam[2023]!!)
        } else if (selectedTeam == 7) {
            displayTeam(2023, eventOrganizersTeam[2023]!!)
        } else if (selectedTeam == 8) {
            displayTeam(2023, publicRelationsTeam[2023]!!)
        }
    }
}