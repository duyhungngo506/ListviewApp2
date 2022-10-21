package com.example.lisviewapp2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_items.view.*

class MyAdapter(val context: Context, var employeeList: List<MyDataItem>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var fullName: TextView
        var address: TextView
        var phone: TextView
        var avatar: ImageView
        init {
            fullName = itemView.txtName
            address = itemView.txtAddress
            phone = itemView.txtPhone
            avatar = itemView.imageAvatar
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView =LayoutInflater.from(context).inflate(R.layout.row_items,parent,false)
        return  ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.fullName.text = employeeList[position].fullName.toString()
        holder.address.text = employeeList[position].address.toString()
        holder.phone.text = employeeList[position].phone.toString()
    }

    override fun getItemCount(): Int {
        return employeeList.size
    }
}