package com.kriscfoster.scrabble.word

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/word")
class WordController(val wordRepository: WordRepository) {

    @GetMapping
    fun getWords() : Word {
        return wordRepository.findRandomWord()
    }
}
