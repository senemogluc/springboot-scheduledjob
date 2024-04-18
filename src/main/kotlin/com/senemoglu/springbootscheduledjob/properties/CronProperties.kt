package com.senemoglu.springbootscheduledjob.properties

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "cron")
data class CronProperties (val syncCronExpression: String)