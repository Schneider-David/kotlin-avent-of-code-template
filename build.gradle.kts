plugins {
    kotlin("jvm") version "1.7.22"

}

repositories {
    mavenCentral()
}

tasks {
    sourceSets {
        main {
            java.srcDirs("src")
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-benchmark-runtime:0.4.4")
            }

        }
    }

    wrapper {
        gradleVersion = "7.6"
    }
}
