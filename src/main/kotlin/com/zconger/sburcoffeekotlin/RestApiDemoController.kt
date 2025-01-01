package com.zconger.sburcoffeekotlin

import org.springframework.web.bind.annotation.*
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter

@RestController
class RestApiDemoController {
    var coffees: MutableList<Coffee> = mutableListOf(
        Coffee("Café Cereza"),
        Coffee("Café Ganador"),
        Coffee("Café Lareño"),
        Coffee("Café Três Pontas")
    )

    @Operation(summary = "Get all coffees", description = "Return a list of all available coffees")
    @GetMapping(value = ["/coffees"])
    fun coffees(): MutableList<Coffee> = coffees

    @Operation(summary = "Get coffee by id", description = "Return a coffee by id")
    @Parameter(name = "id", description = "The id of the coffee to return", required = true)
    @GetMapping(value = ["/coffees/{id}"])
    fun coffeeById(@PathVariable id: String): List<Coffee> {
        return coffees.filter { it.id == id }
    }

    @Operation(summary = "Add a coffee", description = "Add a coffee to the list of available coffees")
    @Parameter(name = "coffee", description = "The coffee to add", required = true)
    @PostMapping(value = ["/coffees"])
    fun coffeePost(@RequestBody name: String): Coffee {
        val coffee = Coffee(name)
        coffees.add(coffee)
        return coffee
    }

    @Operation(summary = "Update a coffee", description = "Update a coffee in the list of available coffees")
    @Parameter(name = "id", description = "The id of the coffee to update", required = true)
    @PutMapping(value = ["/coffees/{id}"])
    fun coffeePut(@PathVariable id: String, @RequestBody coffee: Coffee): List<Coffee> {
        coffees.add(coffee)
        return coffees.filter { it.id == id }
    }

    @Operation(summary = "Delete a coffee", description = "Delete a coffee from the list of available coffees")
    @Parameter(name = "id", description = "The id of the coffee to delete", required = true)
    @DeleteMapping(value = ["/coffees/{id}"])
    fun coffeeDelete(@PathVariable id: String): List<Coffee> {
        val coffee = coffees.first { it.id == id }
        coffees.remove(coffee)
        return coffees
    }
}
