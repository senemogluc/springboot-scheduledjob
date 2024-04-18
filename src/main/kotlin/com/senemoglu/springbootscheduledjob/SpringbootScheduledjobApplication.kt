package com.senemoglu.springbootscheduledjob

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@ConfigurationPropertiesScan
@EnableScheduling
@EnableFeignClients
class SpringbootScheduledjobApplication

fun main(args: Array<String>) {
    runApplication<SpringbootScheduledjobApplication>(*args)
}
