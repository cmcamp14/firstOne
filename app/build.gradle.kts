plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
    id("kotlin-kapt")
}

android {
    compileSdk = libs.versions.compileSdk.get().toInt()
    namespace = "com.example.thefirstone"
    defaultConfig {
        applicationId = "com.example.thefirstone"
        minSdk = 24
        targetSdk = libs.versions.minSdk.get().toInt()
        versionCode = libs.versions.versionCode.get().toInt()
        versionName = libs.versions.versionName.get()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.4"
    }
    packagingOptions {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}


dependencies {
    implementation(libs.bundles.main)
    implementation(projects.network)
    implementation(projects.database)
    implementation(projects.coreComposables)
    testImplementation(libs.bundles.test)
    androidTestImplementation(libs.bundles.instrumentation)
    debugImplementation(libs.bundles.debug)
    kapt(libs.bundles.hilt)
}