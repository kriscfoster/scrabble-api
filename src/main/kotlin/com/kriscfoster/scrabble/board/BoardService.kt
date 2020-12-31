package com.kriscfoster.scrabble.board

import org.springframework.stereotype.Service

@Service
class BoardService {
    fun getNewBoard(): Board {
        return Board();
    }
}
