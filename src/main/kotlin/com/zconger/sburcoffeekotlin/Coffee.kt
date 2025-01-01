package com.zconger.sburcoffeekotlin

import java.util.*

data class Coffee(val id: String, var name: String) {
	constructor(name: String) : this(UUID.randomUUID().toString(), name)
}
