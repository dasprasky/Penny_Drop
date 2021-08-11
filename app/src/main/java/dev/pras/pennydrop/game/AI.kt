package dev.pras.pennydrop.game

data class AI(val name: String){
    override fun toString(): String {
        return name
    }

    companion object{
        @JvmStatic
        val basicAI = listOf(
            AI("TwoFace"),
            AI("No Go Noah"),
            AI("Bail Out Beulah"),
            AI("Fearfu Fred"),
            AI("Even Steven"),
            AI("Riverboat Ron"),
            AI("Sammy Sixes"),
            AI("Random Racheal")
        )
    }
}
