package com.azp.shopapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.azp.shopapp.adapter.LatestAdapter
import com.azp.shopapp.model.LatestModel
import kotlinx.android.synthetic.main.fragment_latest_arrival.*

/**
 * A simple [Fragment] subclass.
 */
class LatestArrivalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(
            R.layout.fragment_latest_arrival,
            container, false)

        var latestRecycler = view.findViewById<RecyclerView>(R.id.recycler_latest)

        var latestList = ArrayList<LatestModel>()
        latestList.add(LatestModel("Camera",R.drawable.camera))
        latestList.add(LatestModel("Coffee Maker",R.drawable.coffee_maker))

        var latestAdapter = LatestAdapter(latestList)

        latestRecycler.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        latestRecycler.adapter = latestAdapter

        return view
    }
}
