package org.example.vidyadaan.CareerGuidence.model

import com.varabyte.kobweb.compose.ui.Modifier
import org.example.vidyadaan.CareerGuidence.*

enum class careerGuidenceModel(
    val streamName :String,
    val ppt : String,
    val color :Modifier = Modifier,
    val textColor : Modifier = Modifier
) {
    Polytechnic("POLYTECHNIC","POLYTECHNIC.pptx", blueGradient,),
    ITI("Industrial Training Institute","ITI.pptx",purpleGradient),
    Paramedical("PARAMEDICAL","PARAMEDICAL.pptx",greenGradient),
    Intermediate("INTERMEDIATE","INTERMEDIATE.pptx",pinkGradient),
    ShortTerm("SHORT TERM Courses","SHORTTERM.pptx",threeColorGradient)
}