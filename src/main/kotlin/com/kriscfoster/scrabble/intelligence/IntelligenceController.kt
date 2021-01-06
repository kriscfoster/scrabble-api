package com.kriscfoster.scrabble.intelligence

import com.kriscfoster.scrabble.board.Board
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/intelligence")
class IntelligenceController {

    @PostMapping
    fun calculateBestWord(@RequestBody intelligenceRequestBody: IntelligenceRequestBody): Board {
        println(intelligenceRequestBody);
        return intelligenceRequestBody.board;
    }

}
