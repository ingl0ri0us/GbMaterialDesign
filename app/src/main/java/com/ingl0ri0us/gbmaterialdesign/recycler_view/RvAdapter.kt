package com.ingl0ri0us.gbmaterialdesign.recycler_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ingl0ri0us.gbmaterialdesign.R
import kotlinx.android.synthetic.main.cardview_item.view.*

class RvAdapter : RecyclerView.Adapter<RvAdapter.MyViewHolder>() {

    private val carLogos = listOf(
        DataItem(R.drawable.bmw, "BMW"),
        DataItem(R.drawable.ford, "Ford"),
        DataItem(R.drawable.honda, "Honda"),
        DataItem(R.drawable.hyundai, "Hyundai"),
        DataItem(R.drawable.mercedes, "Mercedes"),
        DataItem(R.drawable.nissan, "Nissan"),
        DataItem(R.drawable.peugeot, "Peugeot"),
        DataItem(R.drawable.toyota, "Toyota"),
        DataItem(R.drawable.volkswagen, "Volkswagen")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MyViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.cardview_item,
                parent,
                false
            )
        )

    override fun getItemCount(): Int = carLogos.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) =
        holder.bind(carLogos[position])

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: DataItem) = with(itemView) {
            cardview_image.setImageResource(item.image)
            cardview_text.text = item.name
        }
    }
}