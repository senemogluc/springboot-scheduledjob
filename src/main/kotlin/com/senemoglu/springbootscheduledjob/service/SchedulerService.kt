package com.senemoglu.springbootscheduledjob.service

import com.senemoglu.springbootscheduledjob.client.FooClient
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service

@Service
class SchedulerService(private val fooClient: FooClient) {

    @Scheduled(cron = "\${cron.syncCronExpression}")
    fun schedule(): String {
        println("Scheduled service is triggered.")
        return fooClient.test()
    }
}