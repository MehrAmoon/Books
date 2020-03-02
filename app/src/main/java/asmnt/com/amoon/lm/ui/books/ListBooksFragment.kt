package asmnt.com.amoon.lm.ui.books


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.library.BuildConfig
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import asmnt.com.amoon.lm.R
import asmnt.com.amoon.lm.data.remote.response.Status
import asmnt.com.amoon.lm.databinding.FragmentListBooksBinding
import com.google.android.material.snackbar.Snackbar
import javax.inject.Inject
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import asmnt.com.amoon.lm.domain.model.Book
import dagger.android.support.DaggerFragment



class ListBooksFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel: ListBooksViewModel

    private lateinit var binding: FragmentListBooksBinding

    val data: MutableLiveData<List<Book>> = MutableLiveData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(ListBooksViewModel::class.java)

        observeLoadingStatus()
        observeResponse()
        viewModel.loadData()

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_list_books, container, false)
        binding.recyclerView.layoutManager = LinearLayoutManager(activity)
        binding.swipeContainer.setOnRefreshListener(viewModel::loadData)
        return binding.root
    }

    // observe loading status for using swip
    private fun observeResponse() {
        viewModel.loadingStatus.observe(
            this,
            Observer { isLoading -> binding.swipeContainer.isRefreshing = isLoading ?: false })
    }

    // observe response and bind them to the view
    private fun observeLoadingStatus() {
        viewModel.response.observe(
            this,
            Observer { response ->
                if (response != null && response.status == Status.SUCCESS) {
                    data.value = response.data
                    binding.books = response.data
                    binding.executePendingBindings()
                } else {
                    if ((response != null && response.status == Status.ERROR) && BuildConfig.DEBUG) {
                        Log.e("get books error", response.error.toString())
                    }
                    Snackbar.make(binding.root, R.string.load_data_error, Snackbar.LENGTH_LONG).show()
                }
            }
        )
    }

    // method for sorting books ascending
    fun sortRankingAsc() {
        binding?.books = data.value?.sortedBy { it.rank }
        binding.notifyChange()
    }

    // method for sorting books descending
    fun sortWeeksDes() {
        binding.books = data.value?.sortedByDescending { it.weeks_on_list }
        binding.notifyChange()
    }


}