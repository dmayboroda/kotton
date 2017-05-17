buildscript {
    repositories {
        mavenCentral()
        maven { setUrl("https://repo.spring.io/milestone") }
        maven { setUrl("https://repo.spring.io/snapshot") }
    }

    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.0.0.BUILD-SNAPSHOT")
    }
}

plugins {
    val kotlinVersion = "1.1.2-2"
    id("org.jetbrains.kotlin.jvm") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.noarg") version kotlinVersion
    id("io.spring.dependency-management") version "1.0.2.RELEASE"
}

apply {
    plugin("org.springframework.boot")
}

group = "com.dmayboroda"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
    maven { setUrl("https://repo.spring.io/milestone") }
    maven { setUrl("https://repo.spring.io/snapshot") }
}

dependencies {
    compile("org.jetbrains.kotlin:kotlin-stdlib-jre8")
    compile("org.jetbrains.kotlin:kotlin-reflect")
    compile("org.springframework.boot:spring-boot-starter-webflux")
    compile("io.projectreactor:reactor-kotlin-extensions:1.0.0.M2")

    compile("com.fasterxml.jackson.module:jackson-module-kotlin")
    compile("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")

    compileOnly("org.springframework:spring-context-indexer")

    testCompile("io.projectreactor.addons:reactor-test")
    testCompile("org.springframework.boot:spring-boot-starter-test")

}