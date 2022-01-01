package com.zconger.sburcoffee

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

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

    @GetMapping
    fun index(): List<Coffee> = coffees

}
