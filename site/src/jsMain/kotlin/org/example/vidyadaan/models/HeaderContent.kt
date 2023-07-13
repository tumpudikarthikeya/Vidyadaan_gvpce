package org.example.vidyadaan.models

enum class HeaderContent(val pagename : String, val path : String ,val subMenu: Int) {

    Home("Home" , "/" ,0),
    Team("Team" , "/team",0),
    Events("Events" , "/events",1),
    Gallery("Gallery" , "/gallery",0),
    ContactUs("Contact Us", "",0)
}