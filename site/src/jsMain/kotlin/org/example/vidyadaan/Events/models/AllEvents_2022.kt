package org.example.vidyadaan.Events.models

import org.example.vidyadaan.Events.EventDetails
import org.example.vidyadaan.Events.utils.ClimateChange.ccSubtitle
import org.example.vidyadaan.Events.utils.ClimateChange.ccdesc
import org.example.vidyadaan.Events.utils.ClimateChange.ccdetails
import org.example.vidyadaan.Events.utils.ClimateChange.ccposter
import org.example.vidyadaan.Events.utils.General.aamu_desc
import org.example.vidyadaan.Events.utils.General.aamu_details
import org.example.vidyadaan.Events.utils.General.aamu_poster
import org.example.vidyadaan.Events.utils.General.aamu_subtitle
import org.example.vidyadaan.Events.utils.General.ap_desc
import org.example.vidyadaan.Events.utils.General.ap_details
import org.example.vidyadaan.Events.utils.General.ap_poster
import org.example.vidyadaan.Events.utils.General.ap_subtitle
import org.example.vidyadaan.Events.utils.General.bdc_desc
import org.example.vidyadaan.Events.utils.General.bdc_details
import org.example.vidyadaan.Events.utils.General.bdc_poster
import org.example.vidyadaan.Events.utils.General.bdc_subtitle
import org.example.vidyadaan.Events.utils.General.esy_desc
import org.example.vidyadaan.Events.utils.General.esy_details
import org.example.vidyadaan.Events.utils.General.esy_poster
import org.example.vidyadaan.Events.utils.General.esy_results
import org.example.vidyadaan.Events.utils.General.esy_subtitle
import org.example.vidyadaan.Events.utils.General.fme_desc
import org.example.vidyadaan.Events.utils.General.fme_details
import org.example.vidyadaan.Events.utils.General.fme_poster
import org.example.vidyadaan.Events.utils.General.fme_results
import org.example.vidyadaan.Events.utils.General.fme_subtitle
import org.example.vidyadaan.Events.utils.General.pmc_desc
import org.example.vidyadaan.Events.utils.General.pmc_details
import org.example.vidyadaan.Events.utils.General.pmc_poster
import org.example.vidyadaan.Events.utils.General.pmc_samples
import org.example.vidyadaan.Events.utils.General.pmc_subtitle
import org.example.vidyadaan.Events.utils.General.sb_desc
import org.example.vidyadaan.Events.utils.General.sb_details
import org.example.vidyadaan.Events.utils.General.sb_poster
import org.example.vidyadaan.Events.utils.General.sb_subtitle
import org.example.vidyadaan.Events.utils.General.sl_desc
import org.example.vidyadaan.Events.utils.General.sl_details
import org.example.vidyadaan.Events.utils.General.sl_poster
import org.example.vidyadaan.Events.utils.General.sl_subtitle
import org.example.vidyadaan.Events.utils.General.td_desc
import org.example.vidyadaan.Events.utils.General.td_details
import org.example.vidyadaan.Events.utils.General.td_poster
import org.example.vidyadaan.Events.utils.General.td_subtitle
import org.example.vidyadaan.Events.utils.StressManagementEvent.smeEventBasicDetails
import org.example.vidyadaan.Events.utils.StressManagementEvent.smeEventDescription
import org.example.vidyadaan.Events.utils.StressManagementEvent.smeEventIntro
import org.example.vidyadaan.Events.utils.StressManagementEvent.smeEventLink
import org.example.vidyadaan.Events.utils.StressManagementEvent.smeEventPoster
import org.example.vidyadaan.Events.utils.StressManagementEvent.smeEventSubtitle
import org.example.vidyadaan.Events.utils.StressManagementEvent.sme_winners
import org.example.vidyadaan.Events.utils.mathsday.mathsday_basicdetails
import org.example.vidyadaan.Events.utils.mathsday.mathsday_desc
import org.example.vidyadaan.Events.utils.mathsday.mathsday_intro
import org.example.vidyadaan.Events.utils.mathsday.mathsday_link
import org.example.vidyadaan.Events.utils.mathsday.mathsday_poster
import org.example.vidyadaan.Events.utils.mathsday.mathsday_result1
import org.example.vidyadaan.Events.utils.mathsday.mathsday_result2
import org.example.vidyadaan.Events.utils.mathsday.mathsday_subtitle
import org.example.vidyadaan.Events.utils.mothersday

val mathday = EventDetails( title = "Gamers of Math",
    subtitle = mathsday_subtitle,
    description = mathsday_desc,
    intro = mathsday_intro,
    details = mathsday_basicdetails,
    poster = mathsday_poster,
    link = mathsday_link,
    results = listOf(mathsday_result1 , mathsday_result2)
)
val stress_management =EventDetails( title = "Panel discussion on  Stress Management for School students",
    subtitle = smeEventSubtitle,
    description = smeEventDescription,
    intro = smeEventIntro,
    details = smeEventBasicDetails,
    poster = smeEventPoster,
    winners = sme_winners,
    link = smeEventLink
)

val Climate_Change = EventDetails( title = "Workshop on Climate change",
    subtitle =ccSubtitle ,
    description = ccdesc,
    details = ccdetails,
    poster = ccposter,)

val Teachers_day = EventDetails( title = "Teachers day Celebrations at government school",
    subtitle =td_subtitle ,
    description =td_desc ,
    details = td_details,
    poster = td_poster,)

val Independence_day =EventDetails( title = "Azadi Ka Amrith Mahotsav Rally",
    subtitle = aamu_subtitle,
    description =aamu_desc ,
    details = aamu_details,
    poster = aamu_poster)

val Blood_donation =EventDetails( title = "Blood Donation Camp",
    subtitle = bdc_subtitle,
    description = bdc_desc,
    details = bdc_details,
    poster = bdc_poster,)

val  poster_making = EventDetails( title = "POSTER MAKING CONTEST",
    subtitle = pmc_subtitle,
    description = pmc_desc,
    details = pmc_details,
    results = listOf( pmc_samples),
    poster = pmc_poster,)

val Find_me_an_echo = EventDetails( title = "Find Me An Echo",
    subtitle = fme_subtitle,
    description = fme_desc,
    details = fme_details,
    winners = fme_results,
    poster = fme_poster,)

val Energy_swaraj_yatra = EventDetails( title = "Energy Swaraj Yatra",
    subtitle = esy_subtitle,
    description = esy_desc,
    details = esy_details,
    results = listOf(esy_results),
    poster = esy_poster,)

val Sikshith_Bharat = EventDetails( title = "Sikshith Bharat",
    subtitle = sb_subtitle,
    description = sb_desc,
    details = sb_details,
    poster = sb_poster,)
val Agnipath_Scheme = EventDetails( title = "Agnipath Scheme",
    subtitle = ap_subtitle,
    description = ap_desc,
    details = ap_details,
    poster = ap_poster,)

val Sign_Language = EventDetails( title = "Awareness on sign languages",
    subtitle = sl_subtitle,
    description = sl_desc,
    details = sl_details,
    poster = sl_poster,)