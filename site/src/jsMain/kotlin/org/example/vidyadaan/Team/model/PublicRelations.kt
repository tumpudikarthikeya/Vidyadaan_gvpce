package org.example.vidyadaan.Team.model

import org.example.vidyadaan.Team.model.PublicRelationsMembers.Coordinator1
import org.example.vidyadaan.Team.model.PublicRelationsMembers.Coordinator2
import org.example.vidyadaan.Team.model.PublicRelationsMembers.Coordinator3
import org.example.vidyadaan.Team.model.PublicRelationsMembers.Lead1
import org.example.vidyadaan.Team.model.PublicRelationsMembers.Lead2
import org.example.vidyadaan.models.Constants

object PublicRelations {

    val publicRelationsTeam :Map<Int ,List<TeamDetails>> = mapOf( 2023 to listOf( Lead1, Lead2 ,Coordinator1,
        Coordinator2 , Coordinator3 ))
}

object PublicRelationsMembers {
    val path = "/TeamMembers/PublicRelations/"

    val Lead1= TeamDetails("B.Mary Jones" ,
        "${path}MaryJones.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
        ,"Lead"
    )
    val Lead2= TeamDetails("P.Kusuma" ,
        "${path}Kusuma.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
        ,"Lead"
    )
    val Coordinator1= TeamDetails("Kesava Reddy" ,
        "${path}Kesava.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )
    val Coordinator2= TeamDetails("Hari Haran" ,
        "${path}HariHaran.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )
    val Coordinator3= TeamDetails("V.Sri Krishna Vamsi" ,
        "${path}Vamsi.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )

}