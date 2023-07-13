@file:OptIn(ExperimentalComposeWebApi::class)

package org.example.vidyadaan.Team.styles

import com.varabyte.kobweb.compose.css.AnimationIterationCount
import com.varabyte.kobweb.compose.css.CSSAnimation
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.animation.Keyframes
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*


@OptIn(ExperimentalComposeWebApi::class)
val spin by Keyframes {
    10.percent {
        Modifier.transform { rotate(0.deg) }
    }
    50.percent {
        Modifier.transform { rotate(180.deg) }
    }
    100.percent {
        Modifier.transform { rotate(360.deg) }
    }
}


@OptIn(ExperimentalComposeWebApi::class)
val TeamCardStyle by ComponentStyle {
    cssRule(">  #columAlign > #container > #cover") {
        Modifier
            .visibility(Visibility.Hidden)
    }
    cssRule(":hover >  #columAlign > #container > #cover") {
        Modifier
            .visibility(Visibility.Visible)
    }
    cssRule(":hover >  #columAlign > #container > #pic") {
        Modifier
            .transition(CSSTransition("transform", duration = 1.s))
            .transform { scale(1.2) }
    }


    cssRule(">  #columAlign > #container > #linksContainer > #linkedIn") {
        Modifier
            .visibility(Visibility.Hidden)
    }
    cssRule(":hover >  #columAlign > #container > #linksContainer > #linkedIn") {
        Modifier
            .visibility(Visibility.Visible)
            .animation(CSSAnimation("spin" , duration = 1.s))    }
    cssRule(">  #columAlign > #container > #linksContainer > #gitHub") {
        Modifier
            .visibility(Visibility.Hidden)
    }
    cssRule(":hover >  #columAlign > #container > #linksContainer > #gitHub") {
        Modifier
            .visibility(Visibility.Visible)
            .animation(CSSAnimation("spin" , duration = 1.s))
    }
    cssRule(">  #columAlign > #container > #linksContainer > #mail") {
        Modifier
            .visibility(Visibility.Hidden)
    }
    cssRule(":hover >  #columAlign > #container > #linksContainer > #mail") {
        Modifier
            .visibility(Visibility.Visible)
            .animation(CSSAnimation("spin" , duration = 1.s))
    }
    cssRule(">  #columAlign > #container > #linksContainer > #insta") {
        Modifier
            .visibility(Visibility.Hidden)
    }
    cssRule(":hover >  #columAlign > #container > #linksContainer > #insta") {
        Modifier
            .visibility(Visibility.Visible)
            .animation(CSSAnimation("spin" , duration = 1.s))
    }
    cssRule(">  #columAlign > #container > #linksContainer > #twitter") {
        Modifier
            .visibility(Visibility.Hidden)
    }
    cssRule(":hover >  #columAlign > #container > #linksContainer > #twitter") {
        Modifier
            .visibility(Visibility.Visible)
            .animation(CSSAnimation("spin" , duration = 1.s ))
    }
}

val socialLinksStyle by ComponentStyle {
    base {
        Modifier
            .padding(10.px)
            .border(2.px)
            .borderColor(Colors.White)
            .borderStyle(LineStyle.Solid)
    }

    hover{
            Modifier
                .borderColor(rgb(50, 10, 114))
                .backgroundColor(rgb(50, 10, 114))
                .borderRadius(topRight = 5.px , bottomLeft = 5.px)

        }
}

val socialMediaIcon by ComponentStyle {
    base{
        Modifier
            .color(Colors.White)

    }
}



