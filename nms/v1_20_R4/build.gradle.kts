plugins {
    `java-library`
}

apply(from = rootProject.file("nms/nmsModule.gradle"))

extra["craftbukkitVersion"] = "1.20.6-R0.1-SNAPSHOT"

description = "v1_20_R4"

dependencies {
    compileOnly(libs.com.mojang.authlib.new)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}