package org.example.vidyadaan.models

import org.example.vidyadaan.Events.utils.AllEvents

enum class EventUpdates(val info :String , val year :String , val eventNo: Int) {

    MothersDay(AllEvents.AllEvents[2023]!![0].subtitle,AllEvents.AllEvents[2023]!![0].details.year ,AllEvents.AllEvents[2023]!![0].eventNo ),
    MathsDay(AllEvents.AllEvents[2022]!![0].subtitle,AllEvents.AllEvents[2022]!![0].details.year ,AllEvents.AllEvents[2022]!![0].eventNo)

}