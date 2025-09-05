plugins {
    id("cn.edu.sdu.qd.oj.java-conventions")
}

dependencies {
    /* 1-st party dependency */
    api(project(":sduoj-common:sduoj-common-entity"))
    api(project(":sduoj-common:sduoj-common-util"))

    /* 2-nd party dependency */

    /* 3-rd party dependency */
    api("com.alibaba:fastjson")
    api("org.springframework.boot:spring-boot-starter-logging")
    api("org.springframework.boot:spring-boot-starter-web")
    api("org.springframework.boot:spring-boot-starter-actuator")
    api("org.springframework.cloud:spring-cloud-starter-openfeign")
    api("mysql:mysql-connector-java")
    api("com.baomidou:mybatis-plus-boot-starter")
    api("org.springframework.boot:spring-boot-starter-test")
    api("org.apache.commons:commons-lang3")
    api("commons-codec:commons-codec")
    api("org.springframework.boot:spring-boot-configuration-processor")
    api("org.mapstruct:mapstruct")
    api("com.google.guava:guava")
    api("io.github.openfeign:feign-jackson")
    api("io.netty:netty-buffer")
}

group = "cn.edu.sdu.qd.oj.common"
description = "sduoj-common-web"
