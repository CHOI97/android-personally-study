//package com.example.kotlin_modern_kakao_book_api.ui.viewmodel
//
//import android.os.Bundle
//import androidx.lifecycle.AbstractSavedStateViewModelFactory
//import androidx.lifecycle.SavedStateHandle
//import androidx.lifecycle.ViewModel
//import androidx.savedstate.SavedStateRegistryOwner
//import androidx.work.WorkManager
//import com.example.kotlin_modern_kakao_book_api.data.repository.BookSearchRepository
//
//@Suppress("UNCHECKED_CAST")
////class BookSearchViewModelProviderFactory(
////    private val bookSearchRepository: BookSearchRepository
////) : ViewModelProvider.Factory {
////    override fun <T : ViewModel> create(modelClass: Class<T>): T {
////        if (modelClass.isAssignableFrom(BookSearchViewModel::class.java)) {
////            return BookSearchViewModel(bookSearchRepository) as T
////        }
////        throw IllegalArgumentException("ViewModel class not found")
////    }
////}
//class BookSearchViewModelProviderFactory(
//    private val bookSearchRepository: BookSearchRepository,
//    private val workManager: WorkManager,
//    owner: SavedStateRegistryOwner,
//    defaultArgs: Bundle? = null,
//) : AbstractSavedStateViewModelFactory(owner, defaultArgs) {
//    override fun <T : ViewModel> create(
//        key: String,
//        modelClass: Class<T>,
//        handle: SavedStateHandle
//    ): T {
//        if (modelClass.isAssignableFrom(BookSearchViewModel::class.java)) {
//            return BookSearchViewModel(bookSearchRepository, handle, workManager) as T
//        }
//        throw IllegalArgumentException("ViewModel class not found")
//    }
//}