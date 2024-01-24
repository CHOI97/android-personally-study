plugins {
    id(Plugins.ANDROID_APPLICATION)
    id(Plugins.KOTLIN_ANDROID)
    id(Plugins.KAPT)
    id(Plugins.DAGGER_HILT)
}

android {
    namespace = "com.example.base"
    compileSdk = DefaultConfig.COMPILE_SDK_VERSION

    defaultConfig {
        applicationId = "com.example.base"
        minSdk = DefaultConfig.MIN_SDK_VERSION
        targetSdk = DefaultConfig.TARGET_SDK_VERSION
        versionCode = DefaultConfig.VERSION_CODE
        versionName = DefaultConfig.VERSION_NAME

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
    buildFeatures{
        dataBinding = true
    }
}

dependencies {

    // LifeCycle
    implementation(Dependencies.LIFECYCLE_VIEWMODEL_KTX)
    implementation(Dependencies.LIFECYCLE_SAVEDSTATE)
    implementation(Dependencies.LIFECYCLE_RUNTIME_KTX)

    // ViewModel delegate
    implementation(Dependencies.ACTIVITY_KTX)
    implementation(Dependencies.FRAGMENT_KTX)

    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.APP_COMPAT)
    implementation(Dependencies.MATERIAL)
    implementation(Dependencies.CONSTRAINT_LAYOUT)
    testImplementation(Testing.JUNIT4)
    androidTestImplementation(Testing.ANDROID_JUNIT)
    androidTestImplementation(Testing.ESPRESSO_CORE)

    // Retrofit
    implementation (Dependencies.RETROFIT)
    implementation (Dependencies.RETROFIT_CONVERTER_GSON)

    // Room
    implementation(Dependencies.ROOM_RUNTIME)
    implementation(Dependencies.ROOM_KTX)
    annotationProcessor(Dependencies.ROOM_KAPT)
    kapt(Dependencies.ROOM_KAPT)



    // Coroutine
    implementation(Dependencies.COROUTINE_CORE)
    implementation(Dependencies.COROUTINE_ANDROID)

    // Glide
    implementation (Dependencies.GLIDE)

    // Okhttp
    implementation (Dependencies.OKHTTP)
    implementation (Dependencies.OKHTTP_LOGGING_INTERCEPTOR)

    // Hilt
    implementation(Dependencies.DAGGER_HILT)
    kapt(Dependencies.DAGGER_HILT_KAPT)

    // Timber
    implementation (Dependencies.TIMBER)
}