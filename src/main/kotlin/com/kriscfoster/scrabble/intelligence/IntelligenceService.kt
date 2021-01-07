package com.kriscfoster.scrabble.intelligence

import com.kriscfoster.scrabble.board.Board
import org.springframework.stereotype.Service

@Service
class IntelligenceService {
    fun getBoard(board: Board, tray: List<String>): Board {
        return board
    }

}
