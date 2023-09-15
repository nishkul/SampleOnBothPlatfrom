plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
}

kotlin {
    targetHierarchy.default()

    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }

    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic =true
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material)
//                implementation(compose.preview)
//                implementation(compose.material3)
                implementation(compose.materialIconsExtended)
                @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
                implementation(compose.components.resources)

                implementation("org.jetbrains.kotlinx:atomicfu:0.17.3") // 手动添加

//                implementation("androidx.compose.runtime:runtime:1.5.1")
//                implementation("androidx.compose.runtime:runtime-livedata:1.5.1")
//                implementation("androidx.compose.runtime:runtime-rxjava2:1.5.1")
//                val compose_version = "1.5.1"
//                implementation("androidx.compose.runtime:runtime:$compose_version")
//                implementation("androidx.compose.ui:ui:$compose_version")
//                implementation("androidx.compose.foundation:foundation:$compose_version")
//                implementation("androidx.compose.foundation:foundation-layout:$compose_version")
//                implementation("androidx.compose.material:material:$compose_version")
//                implementation("androidx.compose.runtime:runtime-livedata:$compose_version")
//                implementation("androidx.compose.ui:ui-tooling:$compose_version")
//                implementation("com.google.android.material:compose-theme-adapter:$compose_version")

            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

android {
    namespace = "com.example.sampleonbothplatfrom"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
    }
    buildFeatures {
        compose = true
    }
//    composeOptions {
//        kotlinCompilerExtensionVersion = "1.5.3"
//    }
}

