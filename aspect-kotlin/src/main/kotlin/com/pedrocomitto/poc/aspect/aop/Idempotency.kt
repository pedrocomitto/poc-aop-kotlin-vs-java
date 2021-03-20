package com.pedrocomitto.poc.aspect.aop

inline fun withIdempotency(block: () -> Unit) {
    println("doing idempotency stuff")
    block()
}