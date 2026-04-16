plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.supportandroid"
    compileSdk = 28

    defaultConfig {
        applicationId = "com.example.supportandroid"
        minSdk = 21
        targetSdk = 28
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
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

    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    implementation("com.android.support:appcompat-v7:28.0.0")
    implementation("com.android.support:support-compat:28.0.0")
}
