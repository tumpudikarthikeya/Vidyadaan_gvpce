package org.example.vidyadaan.Events

data class EventDetails(val title : String = "",
                        val subtitle : String = "",
                        val description : String = "",
                        val intro : String = "",
                        val details : BasicDetails ,
                        val poster : String = "",
                        val link : String="",
                        val results : String = "")
