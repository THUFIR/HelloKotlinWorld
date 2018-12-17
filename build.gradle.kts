import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    kotlin("jvm") version "1.2.51"
    id("com.github.johnrengelman.shadow") version "2.0.4"
}

group = "xxx.yyy"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<ShadowJar> {

    baseName = "app"
    classifier = "inajar"
    version = "9"


    manifest.attributes.apply {
        put("Implementation-Title", "Gradle Jar File Example")
        //put("Implementation-Version" version)
        put("Main-Class", "HelloKotlinWorld.App")
    }

}





