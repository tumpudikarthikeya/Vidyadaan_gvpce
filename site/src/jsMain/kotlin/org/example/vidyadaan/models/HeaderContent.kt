package org.example.vidyadaan.models

enum class HeaderContent(val pagename : String, val path : String ,val subMenu: Int) {

    Home("Home" , "/" ,0),
    Team("Team" , "/team",0),
    Events("Events" , "/events",1),
    CareerGuidance("Career Guidance" , "/careerGuidance",0),
    ContactUs("Contact Us", "/contact_us",0)
}