import io.vertx.gradle.vertx

/*buildscript {
    dependencies {
        classpath("com.google.guava:guava:27.0.1-jre")
    }
}*/

plugins {
    java
    application
    jacoco
    id("io.vertx.vertx-plugin") version "0.2.0"
}

repositories {
    mavenCentral()
    jcenter()
}


dependencies {
    implementation("io.vertx:vertx-web")
    implementation("io.vertx:vertx-web-client")
    implementation("io.vertx:vertx-web-templ-freemarker")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}


vertx {
    mainVerticle = "tutu"
    vertxVersion = "3.6.2"
}
