package com.senemoglu.springbootscheduledjob.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping

@Component
@FeignClient(value = "foo-client", url = "http://localhost:8080/test")
interface FooClient {

    @GetMapping("/out-source-endpoint")
    fun test(): String
}