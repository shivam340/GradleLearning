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


// access user defined properties using extra
val greetMessage = extra.properties.get("greetMessage")
if(greetMessage != null) {
    println("$TAG  value of user defined property greetMessage is $greetMessage")
}else{
    println("$TAG  user defined property greetMessage is not available.")
}

// Access System properties using System.getProperty()
val javaVersion = System.getProperty("java_version")
if(javaVersion != null) {
    println("$TAG  value of system property java_version is available $javaVersion")
}else{
    println("$TAG  value of system property java_version is not available")
}