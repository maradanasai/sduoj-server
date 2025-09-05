plugins {
    id("org.springframework.boot") version Versions.springBoot
    id("cn.edu.sdu.qd.oj.java-conventions")
}

dependencies {
    /* 1-st party dependency */
    implementation(project(":sduoj-common:sduoj-common-redis"))

    /* 2-nd party dependency */
    implementation(project(":sduoj-submit:sduoj-submit-interface"))

    /* 3-rd party dependency */
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.boot:spring-boot-starter-data-redis-reactive")
    implementation("org.springframework.boot:spring-boot-starter-amqp")
    implementation("org.springframework.boot:spring-boot-configuration-processor")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
}

group = "cn.edu.sdu.qd.oj.websocket"
description = "sduoj-websocket"
