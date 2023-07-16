package org.example.vidyadaan.Team.components

import androidx.compose.runtime.Composable
import com.example.compose.Secondary
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.Overflow
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
import org.jetbrains.compose.web.css.rgba

@Composable
fun TeamCard(details: TeamDetails) {
    Box(modifier = TeamCardStyle
        .toModifier()
        .borderRadius(10.px)
        .backgroundColor(Secondary)
        .margin(20.px)
        .id("mainbox")
        , contentAlignment = Alignment.Center) {
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
                    .padding(top = 20.px)
                    .fontSize(FontSize.Medium)
                    .color(Colors.White))
            SpanText(text = details.position ,
                modifier = Modifier
                    .padding(bottom = 20.px)
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