package com.example.piggybank.ui.payments.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.domain.payment.model.Payment
import com.example.domain.payment.usecase.GePaymenttUseCase
import com.example.piggybank.BaseViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.observers.DisposableSingleObserver
import javax.inject.Inject

class PaymentsViewModel
@Inject
    constructor(
            private val getPaymentsUseCase: GePaymenttUseCase
    ): BaseViewModel(){

    private val paymentsLiveData= MutableLiveData<List<Payment>>()
    private val paymentsErrorLiveData =MutableLiveData<Unit>()
    init {
        compositeDisposable.add(
                getPaymentsUseCase.execute()
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeWith(object : DisposableSingleObserver<List<Payment>>(){
                            override fun onSuccess(t: List<Payment>?) {
                                print(t.toString())
                                paymentsLiveData.value = t
                            }

                            override fun onError(e: Throwable?) {
                                paymentsErrorLiveData.value= Unit
                            }
                        })
        )
    }

    fun getPaymentsLiveData():LiveData <List<Payment>> = paymentsLiveData
}





