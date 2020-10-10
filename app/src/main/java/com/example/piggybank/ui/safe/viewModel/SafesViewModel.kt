package com.example.piggybank.ui.safe.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.domain.safe.model.Safe
import com.example.domain.safe.usecase.GetSafesUseCase
import com.example.piggybank.BaseViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.observers.DisposableSingleObserver
import javax.inject.Inject

class SafesViewModel
@Inject
    constructor(
            private val getSafesUseCase: GetSafesUseCase
    ): BaseViewModel(){

    private val safesLiveData= MutableLiveData<List<Safe>>()
    private val safesErrorLiveData =MutableLiveData<Unit>()
    init {
        compositeDisposable.add(
                getSafesUseCase.execute()
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeWith(object : DisposableSingleObserver<List<Safe>>(){
                            override fun onSuccess(t: List<Safe>?) {
                                safesLiveData.value = t
                            }

                            override fun onError(e: Throwable?) {
                                safesErrorLiveData.value= Unit
                            }
                        })
        )
    }

    fun getSafesLiveData():LiveData <List<Safe>> = safesLiveData
}





