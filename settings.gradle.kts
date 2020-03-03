// can create variables
private val TAG = "Settings File: "
//can access rootProject object
rootProject.name = "GradleLearning"
//can access gradle object
val gradleVersion = gradle.gradleVersion

println("$TAG  gradle version is $gradleVersion")
println("$TAG  project name is ${rootProject.name}")

// can add projects which are part of build process.
include(":app")