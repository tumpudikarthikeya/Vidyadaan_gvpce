package org.example.vidyadaan.Events

data class BasicDetails(val date : String,
                        val month : String,
                        val year : String,
                        val time : String? = "",
                        val venue : String? = "",
                        val platform : String?)
