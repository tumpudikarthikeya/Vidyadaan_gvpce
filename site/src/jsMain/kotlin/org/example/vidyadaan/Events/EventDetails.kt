package org.example.vidyadaan.Events

import org.example.vidyadaan.Events.utils.PaymentDetails

data class EventDetails(val title : String = "",
                        val subtitle : String = "",
                        val description : String = "",
                        val intro : String = "",
                        val eventNo : Int = 0,
                        val type : String  = "Event" ,
                        val details : BasicDetails ,
                        val poster : String = "",
                        val link : String="",
                        val winners :String = "",
                        val results : List<String> = listOf() ,
                        val Contact :List<ContackDetails> = listOf() ,
                        val upiId : String = "8340938286@ybl",
                        val qr : String = "" ,
                        val paynumber : Long = 9440138286
)
