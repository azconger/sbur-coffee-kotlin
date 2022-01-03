package com.zconger.sburcoffee

import org.springframework.web.bind.annotation.*

@RestController
class RestApiDemoController {
    var coffees: MutableList<Coffee> = mutableListOf(
        Coffee("Café Cereza"),
        Coffee("Café Ganador"),
        Coffee("Café Lareño"),
        Coffee("Café Três Pontas")
    )

    @GetMapping(value = ["/coffees"])
    fun coffees(): MutableList<Coffee> = coffees

    @GetMapping(value = ["/coffees/{id}"])
    fun coffeeById(@PathVariable id: String): List<Coffee> {
        return coffees.filter { it.id == id }
    }

    @PostMapping(value = ["/coffees"])
    fun coffeePost(@RequestBody coffee: Coffee): Coffee {
        coffees.add(coffee)
        return coffee
    }

//    @PutMapping(value = ["/coffees/{id}"])
//    fun coffeePut(@PathVariable id: String, @RequestBody coffee: Coffee): Coffee {
//
//    }
}
