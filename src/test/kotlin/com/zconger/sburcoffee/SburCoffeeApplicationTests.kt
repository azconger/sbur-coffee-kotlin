package com.zconger.sburcoffee

import kotlin.test.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SburCoffeeApplicationTests {

	@Test
	fun contextLoads() {
	}

	@Test
	fun coffeeConstructorPrimary() {
		val name = "Ethiopian Yirgacheffe"
		val id = "81462CAF-9580-48FB-9B92-3F1E6FAFE100"
		val coffee1 = Coffee(id, name)
		assertEquals(name, coffee1.name)
		assertEquals(id, coffee1.id)
	}

	@Test
	fun coffeeSetName() {
		val name = "Sumatra"
		val coffee = Coffee(name)
		val newName = "Colombian"
		coffee.name = newName
		assertEquals(newName, coffee.name)
	}
}
