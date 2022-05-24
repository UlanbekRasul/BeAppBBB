package kg.geektech.beappbbb.ui.salons

import android.view.LayoutInflater
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import kg.geektech.beappbbb.R
import kg.geektech.beappbbb.base.BaseNavFragment
import kg.geektech.beappbbb.base.BaseViewModel
import kg.geektech.beappbbb.databinding.FragmentSalonsBinding
import kg.geektech.beappbbb.ui.service.ServicesFragment

class SalonsFragment : BaseNavFragment<FragmentSalonsBinding, BaseViewModel>() {



    override val viewModel: SalonsViewModel by lazy {
        ViewModelProvider(this)[SalonsViewModel::class.java]
    }

    private fun onChanged() {
        val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
        transaction.replace(
            R.id.nav_host_fragment_activity_main,
            ServicesFragment()
        )
                    transaction.commit()
    }

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentSalonsBinding {
        return FragmentSalonsBinding.inflate(inflater)
    }


}