package org.example.vidyadaan.EventDetails.style

import com.varabyte.kobweb.compose.css.AnimationIterationCount
import com.varabyte.kobweb.compose.css.CSSAnimation
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.animation.Keyframes
import com.varabyte.kobweb.silk.components.animation.keyframes
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*


val PosterStyle by ComponentStyle {
    Breakpoint.ZERO {
        Modifier.size(250.px).margin(bottom = 20.px)
    }
    Breakpoint.MD {
        Modifier.size(350.px).margin(bottom = 30.px)
    }
    hover {
        Modifier
            .animation(CSSAnimation(name = "swing",
                duration = 1.s,
                timingFunction = AnimationTimingFunction.EaseInOut,
                direction = AnimationDirection.Normal))
    }

}

@OptIn(ExperimentalComposeWebApi::class)
val swing by Keyframes {
    0.percent {
        Modifier.transform { rotate(0.deg) }
    }
    25.percent {
        Modifier.transform { rotate(10.deg) }
    }
    75.percent {
        Modifier.transform { rotate((-10).deg) }
    }
    100.percent {
        Modifier.transform { rotate(0.deg) }
    }
}

val PosterStyle1 by ComponentStyle {
    Breakpoint.ZERO {
        Modifier.size(350.px).margin(top = 20.vh)
    }
    Breakpoint.MD {
        Modifier.size(525.px).margin(top = 25.vh)
    }
    base {
        Modifier
            .overflow(Overflow.Hidden)
            .animation(CSSAnimation(name = "swing1",
                duration = 20.s,
                delay = 0.s,
                timingFunction = AnimationTimingFunction.EaseInOut,
                iterationCount = AnimationIterationCount.Infinite,
                direction = AnimationDirection.Normal))
    }

}

val PosterStyle2 by ComponentStyle {
    Breakpoint.ZERO {
        Modifier.size(350.px).margin(top = 20.vh)
    }
    Breakpoint.MD {
        Modifier.size(525.px).margin(top = 20.vh)
    }
    base {
        Modifier
            .overflow(Overflow.Hidden)
            .animation(CSSAnimation(name = "swing1",
                duration = 20.s,
                delay = 0.s,
                timingFunction = AnimationTimingFunction.EaseInOut,
                iterationCount = AnimationIterationCount.Infinite,
                direction = AnimationDirection.Normal))
    }

}

@OptIn(ExperimentalComposeWebApi::class)
val swing1 by Keyframes {
    0.percent {
        Modifier.transform { rotate(0.deg) }
    }
    100.percent {
        Modifier.transform { rotate(360.deg) }
    }
}



val titlestyle by ComponentStyle {
    Breakpoint.ZERO {
        Modifier
            .fontSize(FontSize.XLarge)
    }
    Breakpoint.MD {
        Modifier
            .fontSize(FontSize.XXLarge)
    }
}

val ticket1style by ComponentStyle {
        Breakpoint.ZERO {
            Modifier.width(350.px)
        }
        Breakpoint.MD {
            Modifier.width(525.px)
        }
}

val ticket1Underlinestyle by ComponentStyle {
    Breakpoint.ZERO {
        Modifier.width(250.px)
    }
    Breakpoint.MD {
        Modifier.width(425.px)
    }
}