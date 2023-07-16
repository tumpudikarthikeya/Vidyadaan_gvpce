package org.example.vidyadaan.Team.model

import org.example.vidyadaan.Team.model.DocumentationMembers.Coordinator1
import org.example.vidyadaan.Team.model.DocumentationMembers.Coordinator2
import org.example.vidyadaan.Team.model.DocumentationMembers.Lead1
import org.example.vidyadaan.Team.model.DocumentationMembers.Lead2
import org.example.vidyadaan.models.Constants

object Documentation {

    val documentationTeam :Map<Int ,List<TeamDetails>> = mapOf( 2023 to listOf(  Lead1 ,Lead2 ,Coordinator1,Coordinator2 ))
}

object DocumentationMembers {
    val path = "/TeamMembers/Documentation/"

    val Lead1= TeamDetails("K.Akshaya" ,
        "${path}Akshaya.jpg" ,
        SocialMediaDetails(instaId = "${Constants.INSTAURL}/")
        ,"Lead"
    )
    val Lead2= TeamDetails("K.Sriya" ,
        "${path}Sriya.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
        ,"Lead"
    )
    val Coordinator1= TeamDetails("P.Balaji" ,
        "${path}Balaji.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )
    val Coordinator2= TeamDetails("Ch.Lokesh Naidu" ,
        "${path}Lokesh.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )

}