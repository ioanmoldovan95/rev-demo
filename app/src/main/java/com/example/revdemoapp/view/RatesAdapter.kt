package com.example.revdemoapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.revdemoapp.R
import com.example.revdemoapp.model.Rate

class RatesAdapter(private val ratesList: List<Rate>, private val setAmount: Double, private val rateCallback: RateCallback) : RecyclerView.Adapter<RateViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
        = RateViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rate_item, parent, false))

    override fun onBindViewHolder(holder: RateViewHolder, position: Int) {
        holder.rootView.setOnClickListener {
            rateCallback.onRateClicked(position)
        }
        holder.bind(ratesList[position], setAmount)
    }

    override fun getItemCount(): Int {
        return ratesList.size
    }
}

class RateViewHolder(val rootView: View) : RecyclerView.ViewHolder(rootView) {
    val flagIconImageView = itemView.findViewById<ImageView>(R.id.flag_icon_image_view)
    val currencyAbbrevTextView = itemView.findViewById<TextView>(R.id.currency_abbrev_text_view)
    val currencyNameTextView = itemView.findViewById<TextView>(R.id.currency_name_text_view)
    val rateEditText = itemView.findViewById<EditText>(R.id.rate_edit_text)

    fun bind(rate: Rate, setAmount: Double) {
        //TODO load flag icon
        currencyAbbrevTextView.text = rate.currencyAbbrev
        currencyNameTextView.text = rate.currencyName
        //TODO make that fkin rate edit text work
    }
}
