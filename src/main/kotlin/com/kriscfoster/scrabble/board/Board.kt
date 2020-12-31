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
        return i % 7 == 0 && j % 7 == 0 && !(i == 7 && j == 7)
    }

    private fun isDoubleWordSpaceType(i: Int, j: Int): Boolean {
        if (
                (i != 5) && (i !=6) && (i != 8) && (i != 9) &&
                ((i + j == 14) || (i == j))
        ) {
            return true
        }

        return false
    }

    private fun isTripleLetterSpaceType(i: Int, j: Int): Boolean {
        if (i == 1 && ((j == 5) || j == 9)) {
            return true
        }

        return false
    }

    private fun isDoubleLetterSpaceType(i: Int, j: Int): Boolean {
        if (
                (i == 0 && ((j == 3) || j == 11)) ||
                (i == 2 && ((j == 6) || j == 8))
        ) {
            return true
        }

        return false
    }
}
