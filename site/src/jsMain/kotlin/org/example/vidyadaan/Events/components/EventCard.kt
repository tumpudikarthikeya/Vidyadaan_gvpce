package org.example.vidyadaan.Events.components

import androidx.compose.runtime.Composable
import com.example.compose.Tertiary
import com.example.compose.White_Color
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.Height
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayIf
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayUntil
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.example.vidyadaan.EventDetails.style.RegButtonStyle
import org.example.vidyadaan.Events.EventDetails
import org.example.vidyadaan.Events.styles.*
import org.example.vidyadaan.Events.utils.EventConstants.Event_Colors
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgba
import org.jetbrains.compose.web.dom.Div

@Composable
fun EventCard(ctx : PageContext, details: EventDetails , year : Int , index :Int) {
    Box(modifier = EventCardStyle.toModifier()
        .backgroundColor(Colors.White)
        .borderRadius(20.px)){
        Row(modifier = Modifier.fillMaxSize().displayIf(Breakpoint.MD).columnGap(20.px)
            , verticalAlignment = Alignment.CenterVertically){
            CardContent(ctx,details,year,index)
        }
        Column(modifier = Modifier.fillMaxSize().displayUntil(Breakpoint.MD).rowGap(20.px)
        , horizontalAlignment = Alignment.CenterHorizontally) {
            CardContent(ctx,details,year,index)
        }
    }
}

@Composable
fun CardContent(ctx : PageContext, details: EventDetails , year : Int , index :Int) {

    val breakpoint = rememberBreakpoint()
    Box(modifier = DateContainerStyle.toModifier()
        .backgroundColor(Event_Colors[index%4])
        .width(if (breakpoint >= Breakpoint.MD) 250.px else 100.percent)
        .borderRadius(10.px)
        , contentAlignment = Alignment.Center) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally) {
            SpanText(details.details.date ,modifier = Modifier.fontSize(FontSize.Large).fontWeight(FontWeight.Bold))
            SpanText(details.details.month, modifier = Modifier.fontSize(FontSize.Large).fontWeight(FontWeight.Bold))
        }
    }
    Column(modifier = EventInfoStyle.toModifier()) {
        SpanText( text = details.title , modifier = Modifier.fontSize(FontSize.Large).fontWeight(FontWeight.Bold))
        SpanText(text = details.subtitle , modifier = Modifier.fontSize(FontSize.Small) )
    }
    Row(modifier = Modifier
    , horizontalArrangement = Arrangement.End ,
        verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = RegButtonStyle
                .toModifier()
                .border(1.px)
                .cursor(Cursor.Pointer)
                .onClick { ctx.router.navigateTo("/EventDetails/$year/$index") }
                .borderRadius(5.px)
                .borderStyle(LineStyle.Solid)
                .borderColor(Colors.Black)
                .padding(topBottom = 10.px , leftRight = 20.px)
            , contentAlignment = Alignment.Center
        ) {
            SpanText("View Details" , modifier = Modifier.fontSize(FontSize.Small))
        }
    }
}