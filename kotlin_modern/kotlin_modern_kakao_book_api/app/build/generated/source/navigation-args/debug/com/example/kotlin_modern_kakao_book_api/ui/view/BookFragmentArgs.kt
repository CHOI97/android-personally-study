package com.example.kotlin_modern_kakao_book_api.ui.view

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.example.kotlin_modern_kakao_book_api.`data`.model.Book
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class BookFragmentArgs(
  public val book: Book
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Book::class.java)) {
      result.set("book", this.book as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Book::class.java)) {
      result.set("book", this.book as Serializable)
    } else {
      throw UnsupportedOperationException(Book::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): BookFragmentArgs {
      bundle.setClassLoader(BookFragmentArgs::class.java.classLoader)
      val __book : Book?
      if (bundle.containsKey("book")) {
        if (Parcelable::class.java.isAssignableFrom(Book::class.java) ||
            Serializable::class.java.isAssignableFrom(Book::class.java)) {
          __book = bundle.get("book") as Book?
        } else {
          throw UnsupportedOperationException(Book::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__book == null) {
          throw IllegalArgumentException("Argument \"book\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"book\" is missing and does not have an android:defaultValue")
      }
      return BookFragmentArgs(__book)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): BookFragmentArgs {
      val __book : Book?
      if (savedStateHandle.contains("book")) {
        if (Parcelable::class.java.isAssignableFrom(Book::class.java) ||
            Serializable::class.java.isAssignableFrom(Book::class.java)) {
          __book = savedStateHandle.get<Book?>("book")
        } else {
          throw UnsupportedOperationException(Book::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__book == null) {
          throw IllegalArgumentException("Argument \"book\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"book\" is missing and does not have an android:defaultValue")
      }
      return BookFragmentArgs(__book)
    }
  }
}
