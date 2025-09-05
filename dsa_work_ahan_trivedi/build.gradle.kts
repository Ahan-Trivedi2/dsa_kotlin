plugins {
    kotlin("jvm") version "2.2.0"
    application                      // 👈 add this
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

application {
    // 👇 must match your package + file name
    mainClass.set("test_script.MainKt")
}
