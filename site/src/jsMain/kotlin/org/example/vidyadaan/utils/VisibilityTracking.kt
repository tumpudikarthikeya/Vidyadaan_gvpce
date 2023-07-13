package org.example.vidyadaan.utils

import androidx.compose.runtime.Composable

@Composable
fun asdf() {

}

/*
import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.CSSMargin
import com.varabyte.kobweb.compose.dom.ElementTarget
import com.varabyte.kobweb.compose.dom.disposableRef
import com.varabyte.kobweb.compose.dom.observers.IntersectionObserver
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.display
import org.jetbrains.compose.web.css.DisplayStyle


@Composable
fun VisibilityTracker(
    target: ElementTarget,
    options: IntersectionObserver.Options? = null,
    callback: (IntersectionObserver.Entry) -> Unit,
) {
    val observer = remember(options) {
        IntersectionObserver(options) { entries -> callback(entries.single()) }
    }
    // Create a dummy element whose purpose is to search for the target element that we want to observe.
    Box(
        Modifier.display(DisplayStyle.None),
        ref = disposableRef(target, observer) { element ->
            val targetElement = element.resolve(target) ?: return@disposableRef onDispose { }
            observer.observe(targetElement)

            onDispose {
                observer.disconnect()
            }
        }
    )
}
// note that [onVisibilityChange] will also be called on the initial render
@Composable
fun VisibilityChangeTracker(
    target: ElementTarget,
    margin: CSSMargin? = null, // or just make this not-nullable and default = margin(0.px)
    onVisibilityChange: (visible: Boolean) -> Unit,
) {
    VisibilityTracker(target, margin?.let { IntersectionObserver.Options(rootMargin = it) }) {
        onVisibilityChange(it.isIntersecting)
    }
}

@Composable
fun VisibilityChangeTrackerStrict(
    target: ElementTarget,
    margin: CSSMargin? = null, // or just make this not-nullable and default = margin(0.px)
    onVisibilityChange: (visible: Boolean) -> Unit,
) {
    var initialLoad by remember { mutableStateOf(false) }
    VisibilityTracker(target, margin?.let { IntersectionObserver.Options(rootMargin = it) }) {
        if (initialLoad)
            onVisibilityChange(it.isIntersecting)
        initialLoad = true
    }
}

// note that [onViewPortEntered] will also be called on the initial render if the element is already in the viewport
@Composable
fun ViewportEnterTracker(
    target: ElementTarget,
    margin: CSSMargin? = null, // or just make this not-nullable and default = margin(0.px)
    onViewportEntered: () -> Unit,
) {
    VisibilityTracker(target, margin?.let { IntersectionObserver.Options(rootMargin = it) }) {
        if (it.isIntersecting) onViewportEntered()
    }
}

@Composable
fun ViewportEnterExitTracker(
    target: ElementTarget,
    margin: CSSMargin? = null, // or just make this not-nullable and default = margin(0.px)
    onViewportExit: () -> Unit = {},
    onViewportEntered: () -> Unit = {},
) {
    var visible: Boolean? by remember { mutableStateOf(null) }
    VisibilityTracker(target, margin?.let { IntersectionObserver.Options(rootMargin = it) }) {
        if (it.isIntersecting && visible == false) onViewportEntered()
        if (!it.isIntersecting && visible == true) onViewportExit()
        visible = it.isIntersecting
    }
}
*/

