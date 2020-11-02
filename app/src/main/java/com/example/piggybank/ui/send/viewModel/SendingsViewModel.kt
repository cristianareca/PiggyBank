package com.example.piggybank.ui.send.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.domain.movement.model.Movement
import com.example.domain.movement.usecase.GetMovementsUseCase
import com.example.domain.send.model.Sending
import com.example.domain.send.usecase.GetSendingsUseCase
import com.example.piggybank.BaseViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.observers.DisposableSingleObserver
import javax.inject.Inject

class SendingsViewModel
@Inject
constructor(
        private val getSendingsUseCase: GetSendingsUseCase
): BaseViewModel(){

    private val sendingsLiveData= MutableLiveData<List<Sending>>()
    private val sendingsErrorLiveData =MutableLiveData<Unit>()
    init {
        compositeDisposable.add(
                getSendingsUseCase.execute()
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeWith(object : DisposableSingleObserver<List<Sending>>(){
                            override fun onSuccess(t: List<Sending>?) {
                                print(t.toString())
                                sendingsLiveData.value = t
                            }

                            override fun onError(e: Throwable?) {
                                sendingsErrorLiveData.value= Unit
                            }
                        })
        )
    }

    fun getSendingsLiveData():LiveData <List<Sending>> = sendingsLiveData
}



