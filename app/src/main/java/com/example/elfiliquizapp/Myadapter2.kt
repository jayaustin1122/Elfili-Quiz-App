package com.example.elfiliquizapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.elfiliquizapp.model.Datas

class Myadapter2(private val context: Context) :
    RecyclerView.Adapter<Myadapter2.ViewHolder>() {

    private var dataList2: List<Datas> = listOf()
    private var itemClickListener2: OnItemClickListener2? = null

    interface OnItemClickListener2 {
        fun onItemClick2(data: Datas)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val imageView: ImageView = itemView.findViewById(R.id.imgBookCover)
        val textTitle: TextView = itemView.findViewById(R.id.tvTitle)
  //      val textContent: TextView = itemView.findViewById(R.id.tvAuthor)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                itemClickListener2?.onItemClick2(dataList2[position])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList2[position]
        holder.imageView.setImageResource(data.imageResId)
        holder.textTitle.text = context.getString(data.titleResId)
   //     holder.textContent.text = context.getString(data.contentResId)
    }

    override fun getItemCount(): Int {
        return dataList2.size
    }

    fun setDataList(newList: List<Datas>) {
        dataList2 = newList
        notifyDataSetChanged()
    }

    fun setOnItemClickListener(listener: OnItemClickListener2) {
        this.itemClickListener2 = listener
    }
}

