package org.example.vidyadaan.Team.model

import org.example.vidyadaan.Team.model.CoreTeamMembers.President
import org.example.vidyadaan.Team.model.CoreTeamMembers.Secretary
import org.example.vidyadaan.Team.model.CoreTeamMembers.Treasurer
import org.example.vidyadaan.models.Constants

object CoreTeam {

    val coreTeam :Map<Int ,List<TeamDetails>> = mapOf( 2023 to listOf( President , Secretary , Treasurer ))
}

object CoreTeamMembers {
    val path = "/TeamMembers/CoreTeam/"

    val President= TeamDetails("K.Sai Nirmal" ,
        "" ,
        SocialMediaDetails("${Constants.LINKEDINURL}sai-nirmal-8b7127224/",
            //"${Constants.GITHUBURL}tumpudikarthikeya",
            mail = "sainirmalkothuri@gmail.com",
            instaId = "${Constants.INSTAURL}dead_deal013/")
    )
    val Secretary= TeamDetails("M.Tanusree" ,
        "${path}Tanusree.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}tanusree_5/")
    )
    val Treasurer= TeamDetails("P.Tharun Venkat" ,
        "${path}Tarun.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}im____tarun/")
    )
}