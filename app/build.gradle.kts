plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.hiltPlugin)
    alias(libs.plugins.kspPlugin)
}

android {
    namespace = "com.example.craveto"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.craveto"
        minSdk = 25
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    // Hilt dependencies without versions
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)

    ksp(libs.androidx.hilt.compiler)
    implementation(libs.androidx.hilt.navigation)
    implementation(libs.javapoet)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    // Lifecycle
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.lifecycle.livedata.ktx)

    // Retrofit + OkHttp
    implementation(libs.retrofit)
    implementation(libs.retrofit.gson)
    implementation(libs.okhttp)
    implementation(libs.logging.interceptor)

    // Navigation
    implementation(libs.navigation.fragment.ktx)
    implementation(libs.navigation.ui.ktx)

    // SpineKit
//    implementation(libs.spinekit)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}