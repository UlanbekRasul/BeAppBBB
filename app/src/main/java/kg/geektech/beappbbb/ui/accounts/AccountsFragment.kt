package kg.geektech.beappbbb.ui.accounts

import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import kg.geektech.beappbbb.base.BaseNavFragment
import kg.geektech.beappbbb.base.BaseViewModel
import kg.geektech.beappbbb.databinding.FragmentAccountsBinding

class AccountsFragment : BaseNavFragment<FragmentAccountsBinding, BaseViewModel>() {

    override val viewModel: AccountViewModel by lazy {
        ViewModelProvider(this)[AccountViewModel::class.java]
    }

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentAccountsBinding {
        return FragmentAccountsBinding.inflate(inflater)
    }

}