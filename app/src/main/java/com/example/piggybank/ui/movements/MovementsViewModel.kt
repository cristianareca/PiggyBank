package com.example.piggybank.ui.movements

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.domain.movement.model.Movement
import com.example.domain.movement.usecase.GetMovementsUseCase
import com.example.piggybank.BaseViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.observers.DisposableSingleObserver
import javax.inject.Inject

class MovementsViewModel
@Inject
    constructor(
            private val getMovementsUseCase: GetMovementsUseCase
    ): BaseViewModel(){

    private val movementsLiveData= MutableLiveData<List<Movement>>()
    init {
        compositeDisposable.add(
                getMovementsUseCase.execute()
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeWith(object : DisposableSingleObserver<List<Movement>>(){
                            override fun onSuccess(t: List<Movement>?) {
                                movementsLiveData.value = t
                            }

                            override fun onError(e: Throwable?) {
                                //nothing
                            }
                        })
        )
    }

    fun getMovementsLiveData():LiveData <List<Movement>> = movementsLiveData
}





