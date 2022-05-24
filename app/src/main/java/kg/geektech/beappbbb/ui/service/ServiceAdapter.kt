package kg.geektech.beappbbb.ui.service

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.geektech.beappbbb.databinding.ItemServicesBinding
import kg.geektech.beappbbb.ui.service.extensions.glide
import kg.geektech.beappbbb.ui.service.model.ServiceModel

class ServiceAdapter : RecyclerView.Adapter<ServiceAdapter.ServiceViewHolder>() {
    private var serviceList = arrayListOf<ServiceModel>()


    inner class ServiceViewHolder
        (private val binding: ItemServicesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(items: ServiceModel) {
            binding.apply {
                tvPrice.text = items.servicePrice
                tvServiceName.text = items.serviceName
                tvTime.text = items.serviceTime
                ivMaster.glide(items.imageMaster.toString())
            }
        }
    }

    fun setList(list: ArrayList<ServiceModel>) {
        this.serviceList = list
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ServiceAdapter.ServiceViewHolder {
        val binding =
            ItemServicesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ServiceViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ServiceViewHolder, position: Int) {
        holder.onBind(serviceList[position])
    }

    override fun getItemCount(): Int {
        return serviceList.size
    }
}