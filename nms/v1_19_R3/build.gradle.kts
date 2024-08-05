plugins {
    `java-library`
}

apply(from = rootProject.file("nms/nmsModule.gradle"))

extra["craftbukkitVersion"] = "1.19.4-R0.1-SNAPSHOT"

description = "v1_19_R3"

dependencies {
    compileOnly(libs.com.mojang.authlib.old)
    compileOnly(libs.io.netty.netty.buffer)
    compileOnly(libs.it.unimi.dsi.fastutil)
    compileOnly(libs.com.mojang.datafixerupper)
}
