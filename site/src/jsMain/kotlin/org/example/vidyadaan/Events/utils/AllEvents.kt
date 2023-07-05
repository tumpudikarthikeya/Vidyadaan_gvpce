package org.example.vidyadaan.Events.utils

import org.example.vidyadaan.Events.BasicDetails
import org.example.vidyadaan.Events.EventDetails

object AllEvents {
    val AllEvents :Map<Int,List<EventDetails>> = mapOf(
        2023 to listOf(
                    EventDetails( title = "Expression of Love",
                    subtitle = "Share your mother’s day message",
                    description = mothersday.mothersday_desc,
                    intro = mothersday.mothersday_intro,
                    details = mothersday.mothersday_basicdetails,
                    poster = mothersday.mothersday_poster,
                    link = mothersday.mothersday_link,
                    results = mothersday.mothersday_results),

                    EventDetails( title = "Expression of Love",
                        subtitle = "Share your mother’s day message",
                        description = mothersday.mothersday_desc,
                        intro = mothersday.mothersday_intro,
                        details = mothersday.mothersday_basicdetails,
                        poster = mothersday.mothersday_poster,
                        link = mothersday.mothersday_link,
                        results = mothersday.mothersday_results)
            ),
        2022 to listOf(
            EventDetails( title = "Gamers of Math",
                subtitle = "A series of events on the eve of math day" ,
                description ="" ,
                intro ="" ,
                details = BasicDetails("","","","","","") ,
                poster = "",
                link =""
                    )
            )
    )
 }