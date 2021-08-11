package dev.pras.pennydrop.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.pras.pennydrop.types.NewPlayer

class PickPlayersViewModel: ViewModel() {
    val players = MutableLiveData<List<NewPlayer>>().apply {
        this.value = (1..6).map{
            NewPlayer(
                canBeRemoved = it > 2,  //at least 2 players are needed to play the game
                canBeToggled = it > 1   //we need at least 1 human player
            )
        }
    }
}