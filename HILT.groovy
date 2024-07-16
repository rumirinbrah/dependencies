
    //dependency
    implementation("com.google.dagger:hilt-android:2.48")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")
    implementation("com.google.android.gms:play-services-cast-framework:21.5.0")
    kapt("com.google.dagger:hilt-android-compiler:2.48")
    kapt("androidx.hilt:hilt-compiler:1.2.0")
    
    //plugin
    id("com.google.dagger.hilt.android")

    //project lvl gradle 
    id("com.google.dagger.hilt.android") version "2.48" apply false
