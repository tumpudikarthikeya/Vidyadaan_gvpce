package org.example.vidyadaan.Events.models

import org.example.vidyadaan.Events.EventDetails
import org.example.vidyadaan.Events.utils.careerGuidance1
import org.example.vidyadaan.Events.utils.mothersday

val mothers_day = EventDetails( title = "Expression of Love",
    subtitle = mothersday.mothersday_subtitle,
    description = mothersday.mothersday_desc,
    intro = mothersday.mothersday_intro,
    details = mothersday.mothersday_basicdetails,
    poster = mothersday.mothersday_poster,
    link = mothersday.mothersday_link,
    results = listOf( mothersday.mothersday_results))

val Career_Guidance = EventDetails( title = "Career Guidance",
    subtitle = careerGuidance1.cg1_subtitle,
    description = careerGuidance1.cg1_desc,
    intro = careerGuidance1.cg1_intro,
    details = careerGuidance1.cg1_basicdetails,
    poster = careerGuidance1.cg1_poster,
    //link = mothersday.mothersday_link,
    )