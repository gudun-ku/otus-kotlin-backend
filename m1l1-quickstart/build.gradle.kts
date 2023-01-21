plugins {
    kotlin("jvm")
}

val systemLambdaVersion: String by project

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
    testImplementation ("com.github.stefanbirkner:system-lambda:$systemLambdaVersion")
}

tasks.test {
    useTestNG()
}
