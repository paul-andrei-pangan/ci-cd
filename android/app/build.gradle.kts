plugins {
    id 'com.android.application'
    id 'kotlin-android'
    id 'dev.flutter.flutter-gradle-plugin'
}

android {
    namespace 'com.example.taskmanager'
    compileSdk flutter.compileSdkVersion
            ndkVersion "27.0.12077973"

    defaultConfig {
        applicationId "com.example.taskmanager"
        minSdk flutter.minSdkVersion
                targetSdk flutter.targetSdkVersion
                versionCode flutter.versionCode
                versionName flutter.versionName
    }

    buildTypes {
        release {
            signingConfig signingConfigs.debug
        }
    }

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_11
                targetCompatibility JavaVersion.VERSION_11
                coreLibraryDesugaringEnabled true // ✅ Enable core library desugaring
    }
}

flutter {
    source '../..'
}

dependencies {
    implementation "androidx.core:core-ktx:1.12.0"

    // ✅ Add this for core library desugaring
    coreLibraryDesugaring 'com.android.tools:desugar_jdk_libs:2.0.3'
}
