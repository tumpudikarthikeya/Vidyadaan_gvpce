package org.example.vidyadaan.Team.model

import org.example.vidyadaan.Team.model.EventOrganizersMembers.Coordinator1
import org.example.vidyadaan.Team.model.EventOrganizersMembers.Coordinator2
import org.example.vidyadaan.Team.model.EventOrganizersMembers.Coordinator3
import org.example.vidyadaan.Team.model.EventOrganizersMembers.Coordinator4
import org.example.vidyadaan.Team.model.EventOrganizersMembers.Coordinator5
import org.example.vidyadaan.Team.model.EventOrganizersMembers.Coordinator6
import org.example.vidyadaan.Team.model.EventOrganizersMembers.Lead1
import org.example.vidyadaan.Team.model.EventOrganizersMembers.Lead2
import org.example.vidyadaan.Team.model.EventOrganizersMembers.Lead3
import org.example.vidyadaan.models.Constants
import org.example.vidyadaan.models.Constants.GITHUBURL
import org.example.vidyadaan.models.Constants.INSTAURL
import org.example.vidyadaan.models.Constants.LINKEDINURL

object EventOrganizers {

    val eventOrganizersTeam :Map<Int ,List<TeamDetails>> = mapOf( 2023 to listOf( Lead1,
                                                                                  Lead2 ,
                                                                                    Lead3,
                                                                                    Coordinator1,
                                                                                    Coordinator2,
                                                                                    Coordinator3,
                                                                                    Coordinator4,
                                                                                    Coordinator5,
                                                                                    Coordinator6))
}

object EventOrganizersMembers {
    val path = "/TeamMembers/Organizing/"

    val Lead1= TeamDetails("K.Namratha Sri Chand" ,
        "${path}Namratha.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )
    val Lead2= TeamDetails("K.Vipin" ,
        "${path}Vipin.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )
    val Lead3= TeamDetails("P.Yogeshwar Rao" ,
        "${path}" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )
    val Coordinator1 =TeamDetails("Ch.Sai Jaswanth" ,
        "${path}Jaswanth.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}sai_jaswanth_ch/")
    )
    val Coordinator2 =TeamDetails("Mohan Swaraj" ,
        "${path}Swaraj.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}mohan_swaraj_/")
    )
    val Coordinator3 =TeamDetails("M. Purna Bavani" ,
        "${path}PurnaBavani.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )
    val Coordinator4 =TeamDetails("P.Venkata Satya Bala" ,
        "${path}VenkataSatyaBala.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )
    val Coordinator5 =TeamDetails("Sivadanam Yashaswini" ,
        "${path}Yashaswini.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )
    val Coordinator6 =TeamDetails("J.Shai Yashwanth" ,
        "${path}SaiYashwanth.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )

}