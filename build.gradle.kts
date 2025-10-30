plugins {
    kotlin("jvm") version "2.2.20"
}

group = "ru.psu"
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
kotlin {
    jvmToolchain(24)
}
// ДОБАВЬТЕ ЭТО - настройка для ВСЕХ задач Java
tasks.withType<JavaExec> {
    jvmArgs = listOf(
        "-Dfile.encoding=UTF-8",
        "-Dconsole.encoding=UTF-8",
        "-Dsun.stdout.encoding=UTF-8",
        "-Dsun.stderr.encoding=UTF-8",
        "-Dsun.jnu.encoding=UTF-8"
    )
    systemProperty("file.encoding", "UTF-8")
}