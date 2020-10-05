package com.example.piggybank.UI.Movements

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.piggybank.Data.Movement

class MovementsViewModel:ViewModel() {

    private val movementsLiveData= MutableLiveData<List<Movement>>()
    fun getMovementsLiveData():LiveData<List<Movement>> = movementsLiveData



}