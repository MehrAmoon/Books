package asmnt.com.amoon.lm.ui.books

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import asmnt.com.amoon.lm.R
import asmnt.com.amoon.lm.domain.model.Book
import asmnt.com.amoon.lm.ui.base.BaseAdapter


class ListBooksAdapter constructor(list: List<Book>) : BaseAdapter<Book>(list) {

    override fun onCreateViewHolderBase(
        parent: ViewGroup?,
        viewType: Int
    ): RecyclerView.ViewHolder {
        return ListBooksViewHolder(
            LayoutInflater
                .from(parent?.context)
                .inflate(R.layout.list_books_item, parent, false)
        )
    }

    override fun onBindViewHolderBase(holder: RecyclerView.ViewHolder?, position: Int) {
        val binding = (holder as ListBooksViewHolder).binding
        val book = list[position]
        binding?.book = book
    }


}