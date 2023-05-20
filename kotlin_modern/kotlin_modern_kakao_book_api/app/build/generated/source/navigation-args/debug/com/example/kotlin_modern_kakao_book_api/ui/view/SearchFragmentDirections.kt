package com.example.kotlin_modern_kakao_book_api.ui.view

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.kotlin_modern_kakao_book_api.R
import com.example.kotlin_modern_kakao_book_api.`data`.model.Book
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class SearchFragmentDirections private constructor() {
  private data class ActionFragmentSearchToFragmentBook(
    public val book: Book
  ) : NavDirections {
    public override val actionId: Int = R.id.action_fragment_search_to_fragment_book

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Book::class.java)) {
          result.putParcelable("book", this.book as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Book::class.java)) {
          result.putSerializable("book", this.book as Serializable)
        } else {
          throw UnsupportedOperationException(Book::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionFragmentSearchToFragmentBook(book: Book): NavDirections =
        ActionFragmentSearchToFragmentBook(book)
  }
}
