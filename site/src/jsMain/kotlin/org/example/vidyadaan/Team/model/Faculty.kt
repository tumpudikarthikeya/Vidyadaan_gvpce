package org.example.vidyadaan.Team.model

import org.example.vidyadaan.Team.model.FacultyMembers.Faculty1
import org.example.vidyadaan.Team.model.FacultyMembers.Faculty2
import org.example.vidyadaan.Team.model.FacultyMembers.PRINCIPAL
import org.example.vidyadaan.models.Constants

object Faculty {

    val FacultyTeam : List<TeamDetails> =  listOf(
        PRINCIPAL,
        Faculty1 ,
        Faculty2
    )
}

object FacultyMembers {
    val path = "/TeamMembers/FacultyMembers/"
    val Faculty1= TeamDetails("Dr.V.Mahalakshmi Naidu" ,
        "${path}MahaLakshmiNaidu.jpg" ,
        SocialMediaDetails(
            mail = "20131A04L9@gvpce.ac.in"),
        "Faculty Coordinator"
    )
    val Faculty2= TeamDetails("Dr.C.V.Nageswara Rao" ,
        "${path}Nageswara_Rao.jpg" ,
        SocialMediaDetails(
            mail = "20131A04L9@gvpce.ac.in"),
        "Associate Director-CFSR"
    )
    val PRINCIPAL= TeamDetails("Prof.Dr.A.B.Koteswara Rao" ,
        "${path}abkrao.jpg" ,
        SocialMediaDetails(
            mail = "principal@gvpce.ac.in"),
        "PRINCIPAL"
    )
}
