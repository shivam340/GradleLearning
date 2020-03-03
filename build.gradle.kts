// can create variables
private val TAG = "Root Project build File: "

//can't set name here, available as read-only
//rootProject.name = "GradleLearning"

//can access gradle object
val gradleVersion = gradle.gradleVersion

println("$TAG  gradle version is $gradleVersion")

/* In the root project directory
- Both instances rootProject and project are same.
- And they are implicitly available in the file, so we can directly refer properties and methods available on it.
- Use this file to add things which are common for all sub modules or sub-projects.
- Use this file to add buildScript repository and dependency information, which is common and shared between all sub-modules.
 */
println("$TAG  project name is ${rootProject.name}")
println("$TAG  project name is ${project.name}")
println("$TAG  project name is $name")

// access user defined properties
if(project.properties.containsKey("greetMessage")) {
    println("$TAG  value of user defined property greetMessage is ${project.properties["greetMessage"]}")
}else{
    println("$TAG  user defined property greetMessage is not available.")
}

// Declare build script specific dependency and repository information.
project.buildscript {

    this.repositories {
        // declare repository location where gradle can find build script dependencies.
        println("inside build script repository{}")
    }
    this.dependencies{
        // declare build script dependencies here.
        println("inside build script dependency{}")
    }
}


// Declare Project dependencies.
project.dependencies {
    println("inside project dependency{}")
}

// Provide Repository location to get Project dependency.
project.repositories {
    println("inside project repository{}")
}