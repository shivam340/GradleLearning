// can create variables
private val TAG = "App module build File: "

//can't set name here, available as read-only
//rootProject.name = "GradleLearning"

//can access gradle object
val gradleVersion = gradle.gradleVersion

println("$TAG  gradle version is $gradleVersion")

/* In the app module or any sub module:
- It should only contain things like configuration, dependency and tasks specific to this module.
- Project instance is implicitly available in the file, so we can directly refer properties and methods available on it.
 */
println("$TAG  project name is ${rootProject.name}")
println("$TAG  project name is ${project.name}")
println("$TAG  project name is $name")