package org.example.vidyadaan.EventDetails.model

enum class EventHeader(val title :String , val path :String) {
    Desc("Description" , "desc"),
    Date("Date and Time" , "date"),
    Venue("Venue","venue"),
    Contact("Contact" , "contact")
}