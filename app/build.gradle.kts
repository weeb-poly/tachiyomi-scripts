plugins {
    application
    kotlin("multiplatform") version "1.7.10"
    kotlin("plugin.serialization") version "1.7.10"
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

application {
    // Define the main class for the application.
    mainClass.set("moe.wpi.tachiyomi.scripts")
}

kotlin {
    jvm()

    sourceSets {
        val commonMain by getting {
            dependencies {
                // Data serialization (ProtoBuf + JSON)
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf:1.4.0")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.0")
            }
        }

        val jvmMain by getting {
            dependsOn(commonMain)
            dependencies {
                // Kotlin MPP bug (KT-53396)
                // Solution taken from KT-40489
                //implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
                implementation(project.dependencies.platform("org.jetbrains.kotlin:kotlin-bom"))

                implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
            }
        }
    }
}