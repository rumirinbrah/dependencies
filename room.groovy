
plugins{
    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false
}
plugins{
    id("com.google.devtools.ksp")
}
//ROOM
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    ksp("androidx.room:room-compiler:2.6.1")
