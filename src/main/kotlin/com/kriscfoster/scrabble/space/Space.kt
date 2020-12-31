package com.kriscfoster.scrabble.space

import com.kriscfoster.scrabble.tile.Tile

class Space(spaceType: SpaceType) {
    val spaceType = spaceType
    var tile: Tile? = null
}
