package com.pedrocomitto.poc.aspect.controller;

import com.pedrocomitto.poc.aspect.service.BusinessLogicService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SimpleController {

    private final BusinessLogicService businessLogicService;

    public SimpleController(final BusinessLogicService businessLogicService) {
        this.businessLogicService = businessLogicService;
    }

    @GetMapping
    public void test() {
        businessLogicService.process();
    }

}
