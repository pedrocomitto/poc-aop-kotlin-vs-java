package com.pedrocomitto.poc.aspect.service

import com.pedrocomitto.poc.aspect.aop.withIdempotency
import org.springframework.stereotype.Service

@Service
class BusinessLogicService {

    fun process() {
        withIdempotency { println("business logic") }
    }

}
