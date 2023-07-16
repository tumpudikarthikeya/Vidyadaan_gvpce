package org.example.vidyadaan

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.init.registerBaseStyle
import org.jetbrains.compose.web.css.vh

private val TEXT_FONT = Modifier.fontFamily("poppins")
@InitSilk
fun updateTheme(ctx: InitSilkContext) {
    // Configure silk here

    ctx.apply {
        stylesheet.apply {
            registerBaseStyle("body") { TEXT_FONT }
        }
       /* theme.palettes.apply {
            light.apply {
                color = Colors.Black
                background = Colors.White
            }
            light.apply {
                color = Colors.White
                background = Color.rgb(19, 43, 65)
            }
        }*/
    }

}

@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    SilkApp {
        Surface(SmoothColorStyle.toModifier().minHeight(100.vh)) {
            content()
        }
    }
}
