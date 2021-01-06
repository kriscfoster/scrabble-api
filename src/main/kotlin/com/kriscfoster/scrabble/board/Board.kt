package com.kriscfoster.scrabble.board

import com.kriscfoster.scrabble.space.Space
import com.kriscfoster.scrabble.space.SpaceType
import com.kriscfoster.scrabble.space.SpaceType.*


class Board {
    var spaces = Array(15) { arrayOfNulls<Space>(15) }

    init {
        for (i in spaces.indices) {
            for (j in spaces[i].indices) {
                spaces[i][j] = getSpace(i, j)
            }
        }
    }

    private fun getSpace(i: Int, j: Int): Space {
        return Space(getSpaceType(i, j))
    }

    private fun getSpaceType(i: Int, j: Int): SpaceType {
        return when {
            isTripleWordSpaceType(i, j) -> TRIPLE_WORD
            isDoubleWordSpaceType(i, j) -> DOUBLE_WORD
            isTripleLetterSpaceType(i, j) -> TRIPLE_LETTER
            isDoubleLetterSpaceType(i, j) -> DOUBLE_LETTER
            else -> STANDARD
        }
    }

    private fun isTripleWordSpaceType(i: Int, j: Int): Boolean {
        return listOf("0,0", "0,7", "0,14", "7,0", "7,14", "14,0", "14,7", "14,14")
                .contains("$i,$j")
    }

    private fun isDoubleWordSpaceType(i: Int, j: Int): Boolean {
        return listOf("1,1", "1,13", "2,2", "2,12", "3,3", "3,11", "4,4", "4,10",
                "7,7", "10,4", "10,10", "11,3", "11,11", "12,2", "12,12", "13,1", "13,13")
                .contains("$i,$j")
    }

    private fun isTripleLetterSpaceType(i: Int, j: Int): Boolean {
        return listOf("1,5", "1,9", "5,1", "5,5", "5,9", "5,13", "9,1", "9,5",
                "9,9", "9,13", "13,5", "13,9")
                .contains("$i,$j")
    }

    private fun isDoubleLetterSpaceType(i: Int, j: Int): Boolean {
        return listOf("0,3", "0,11", "2,6", "2,8", "3,7", "3,0", "3,14", "6,2",
                "6,6", "6,8", "6,12", "7,3", "7,11", "8,2", "8,6", "8,8", "8,12", "11,0", "11,7", "11,14", "12,6",
                "12,8", "14,4", "14,12")
                .contains("$i,$j")
    }
}
