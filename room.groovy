
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


//version catalog
//dependencies
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    ksp(libs.androidx.room.compiler)
//plugins
    alias(libs.plugins.devtools.ksp)
    alias(libs.plugins.devtools.ksp) apply  false

//catalog
kspVersion = "2.0.21-1.0.27"

devtools-ksp = { id = "com.google.devtools.ksp" , version.ref ="kspVersion"}
androidx-room-runtime = {group = "androidx.room" , name="room-runtime" , version.ref = "roomVersion"}
androidx-room-ktx = {group = "androidx.room" , name="room-ktx",version.ref = "roomVersion"}
androidx-room-compiler = {group = "androidx.room" , name = "room-compiler" , version.ref = "roomVersion"}
