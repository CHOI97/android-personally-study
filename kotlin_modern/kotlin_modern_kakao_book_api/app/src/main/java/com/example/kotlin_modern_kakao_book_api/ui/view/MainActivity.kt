package com.example.kotlin_modern_kakao_book_api.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.kotlin_modern_kakao_book_api.R
import com.example.kotlin_modern_kakao_book_api.databinding.ActivityMainBinding
import com.example.kotlin_modern_kakao_book_api.ui.viewmodel.BookSearchViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    lateinit var bookSearchViewModel: BookSearchViewModel
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

//    private val Context.dataStore by preferencesDataStore(DATASTORE_NAME)
//    private val workManager = WorkManager.getInstance(application)

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//        setupBottomNavigationView()
//        if (savedInstanceState == null) {
//            binding.bottomNavigationMenu.selectedItemId = R.id.fragment_search
//        }
        setupJetpackNavigation()
//        val database = BookSearchDatabase.getInstance(this)
//        val bookSearchRepository = BookSearchRepositoryImpl(database, dataStore)
//        val factory = BookSearchViewModelProviderFactory(bookSearchRepository, workManager, this)
//        bookSearchViewModel = ViewModelProvider(this, factory)[BookSearchViewModel::class.java]
    }

    private fun setupJetpackNavigation() {
        val host = supportFragmentManager
            .findFragmentById(R.id.booksearch_nav_host_fragment) as NavHostFragment ?: return
        navController = host.navController
        binding.bottomNavigationMenu.setupWithNavController(navController)

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.fragment_favorite, R.id.fragment_search, R.id.fragment_settings
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
//
//    private fun setupBottomNavigationView() {
//        binding.bottomNavigationMenu.setOnItemSelectedListener { item ->
//            when (item.itemId) {
//                R.id.fragment_favorite -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.frame_layout, FavoriteFragment())
//                        .commit()
//                    true
//                }
//                R.id.fragment_search -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.frame_layout, SearchFragment())
//                        .commit()
//                    true
//                }
//                R.id.fragment_setting -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.frame_layout, SettingsFragment())
//                        .commit()
//                    true
//                }
//                else -> false
//            }
//        }
//    }

}