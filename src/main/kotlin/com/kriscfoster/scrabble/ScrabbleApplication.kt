package com.kriscfoster.scrabble

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ScrabbleApplication

fun main(args: Array<String>) {
	runApplication<ScrabbleApplication>(*args)
}
