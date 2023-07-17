package org.example.vidyadaan.Team.model

import org.example.vidyadaan.Team.model.DesigningMembers.Coordinator1
import org.example.vidyadaan.Team.model.DesigningMembers.Coordinator2
import org.example.vidyadaan.Team.model.DesigningMembers.Lead1
import org.example.vidyadaan.models.Constants

object Designing {

    val designingTeam :Map<Int ,List<TeamDetails>> = mapOf( 2023 to listOf( Lead1 , Coordinator1 , Coordinator2 ))
}

object DesigningMembers {
val path = "/TeamMembers/Designing/"

    val Lead1= TeamDetails("S.Charan" ,
        "${path}Charan.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/bhanu._.karthikeya/")
    )
    val Coordinator1= TeamDetails("P.Nikhila Krishna Priya" ,
        "${path}NikhilaPriya.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )
    val Coordinator2 = TeamDetails("B.Snehitha Sai" ,
        "${path}SnehithaSai.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )

}
