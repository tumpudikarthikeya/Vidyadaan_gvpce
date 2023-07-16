import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import kotlinx.html.link
import kotlinx.html.script
import org.gradle.ide.xcode.tasks.internal.XcodeSchemeFile.LaunchAction
import org.jetbrains.kotlin.gradle.plugin.KotlinPlatformType
import org.jetbrains.kotlin.gradle.targets.js.JS
import org.jetbrains.kotlin.js.backend.ast.JsFunction

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.application)
    alias(libs.plugins.kobwebx.markdown)
}
group = "org.example.vidyadaan"
version = "1.0-SNAPSHOT"

kobweb {
    app {
        index {
            description.set("Powered by Kobweb")
            head.add {


                /*link {

                    rel = "stylesheet"
                    href ="https://unpkg.com/aos@next/dist/aos.css"
                }
                script {
                    src="https://unpkg.com/aos@next/dist/aos.js"
                }
               */
                script {
                    src = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
                }
                link {
                    href ="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
                    rel = "stylesheet"
                }
                link {
                    rel = "preconnect"
                    href = "https://fonts.googleapis.com"
                }
                link {
                    rel = "preconnect"
                    href = "https://fonts.gstatic.com"
                }
                link {
                    href = "https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap"
                    rel = "stylesheet"
                }
            }
        }
    }
}

kotlin {
    configAsKobwebApplication("vidyadaan", includeServer = true)

    @Suppress("UNUSED_VARIABLE") // Suppress spurious warnings about sourceset variables not being used
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(compose.html.core)
                implementation(libs.kobweb.core)
                implementation(libs.kobweb.silk.core)
                implementation(libs.kobweb.silk.icons.fa)
                implementation(libs.kobwebx.markdown)
                //implementation(npm("aos@next.save","2.3.4"))

            }
        }
        val jvmMain by getting {
            dependencies {
                implementation(libs.kobweb.api)
             }
        }
    }
}