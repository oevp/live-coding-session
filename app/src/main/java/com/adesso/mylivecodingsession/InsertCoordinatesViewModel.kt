package com.adesso.mylivecodingsession

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope

class InsertCoordinatesViewModel : ViewModel() {

    val myResponse: MutableLiveData<Coordenades> = MutableLiveData()

    fun getPost() {
      //  viewModelScope.launch {
     //       myResponse.value = UserNetwork.retrofit.getPost()
     //   }
    }

}