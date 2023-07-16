package org.example.vidyadaan.Team.model

import org.example.vidyadaan.Team.model.EventCoordinatorsMembers.Coordinator1
import org.example.vidyadaan.Team.model.EventCoordinatorsMembers.Coordinator2
import org.example.vidyadaan.Team.model.EventCoordinatorsMembers.Coordinator3
import org.example.vidyadaan.Team.model.EventCoordinatorsMembers.Coordinator4
import org.example.vidyadaan.models.Constants

object EventCoordinators {

    val eventCoordinatorsTeam :Map<Int ,List<TeamDetails>> = mapOf( 2023 to listOf( Coordinator1,
                                                                                    Coordinator2,
                                                                                    Coordinator3,
                                                                                    Coordinator4))
}

object EventCoordinatorsMembers {

    val path = "/TeamMembers/EventCoordinators/"

    val Coordinator1= TeamDetails("D.Yashaswini Kameswari" ,
        "${path}Yashaswini.jpg" ,
        SocialMediaDetails(
            instaId ="${Constants.INSTAURL}/")
    )
    val Coordinator2= TeamDetails("A.Sri Bandhavi" ,
        "${path}Bandhavi.jpg" ,
        SocialMediaDetails(
            instaId ="${Constants.INSTAURL}/")
    )
    val Coordinator3= TeamDetails("MSS Krishna Raju" ,
        "${path}Krishna.jpg" ,
        SocialMediaDetails(
            instaId ="${Constants.INSTAURL}/")
    )
    val Coordinator4= TeamDetails("G.Sai Sree Nithya" ,
        "${path}Nithya.jpg" ,
        SocialMediaDetails(
            instaId ="${Constants.INSTAURL}/")
    )

}