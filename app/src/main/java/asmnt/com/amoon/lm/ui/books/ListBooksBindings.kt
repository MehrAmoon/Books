package asmnt.com.amoon.lm.ui.books

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import asmnt.com.amoon.lm.domain.model.Book
import com.bumptech.glide.Glide

// binding adapter methods
object ListBooksBindings {

    @JvmStatic
    @BindingAdapter("load_books")
    fun loadBooks(recyclerView: RecyclerView, books: List<Book>?) {
        recyclerView.adapter = if (books != null) ListBooksAdapter(books) else ListBooksAdapter(emptyList())
    }


    @JvmStatic
    @BindingAdapter("load_book_avatar")
    fun loadImage(view: ImageView, book: Book?) {
        Glide.with(view.context).load(book?.book_image).into(view)
    }

}