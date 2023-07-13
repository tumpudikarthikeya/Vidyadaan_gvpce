package org.example.vidyadaan.Team.model

import org.example.vidyadaan.Team.model.BranchCoordinatorsMembers.CSE
import org.example.vidyadaan.Team.model.BranchCoordinatorsMembers.ECE
import org.example.vidyadaan.Team.model.BranchCoordinatorsMembers.Mech
import org.example.vidyadaan.models.Constants

object BranchCoordinators {

    val branchCoordinatorsTeam :Map<Int ,List<TeamDetails>> = mapOf( 2023 to listOf( Mech, ECE ,CSE ))
}

object BranchCoordinatorsMembers {

val path = "/TeamMembers/BranchCoordinators/"
    val Mech= TeamDetails("Sayyed Imran" ,
        "${path}Imran.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )
    val ECE= TeamDetails("D.Sowjanya" ,
        "${path}Sowjanya.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )
    val IT= TeamDetails("Sandeep Reddy" ,
        "${path}" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )
    val CSE= TeamDetails("G.Venkata Madhuri" ,
        "${path}Madhuri.jpg" ,
        SocialMediaDetails(
            instaId = "${Constants.INSTAURL}/")
    )

}