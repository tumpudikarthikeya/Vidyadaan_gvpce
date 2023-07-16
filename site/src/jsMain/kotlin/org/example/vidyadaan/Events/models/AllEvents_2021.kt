package org.example.vidyadaan.Events.models

import org.example.vidyadaan.Events.EventDetails
import org.example.vidyadaan.Events.utils.AllEvents2021.fre1_desc
import org.example.vidyadaan.Events.utils.AllEvents2021.fre1_details
import org.example.vidyadaan.Events.utils.AllEvents2021.fre1_poster
import org.example.vidyadaan.Events.utils.AllEvents2021.fre1_subtitle
import org.example.vidyadaan.Events.utils.AllEvents2021.nte_desc
import org.example.vidyadaan.Events.utils.AllEvents2021.nte_details
import org.example.vidyadaan.Events.utils.AllEvents2021.nte_poster
import org.example.vidyadaan.Events.utils.AllEvents2021.nte_subtitle
import org.example.vidyadaan.Events.utils.AllEvents2021.ur_desc
import org.example.vidyadaan.Events.utils.AllEvents2021.ur_details
import org.example.vidyadaan.Events.utils.AllEvents2021.ur_poster
import org.example.vidyadaan.Events.utils.AllEvents2021.ur_results
import org.example.vidyadaan.Events.utils.AllEvents2021.ur_subtitle
import org.example.vidyadaan.Events.utils.AllEvents2021.vs_desc
import org.example.vidyadaan.Events.utils.AllEvents2021.vs_details
import org.example.vidyadaan.Events.utils.AllEvents2021.vs_poster
import org.example.vidyadaan.Events.utils.AllEvents2021.vs_subtitle
import org.example.vidyadaan.Events.utils.AllEvents2021.vtv_desc
import org.example.vidyadaan.Events.utils.AllEvents2021.vtv_details
import org.example.vidyadaan.Events.utils.AllEvents2021.vtv_poster
import org.example.vidyadaan.Events.utils.AllEvents2021.vtv_results
import org.example.vidyadaan.Events.utils.AllEvents2021.vtv_subtitle
import org.example.vidyadaan.Events.utils.AllEvents2021.vwv_desc
import org.example.vidyadaan.Events.utils.AllEvents2021.vwv_details
import org.example.vidyadaan.Events.utils.AllEvents2021.vwv_poster
import org.example.vidyadaan.Events.utils.AllEvents2021.vwv_subtitle


val Fund_Raising_Event1 = EventDetails( title = "Communal Harmony Campaign Week",
    subtitle = fre1_subtitle ,
    description = fre1_desc ,
    details = fre1_details,
    poster = fre1_poster,)

val Untie_Riddles = EventDetails( title = "Untie The Riddles",
    results = listOf(ur_results),
    subtitle = ur_subtitle ,
    description = ur_desc ,
    details = ur_details,
    poster = ur_poster,)

val Vocubulary_with_Vidhyadhan = EventDetails( title = "Vocubulary with Vidhyadhan",
    subtitle = vwv_subtitle ,
    description = vwv_desc ,
    details = vwv_details,
    poster = vwv_poster,)

val Vignaan_Through_Vidyadaan = EventDetails( title = "Vignaan Through Vidyadaan",
    results = listOf(vtv_results),
    subtitle = vtv_subtitle ,
    description = vtv_desc ,
    details = vtv_details,
    poster = vtv_poster,)

val Vignanic_Sammelan = EventDetails( title = "Vignanic Sammelan",
    subtitle = vs_subtitle ,
    description = vs_desc ,
    details = vs_details,
    poster = vs_poster,)

val National_Technology_Day  = EventDetails( title = "National Technology Day",
    subtitle = nte_subtitle ,
    description = nte_desc ,
    details = nte_details,
    poster = nte_poster,)