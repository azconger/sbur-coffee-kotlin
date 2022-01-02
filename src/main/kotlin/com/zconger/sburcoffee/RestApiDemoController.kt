package com.zconger.sburcoffee

import org.springframework.web.bind.annotation.*

@RestController
class RestApiDemoController {
//    init {
        var coffees: List<Coffee> = listOf(
            Coffee("Café Cereza"),
            Coffee("Café Ganador"),
            Coffee("Café Lareño"),
            Coffee("Café Três Pontas")
        )
//    }

    @GetMapping(value = ["/coffees"])
    fun coffees(): List<Coffee> = coffees

    @GetMapping(value = ["/coffees/{id}"])
    fun coffeeBtId(@PathVariable id: String): List<Coffee>? {
        return coffees.filter { it.id == id }
    }
}
