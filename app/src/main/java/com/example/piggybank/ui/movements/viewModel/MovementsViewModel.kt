package com.example.piggybank.ui.movements.viewModel

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
    private val movementsErrorLiveData =MutableLiveData<Unit>()
    init {
        compositeDisposable.add(
                getMovementsUseCase.execute()
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeWith(object : DisposableSingleObserver<List<Movement>>(){
                            override fun onSuccess(t: List<Movement>?) {
                                print(t.toString())
                                movementsLiveData.value = t
                            }

                            override fun onError(e: Throwable?) {
                                movementsErrorLiveData.value= Unit
                            }
                        })
        )
    }

    fun getMovementsLiveData():LiveData <List<Movement>> = movementsLiveData
}



