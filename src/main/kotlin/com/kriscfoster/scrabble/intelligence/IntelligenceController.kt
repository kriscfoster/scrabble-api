package com.kriscfoster.scrabble.intelligence

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/intelligence")
class IntelligenceController {

    @PostMapping
    fun calculateBestWord() {
        // TODO: API endpoint takes a board & a list of letters & returns best board
    }

}
