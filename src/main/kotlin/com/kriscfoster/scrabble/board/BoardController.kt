package com.kriscfoster.scrabble.board

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/boards")
class BoardController(boardService: BoardService) {

    val boardService = boardService;

    @GetMapping
    fun getEmptyBoard(): Board {
        return boardService.getNewBoard();
    }
}
