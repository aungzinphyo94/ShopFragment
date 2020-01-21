package com.azp.shopapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azp.shopapp.R
import com.azp.shopapp.model.LatestModel
import kotlinx.android.synthetic.main.item_latest.view.*

class LatestViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var name = itemView.findViewById<TextView>(R.id.txt_name)
    var image = itemView.findViewById<ImageView>(R.id.image_latest)
}
class LatestAdapter(var latestList:ArrayList<LatestModel>) : RecyclerView.Adapter<LatestViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_latest,parent,false
        )
        return LatestViewHolder(view)
    }

    override fun getItemCount(): Int {
        return latestList.size
    }

    override fun onBindViewHolder(holder: LatestViewHolder, position: Int) {
        holder.name.text = latestList[position].name
        holder.image.setImageResource(latestList[position].image)
    }

}