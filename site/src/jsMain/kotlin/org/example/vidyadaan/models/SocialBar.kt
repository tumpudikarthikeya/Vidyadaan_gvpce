package org.example.vidyadaan.models

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.columnGap
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.example.vidyadaan.Styles.SocialLinkIconLink
import org.example.vidyadaan.models.Constants.FB_ID
import org.example.vidyadaan.models.Constants.INSTA_ID
import org.example.vidyadaan.models.Constants.LINKEDIN_ID
import org.example.vidyadaan.models.Constants.TWITTER_ID
import org.jetbrains.compose.web.css.px


@Composable
fun SocialBar() {
    Row (modifier = Modifier
        .columnGap(20.px) ,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        SocialLinks()
    }
}

@Composable
fun SocialLinks() {
    Link(path = INSTA_ID,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB)
    {
        FaInstagram(size = IconSize.XL,
            modifier = SocialLinkIconLink.toModifier())
    }
    Link(path = LINKEDIN_ID,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB)
    {
        FaLinkedin(size = IconSize.XL,
            modifier = SocialLinkIconLink.toModifier())
    }
    Link(path = FB_ID,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB)
    {
        FaFacebook(size = IconSize.XL,
            modifier = SocialLinkIconLink.toModifier())
    }
    Link(path = TWITTER_ID,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB)
    {
        FaTwitter(size = IconSize.XL,
            modifier = SocialLinkIconLink.toModifier())
    }

}