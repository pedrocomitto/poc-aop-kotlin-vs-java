package com.pedrocomitto.poc.aspect.service;

import com.pedrocomitto.poc.aspect.aop.annotation.Idempotent;
import org.springframework.stereotype.Service;

@Service
public class BusinessLogicService {

    @Idempotent
    public void process() {
        System.out.println("business logic");
    }

}
