package org.example.vidyadaan.Team.model

import org.example.vidyadaan.Team.model.PublicRelationsMembers.Coordinator2
import org.example.vidyadaan.Team.model.PublicRelationsMembers.Lead2
import org.example.vidyadaan.models.Constants

object PublicRelations {

    val publicRelationsTeam :Map<Int ,List<TeamDetails>> = mapOf( 2023 to listOf( Lead2 ,
        Coordinator2 ))
}

object PublicRelationsMembers {
    val path = "/TeamMembers/PublicRelations/"

    val Lead1= TeamDetails("B.Mary Jones" ,
        "${path}" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )
    val Lead2= TeamDetails("P.Kusuma" ,
        "${path}Kusuma.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )
    val Coordinator1= TeamDetails("Kesava Reddy" ,
        "${path}" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )
    val Coordinator2= TeamDetails("Hari Haran" ,
        "${path}HariHaran.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )
    val Coordinator3= TeamDetails("V. Sri Krishna Vamsi" ,
        "${path}" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )

}