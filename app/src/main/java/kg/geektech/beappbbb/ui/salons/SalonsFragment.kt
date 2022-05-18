package kg.geektech.beappbbb.ui.salons

import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import kg.geektech.beappbbb.base.BaseNavFragment
import kg.geektech.beappbbb.base.BaseViewModel
import kg.geektech.beappbbb.databinding.FragmentSalonsBinding

class SalonsFragment : BaseNavFragment<FragmentSalonsBinding, BaseViewModel>() {

    override val viewModel: SalonsViewModel by lazy {
        ViewModelProvider(this)[SalonsViewModel::class.java]
    }

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentSalonsBinding {
        return FragmentSalonsBinding.inflate(inflater)
    }


}