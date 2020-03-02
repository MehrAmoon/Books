package asmnt.com.amoon.lm.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import asmnt.com.amoon.lm.R
import asmnt.com.amoon.lm.databinding.ActivityMainBinding
import dagger.android.support.DaggerAppCompatActivity
import asmnt.com.amoon.lm.ui.common.ViewPagerAdapter
import asmnt.com.amoon.lm.ui.books.ListBooksFragment
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.toolbar.*
import javax.inject.Inject


class MainActivity : HasSupportFragmentInjector, DaggerAppCompatActivity(){

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    private lateinit var binding: ActivityMainBinding

    var listBooksFragment = ListBooksFragment()

    private val TAG = "MehrSort"

    override fun supportFragmentInjector() = dispatchingAndroidInjector

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupViews()
    }

    private fun setupViews() {
        // create mainActivity binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // button for ascending sort
        binding.includeToolbar.buttonAsc.setOnClickListener(View.OnClickListener
        {
            Log.d(TAG, "clicked buttonAsc")
            listBooksFragment.sortRankingAsc()
            button_asc.setBackgroundResource(R.color.button_pressed)
            button_des.setBackgroundResource(R.drawable.button_color)
        })

        // button for descending sort
        binding.includeToolbar.buttonDes.setOnClickListener(View.OnClickListener
        {
            Log.d(TAG, "clicked buttonDes")
            listBooksFragment.sortWeeksDes()
            button_des.setBackgroundResource(R.color.button_pressed)
            button_asc.setBackgroundResource(R.drawable.button_color)
        })
        setupToolbar()
        setupFragment()
    }


    private fun setupToolbar() {
        // setup toolbar and naming it
        setSupportActionBar(binding.includeToolbar.toolbar)
        supportActionBar?.title = getString(R.string.app_name)
    }


    private fun setupFragment() {
        //attach fragment to viewpager
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(listBooksFragment, getString(R.string.books))
        binding.viewPager.adapter = adapter
    }

}