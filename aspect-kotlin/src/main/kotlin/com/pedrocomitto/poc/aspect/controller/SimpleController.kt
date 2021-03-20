package com.pedrocomitto.poc.aspect.controller

import com.pedrocomitto.poc.aspect.service.BusinessLogicService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class SimpleController(
    private val businessLogicService: BusinessLogicService
) {

    @GetMapping
    fun test() = businessLogicService.process()

}