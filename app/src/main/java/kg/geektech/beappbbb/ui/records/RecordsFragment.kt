package kg.geektech.beappbbb.ui.records

import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import kg.geektech.beappbbb.base.BaseNavFragment
import kg.geektech.beappbbb.base.BaseViewModel
import kg.geektech.beappbbb.databinding.FragmentRecordsBinding

class RecordsFragment : BaseNavFragment<FragmentRecordsBinding, BaseViewModel>() {

    override val viewModel: RecordsViewModel by lazy {
        ViewModelProvider(this)[RecordsViewModel::class.java]
    }

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentRecordsBinding {
        return FragmentRecordsBinding.inflate(inflater)
    }


}