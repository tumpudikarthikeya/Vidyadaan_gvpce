package org.example.vidyadaan.Team.styles

import com.varabyte.kobweb.compose.css.AnimationIterationCount
import com.varabyte.kobweb.compose.css.CSSAnimation
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.animation
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.silk.components.animation.Keyframes
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import org.jetbrains.compose.web.css.AnimationFillMode
import org.jetbrains.compose.web.css.AnimationTimingFunction
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.s

val FadeInAnimation by Keyframes {
    0.percent {
        Modifier.opacity(0)
    }
    100.percent {
        Modifier.opacity(1)
    }
}

val FadeIn by ComponentStyle {
    Modifier
        .animation(CSSAnimation(name = "FadeInAnimation"
            , timingFunction = AnimationTimingFunction.Ease
            , iterationCount = AnimationIterationCount.of(1)
            , duration = 3.s
            , fillMode = AnimationFillMode.Forwards
            ))
}