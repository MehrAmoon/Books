package asmnt.com.amoon.lm.ui.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import asmnt.com.amoon.lm.data.remote.response.Response

// base view model for getting response and loading status
abstract class BaseViewModel<T> : ViewModel() {

    val response: MutableLiveData<Response<T>> = MutableLiveData()

    val loadingStatus: MutableLiveData<Boolean> = MutableLiveData()

    abstract fun loadData()

}