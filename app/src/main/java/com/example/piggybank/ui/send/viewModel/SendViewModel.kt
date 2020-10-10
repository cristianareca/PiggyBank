package com.example.piggybank.ui.send.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.domain.send.model.Send
import com.example.domain.send.usecase.GetSendsUseCase
import com.example.piggybank.BaseViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.observers.DisposableSingleObserver
import javax.inject.Inject

class SendViewModel
@Inject
    constructor(
            private val getSendUseCase: GetSendsUseCase
    ): BaseViewModel(){

    private val sendLiveData= MutableLiveData<List<Send>>()
    private val sendErrorLiveData =MutableLiveData<Unit>()
    init {
        compositeDisposable.add(
                getSendUseCase.execute()
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeWith(object : DisposableSingleObserver<List<Send>>(){
                            override fun onSuccess(t: List<Send>?) {
                                print(t.toString())
                                sendLiveData.value = t
                            }

                            override fun onError(e: Throwable?) {
                                sendErrorLiveData.value= Unit
                            }
                        })
        )
    }

    fun getSendLiveData():LiveData <List<Send>> = sendLiveData
}





