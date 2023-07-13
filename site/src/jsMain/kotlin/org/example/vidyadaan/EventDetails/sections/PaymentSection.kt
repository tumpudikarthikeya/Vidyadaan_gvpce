package org.example.vidyadaan.EventDetails.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayIf
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayUntil
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.vidyadaan.EventDetails.style.EventBasicDetails1Container
import org.example.vidyadaan.EventDetails.style.headingValue
import org.example.vidyadaan.EventDetails.style.qrstyle
import org.example.vidyadaan.EventDetails.style.ticket1style
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.A

@Composable
fun PaymentSection(upiId : String, qr: String, paynumber: Long) {
    Box(modifier = EventBasicDetails1Container.toModifier().fillMaxWidth() , contentAlignment = Alignment.Center){
        PaymentBackground(upiId,qr,paynumber)
    }
}

@Composable
fun PaymentBackground(upiId: String, qr: String, paynumber: Long) {
    Row(modifier = Modifier.fillMaxSize().displayUntil(Breakpoint.MD) , verticalAlignment = Alignment.CenterVertically
        , horizontalArrangement = Arrangement.SpaceBetween) {
        Image(src = "/decor1.svg" , modifier = Modifier.size(100.px))
        Image(src = "/decor1.svg", modifier = Modifier.size(100.px))
    }
    Box {
        Box(modifier = Modifier.fillMaxSize().displayIf(Breakpoint.MD) , contentAlignment = Alignment.TopStart) {
            Image(src = "/chakra.svg", modifier = Modifier.size(100.px).margin(left = (-50).px , top = (-50).px))
        }
        Box(modifier = Modifier.fillMaxSize().displayIf(Breakpoint.MD) , contentAlignment = Alignment.BottomEnd) {
            Image(src = "/chakra.svg", modifier = Modifier.size(100.px).margin(right = (-50).px , bottom = (-50).px))
        }

        Image(src = "/ticket3.svg", modifier = ticket1style.toModifier())
        PaymentContent(upiId,qr,paynumber)
    }
}

@Composable
fun PaymentContent(upiId : String, qr: String, paynumber: Long) {
    Box(Modifier.fillMaxSize() , contentAlignment = Alignment.Center) {
        Row(verticalAlignment = Alignment.CenterVertically
        , horizontalArrangement = Arrangement.SpaceAround) {
            Image(src = "/$qr" , modifier = qrstyle.toModifier())
            Column(modifier = Modifier.fillMaxSize() , horizontalAlignment = Alignment.CenterHorizontally) {
                SpanText("Pay to : $paynumber" , modifier = headingValue.toModifier())
                SpanText("or", modifier = headingValue.toModifier())
                SpanText("Pay with \n QR Code" , modifier = headingValue.toModifier())
                /*A(href = "upi://pay?pa=${upiId}&amp;cu=INR"){
                Row(modifier = Modifier.fillMaxSize().columnGap(20.px) ,
                    verticalAlignment = Alignment.CenterVertically
                , horizontalArrangement = Arrangement.Center) {

                        Image(src = "/phonepe-logo-icon.svg" , modifier = Modifier.size(30.px))
                        Image(src = "/google-pay-logo.svg", modifier = Modifier.size(30.px))
                    }
                } */
            }
        }

    }
}