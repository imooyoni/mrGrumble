plugins {
    kotlin("jvm") version "1.9.21"
    application
}

group = "com.moonie.kotlin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
application{
    mainClass.set("MainKt")
}