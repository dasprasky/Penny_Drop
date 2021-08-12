package dev.pras.pennydrop.types

import dev.pras.pennydrop.game.AI

data class Player(
    val playerName:String = "",
    val isHuman: Boolean = true,
    val selectedAI: AI? = null
){
    var pennies: Int = defaultPennyCount

    fun addpennies(count:Int = 1){
        pennies+=count
    }

    var isRolling:Boolean = false

    companion object{
        const val defaultPennyCount = 10
    }

}
