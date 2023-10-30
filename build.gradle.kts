// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {



    ext.okhttp_version = "4.9.3"
    ext.retrofit_version = "2.9.0"

    ext.hilt_version = "2.44"

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
}


plugins {
    id("com.android.application") version "8.1.2" apply false
    id ('com.android.library') version '8.1.2' apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id ('com.google.dagger.hilt.android') version '2.44' apply false
}