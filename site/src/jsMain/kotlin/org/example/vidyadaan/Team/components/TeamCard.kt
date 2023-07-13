package org.example.vidyadaan.Team.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.vidyadaan.Team.model.TeamDetails
import org.example.vidyadaan.Team.styles.TeamCardStyle
import org.example.vidyadaan.Team.styles.socialLinksStyle
import org.example.vidyadaan.Team.styles.socialMediaIcon
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb
import org.jetbrains.compose.web.css.rgba
import org.jetbrains.compose.web.dom.A

@Composable
fun TeamCard(details: TeamDetails) {
    Box(modifier = TeamCardStyle.toModifier().backgroundColor(rgb(72, 22, 148)).margin(20.px).id("mainbox") , contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally
        , modifier = Modifier.id("columAlign"))  {
            Box(contentAlignment = Alignment.Center , modifier = Modifier.height(320.px).id("container").overflow(Overflow.Hidden)) {
                SocialIcons(details)
                Box(modifier = Modifier.fillMaxSize() , contentAlignment = Alignment.Center) {
                    Image(
                        src = details.photo,
                        modifier = Modifier.fillMaxSize().id("pic").objectFit(ObjectFit.Cover)
                    )
                }
                Box(modifier = Modifier
                    .fillMaxSize()
                    .backgroundColor(rgba(0,0,0,0.5f))
                    .id("cover")
                    .zIndex(1)) {

                }

            }
            SpanText(text = details.name ,
                modifier = Modifier
                    .padding(topBottom = 20.px)
                    .fontFamily("poppins")
                    .fontSize(FontSize.Medium)
                    .fontWeight(FontWeight.SemiBold)
                    .color(Colors.White))
        }
    }
}


@Composable
fun SocialIcons(details: TeamDetails) {
    Row(modifier = Modifier.columnGap(20.px).zIndex(2).id("linksContainer")) {

        if (details.socialMedia.LinkedIn != "") {
            Link(
                path = details.socialMedia.LinkedIn,
                openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
                modifier = socialLinksStyle.toModifier()
                    .id("linkedIn")
            ) {
                FaLinkedinIn(size = IconSize.XL, modifier = socialMediaIcon.toModifier())
            }
        }

        if (details.socialMedia.gitHub != "") {
            Link(
                path = details.socialMedia.gitHub,
                openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
                modifier = socialLinksStyle.toModifier().id("gitHub")
            ) {
                FaGithub(size = IconSize.XL, modifier = socialMediaIcon.toModifier())
            }
        }

        if (details.socialMedia.mail != "") {
            Link(
                path = details.socialMedia.mail,
                openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
                modifier = socialLinksStyle.toModifier().id("mail")
            ) {
                FaEnvelope(size = IconSize.XL, modifier = socialMediaIcon.toModifier())
            }
        }

        if (details.socialMedia.instaId != "") {
            Link(
                path = details.socialMedia.instaId,
                openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
                modifier = socialLinksStyle.toModifier().id("insta")
            ) {
                FaInstagram(size = IconSize.XL, modifier = socialMediaIcon.toModifier())
            }
        }

        if (details.socialMedia.twitter != "") {
            Link(
                path = details.socialMedia.twitter,
                openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
                modifier = socialLinksStyle.toModifier().id("twitter")
            ) {
                FaTwitter(size = IconSize.XL, modifier = socialMediaIcon.toModifier())
            }
        }
    }
}