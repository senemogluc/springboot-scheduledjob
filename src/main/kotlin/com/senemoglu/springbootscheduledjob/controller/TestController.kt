package com.senemoglu.springbootscheduledjob.controller

import com.senemoglu.springbootscheduledjob.service.SchedulerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestController(private val schedulerService: SchedulerService) {

    @GetMapping("/out-source-endpoint")
    fun test(): String {
        return "Hello-world"
    }

    @GetMapping("/trigger")
    fun trigger(): String {
        return schedulerService.schedule()
    }
}