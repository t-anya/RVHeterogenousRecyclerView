package com.example.rvheterogenous

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view_1.view.*
import kotlinx.android.synthetic.main.item_view_2.view.*

class MyAdapter(context: Context, list: ArrayList<Data>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object{
        const val VIEW_TYPE_ONE = 1
        const val VIEW_TYPE_TWO = 2
    }

    private val context: Context = context
    var list: ArrayList<Data> = list

    private inner class View1VH(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(position: Int){
            itemView.tv_1.text = list[position].text
        }
    }

    private inner class View2VH(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(position: Int){
            itemView.tv_2.text = list[position].text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType == VIEW_TYPE_ONE){
            return View1VH(LayoutInflater.from(context).inflate(R.layout.item_view_1,parent,false))
        }
            return View2VH(LayoutInflater.from(context).inflate(R.layout.item_view_2,parent,false))
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(list[position].viewType ==  VIEW_TYPE_ONE){
            (holder as View1VH).bind(position)
        }else{
            (holder as View2VH).bind(position)
        }
        
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].viewType
    }

}