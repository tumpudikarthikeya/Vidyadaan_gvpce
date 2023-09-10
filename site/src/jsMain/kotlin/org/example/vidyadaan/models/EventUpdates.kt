package org.example.vidyadaan.models

import org.example.vidyadaan.Events.utils.AllEvents

enum class EventUpdates(val info :String , val year :String , val eventNo: Int) {
    CarrerGuidance1(AllEvents.AllEvents[2023]!![0].subtitle,AllEvents.AllEvents[2023]!![0].details.year ,AllEvents.AllEvents[2023]!![0].eventNo ),
    MothersDay(AllEvents.AllEvents[2023]!![1].subtitle,AllEvents.AllEvents[2023]!![1].details.year ,AllEvents.AllEvents[2023]!![1].eventNo ),
    MathsDay(AllEvents.AllEvents[2022]!![0].subtitle,AllEvents.AllEvents[2022]!![0].details.year ,AllEvents.AllEvents[2022]!![0].eventNo)

}