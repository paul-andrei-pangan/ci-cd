plugins {
    id("com.android.application")
    id("kotlin-android")
    id("dev.flutter.flutter-gradle-plugin") // Dapat tama ang pagkakaayos nito
}

android {
    namespace = "com.example.taskmanager"
    compileSdk = 34 // Gumamit ng latest supported version
    ndkVersion = "27.0.12077973" // Dapat tugma ito sa dependencies mo

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17" // Updated to JDK 17 for better compatibility
    }

    defaultConfig {
        applicationId = "com.example.taskmanager"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            signingConfig = signingConfigs.getByName("debug") // Temporary fix for signing
        }
    }

    packagingOptions {
        jniLibs {
            useLegacyPackaging = true
        }
    }
}

flutter {
    source = "../.."
}
