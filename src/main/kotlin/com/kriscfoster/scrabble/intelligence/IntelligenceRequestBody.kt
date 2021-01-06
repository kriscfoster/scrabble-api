package com.kriscfoster.scrabble.intelligence

import com.kriscfoster.scrabble.board.Board

data class IntelligenceRequestBody(
        val board: Board,
        val tray: List<String>
)
