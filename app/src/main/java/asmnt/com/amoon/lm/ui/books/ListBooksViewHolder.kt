package asmnt.com.amoon.lm.ui.books

import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import asmnt.com.amoon.lm.databinding.ListBooksItemBinding


class ListBooksViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    // binding for book view holder
    val binding: ListBooksItemBinding? = DataBindingUtil.bind(view)

}