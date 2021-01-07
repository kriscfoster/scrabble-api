package com.kriscfoster.scrabble.intelligence

import com.kriscfoster.scrabble.board.Board
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/intelligence")
class IntelligenceController(intelligenceService: IntelligenceService) {
    val intelligenceService = intelligenceService

    @PostMapping
    fun calculateBestWord(@RequestBody intelligenceRequestBody: IntelligenceRequestBody): Board {
        return intelligenceService.getBoard(intelligenceRequestBody.board, intelligenceRequestBody.tray)
    }

}
