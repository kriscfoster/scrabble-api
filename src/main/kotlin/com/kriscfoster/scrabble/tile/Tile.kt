package com.kriscfoster.scrabble.tile

class Tile(var letter: Char, var value: Int) {
    override fun toString(): String {
        return "$letter : $value"
    }
}
