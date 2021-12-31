package com.zconger.sburcoffee

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class SburCoffeeApplication

fun main(args: Array<String>) {
	runApplication<SburCoffeeApplication>(*args)
}

class Coffee(val id: String, var name: String) {
	constructor(name: String) : this(UUID.randomUUID().toString(), name)
}
