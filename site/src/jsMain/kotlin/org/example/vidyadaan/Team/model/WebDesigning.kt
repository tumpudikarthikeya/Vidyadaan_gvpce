package org.example.vidyadaan.Team.model

import org.example.vidyadaan.Team.model.WebTeamMembers.Karthikeya
import org.example.vidyadaan.Team.model.WebTeamMembers.Ramya
import org.example.vidyadaan.models.Constants.GITHUBURL
import org.example.vidyadaan.models.Constants.INSTAURL
import org.example.vidyadaan.models.Constants.LINKEDINURL

object WebDesigning {

    val webDesigningTeam :Map<Int ,List<TeamDetails>> = mapOf( 2023 to listOf( Karthikeya , Ramya))
}

object WebTeamMembers {

    val path = "/TeamMembers/WebDesigning/"
    val Karthikeya = TeamDetails("Karthikeya" ,
        "${path}karthikeya_cse.jpg" ,
        SocialMediaDetails("${LINKEDINURL}b-v-n-s-s-karthikeya-tumpudi-58b013249/",
            "${GITHUBURL}tumpudikarthikeya",
            "tumpudibhanu@gmail.com",
            "${INSTAURL}bhanu._.karthikeya/")
    )
    val Ramya = TeamDetails("Ramya" ,
        "${path}Ramya.jpg" ,
        SocialMediaDetails(
            instaId = "${INSTAURL}/")
    )

}