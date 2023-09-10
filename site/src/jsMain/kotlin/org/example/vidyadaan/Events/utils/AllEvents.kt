package org.example.vidyadaan.Events.utils

import org.example.vidyadaan.Events.EventDetails
import org.example.vidyadaan.Events.models.*

object AllEvents {
    val AllEvents :Map<Int,List<EventDetails>> = mapOf(
        2023 to listOf( Career_Guidance,mothers_day,),
        2022 to listOf( mathday ,
                        stress_management ,
                        Climate_Change ,
                        Teachers_day,
                        Independence_day,
                        Blood_donation,
                        poster_making,
                        Find_me_an_echo,
                        Energy_swaraj_yatra,
                        Sikshith_Bharat,
                        Agnipath_Scheme,
                        Sign_Language) ,
        2021 to listOf(Fund_Raising_Event1,
                        Untie_Riddles,
                        Vocubulary_with_Vidhyadhan,
                        Vignaan_Through_Vidyadaan,
                        Vignanic_Sammelan,
                        National_Technology_Day)
    )
 }