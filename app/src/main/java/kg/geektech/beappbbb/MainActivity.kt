package kg.geektech.beappbbb

import android.view.LayoutInflater
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kg.geektech.beappbbb.base.BaseActivity
import kg.geektech.beappbbb.base.BaseViewModel
import kg.geektech.beappbbb.databinding.ActivityMainBinding

class MainActivity : BaseActivity<BaseViewModel, ActivityMainBinding>() {

    override val viewModel: BaseViewModel by lazy {
        ViewModelProvider(this)[BaseViewModel::class.java]
    }

    override fun inflateViewBinding(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater)
    }

    override fun initView() {
        //инициализация actionBar
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        //инициализация bottom navigation
        val navView: BottomNavigationView = binding.navView
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment
        val navController = navHostFragment.navController
        val toolbar = binding.toolbar
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment, R.id.recordsFragment, R.id.salonsFragment, R.id.accountsFragment
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


    }
}