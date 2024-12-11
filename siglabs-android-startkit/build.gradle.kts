buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        // Gradle Plugin for Android and Kotlin (standard setup)
        classpath("com.android.tools.build:gradle:8.7.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:2.1.0")
    }
}

plugins {
    id("com.android.application") version "8.7.3" apply false
    id("org.jetbrains.kotlin.android") version "2.1.0" apply false
}
