package kg.geektech.beappbbb.ui.service

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kg.geektech.beappbbb.R
import kg.geektech.beappbbb.base.BaseNavFragment
import kg.geektech.beappbbb.base.BaseViewModel
import kg.geektech.beappbbb.databinding.FragmentServicesBinding

class ServicesFragment : BaseNavFragment<FragmentServicesBinding, BaseViewModel>() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private lateinit var adapter: ServiceAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        adapter = ServiceAdapter()
        binding.rvCharacter.adapter = adapter
        binding.rvCharacter.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun initView() {
    }

    override val viewModel: BaseViewModel
        get() = TODO("Not yet implemented")

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentServicesBinding {
        return FragmentServicesBinding.inflate(inflater)
    }

}