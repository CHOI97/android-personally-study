
plugins {
    id(Plugins.ANDROID_APPLICATION)
    id(Plugins.KOTLIN_ANDROID)
    id(Plugins.KAPT)
    id(Plugins.DAGGER_HILT)
}

android {
    namespace = "com.example.presentation"
    compileSdk = 33

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.APP_COMPAT)
    implementation(Dependencies.MATERIAL)
    implementation(Dependencies.CONSTRAINT_LAYOUT)
    testImplementation(Testing.JUNIT4)
    androidTestImplementation(Testing.ANDROID_JUNIT)
    androidTestImplementation(Testing.ESPRESSO_CORE)

    // LifeCycle
    implementation(Dependencies.LIFECYCLE_VIEWMODEL_KTX)
    implementation(Dependencies.LIFECYCLE_SAVEDSTATE)
    implementation(Dependencies.LIFECYCLE_RUNTIME_KTX)

    // ViewModel delegate
    implementation(Dependencies.ACTIVITY_KTX)
    implementation(Dependencies.FRAGMENT_KTX)

    // Timber
    implementation (Dependencies.TIMBER)

    // Hilt
    implementation(Dependencies.DAGGER_HILT)
    kapt(Dependencies.DAGGER_HILT_KAPT)
}