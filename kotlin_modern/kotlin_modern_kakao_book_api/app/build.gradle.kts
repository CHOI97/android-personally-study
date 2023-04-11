plugins {
    id(Plugins.ANDROID_APPLICATION)
    id(Plugins.KOTLIN_ANDROID)
    id(Plugins.KAPT)
    id(Plugins.SECRETS_GRADLE_PLUGIN)
    id(Plugins.SAFEARGS)
    id(Plugins.PARCELIZE)
    id(Plugins.HILT_PLUGIN)
}

//Properties properties = new Properties()
//properties.load(project.rootProject.file('local.properties').newDataInputStream())

android {
    namespace = "com.example.kotlin_modern_kakao_book_api"
    compileSdk = DefaultConfig.COMPILE_SDK_VERSION

    defaultConfig {
        applicationId = "com.example.kotlin_modern_kakao_book_api"
        minSdk = DefaultConfig.MIN_SDK_VERSION
        targetSdk = DefaultConfig.TARGET_SDK_VERSION
        versionCode = DefaultConfig.VERSION_CODE
        versionName = DefaultConfig.VERSION_NAME

//        buildConfigField = "String", "kakao_api_key", properties["KAKAO_API_KEY"]
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        named("release") {
//        release {
//            minifyEnabled false
//            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
    kapt {
        correctErrorTypes = true
    }
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

dependencies {

    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.APP_COMPAT)
    implementation(Dependencies.MATERIAL)
    implementation(Dependencies.CONSTRAINT_LAYOUT)

    // Testing
    testImplementation(Testing.JUNIT4)
    testImplementation("androidx.test.ext:truth:1.5.0")
    testImplementation("androidx.test:runner:1.5.2")
    testImplementation("org.robolectric:robolectric:4.9.1")
    testImplementation("androidx.test.ext:junit:1.1.5")
    testImplementation("androidx.test:core:1.5.0")

    androidTestImplementation(Testing.ANDROID_JUNIT)
    androidTestImplementation(Testing.ESPRESSO_CORE)
    androidTestImplementation("androidx.test:core:1.5.0")
    androidTestImplementation("androidx.test.ext:truth:1.5.0")
    androidTestImplementation("androidx.test:runner:1.5.2")

    // Retrofit
    implementation(Dependencies.RETROFIT)
    implementation(Dependencies.RETROFIT_CONVERTER_MOSHI)

    // Moshi
    implementation(Dependencies.MOSHI)
    kapt(Dependencies.MOSHI_KAPT)

    // Okhttp
    implementation(Dependencies.OKHTTP)
    implementation(Dependencies.OKHTTP_LOGGING_INTERCEPTOR)

    // Lifecycle
    implementation(Dependencies.LIFECYCLE_VIEWMODEL_KTX)
    implementation(Dependencies.LIFECYCLE_RUNTIME_KTX)
    implementation(Dependencies.LIFECYCLE_VIEWMODEL_KTX)

    // Coroutine
    implementation(Dependencies.COROUTINE_CORE)
    implementation(Dependencies.COROUTINE_ANDROID)

    // Coil
    implementation(Dependencies.COIL)

    // Recyclerview
    implementation(Dependencies.RECYCLERVIEW)

    // Navigation
    implementation(Dependencies.NAVIGATION_FRAGMENT_KTX)
    implementation(Dependencies.NAVIGATION_UI_KTX)

    // Room
    implementation(Dependencies.ROOM_RUNTIME)
    implementation(Dependencies.ROOM_KTX)
    kapt(Dependencies.ROOM_KAPT)
    implementation(Dependencies.ROOM_PAGING)

    // Kotlin serialization
    implementation(Dependencies.KOTLIN_SERIALIZATION)

    // DataStore
    implementation(Dependencies.PREFERENCES_DATASTORE)

    // Paging
    implementation(Dependencies.PAGING)

    // WorkManager
    implementation(Dependencies.WORKMANGER)

    // Hilt
    implementation(Dependencies.DAGGER_HILT)
    kapt(Dependencies.DAGGER_HILT_KAPT)

    // ViewModel delegate
    implementation(Dependencies.ACTIVITY_KTX)
    implementation(Dependencies.FRAGMENT_KTX)

    // Hilt extension
    implementation(Dependencies.HILT_EXTENSION_WORK)
    kapt(Dependencies.HILT_EXTENSION_KAPT)
}