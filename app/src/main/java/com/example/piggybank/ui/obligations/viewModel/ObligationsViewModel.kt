package com.example.piggybank.ui.obligations.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.domain.movement.model.Movement
import com.example.domain.movement.usecase.GetMovementsUseCase
import com.example.domain.obligation.model.Obligation
import com.example.domain.obligation.usecase.GetObligationUseCase
import com.example.piggybank.BaseViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.observers.DisposableSingleObserver
import javax.inject.Inject

class ObligationViewModel
@Inject
constructor(
        private val getObligationUseCase: GetObligationUseCase
): BaseViewModel(){

    private val obligationLiveData= MutableLiveData<List<Obligation>>()
    private val obligationErrorLiveData =MutableLiveData<Unit>()
    init {
        compositeDisposable.add(
                getObligationUseCase.execute()
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeWith(object : DisposableSingleObserver<List<Obligation>>(){
                            override fun onSuccess(t: List<Obligation>?) {
                                print(t.toString())
                                obligationLiveData.value = t
                            }

                            override fun onError(e: Throwable?) {
                                obligationErrorLiveData.value= Unit
                            }
                        })
        )
    }

    fun getObligationLiveData():LiveData <List<Obligation>> = obligationLiveData
}