package com.example.kotlin_modern_kakao_book_api

import com.example.kotlin_modern_kakao_book_api.data.db.BookSearchDaoTest
import com.example.kotlin_modern_kakao_book_api.ui.view.MainActivityTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@ExperimentalCoroutinesApi
@Suite.SuiteClasses(
    MainActivityTest::class,
    BookSearchDaoTest::class
)
class InstrumentedTestSuite