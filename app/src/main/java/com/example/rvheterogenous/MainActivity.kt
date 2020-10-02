package com.example.rvheterogenous

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataList = ArrayList<Data>()
        dataList.add(Data(MyAdapter.VIEW_TYPE_ONE,"This is View 1"))
        dataList.add(Data(MyAdapter.VIEW_TYPE_TWO,"This is View 2"))
        dataList.add(Data(MyAdapter.VIEW_TYPE_ONE,"This is View 3"))
        dataList.add(Data(MyAdapter.VIEW_TYPE_TWO,"This is View 4"))
        dataList.add(Data(MyAdapter.VIEW_TYPE_ONE,"This is View 5"))
        dataList.add(Data(MyAdapter.VIEW_TYPE_TWO,"This is View 6"))
        dataList.add(Data(MyAdapter.VIEW_TYPE_ONE,"This is View 7"))
        dataList.add(Data(MyAdapter.VIEW_TYPE_TWO,"This is View 8"))
        dataList.add(Data(MyAdapter.VIEW_TYPE_ONE,"This is View 9"))
        dataList.add(Data(MyAdapter.VIEW_TYPE_TWO,"This is View 10"))
        dataList.add(Data(MyAdapter.VIEW_TYPE_ONE," This is View 11"))
        dataList.add(Data(MyAdapter.VIEW_TYPE_TWO,"This is View 12"))
        dataList.add(Data(MyAdapter.VIEW_TYPE_ONE,"This is View 13"))
        dataList.add(Data(MyAdapter.VIEW_TYPE_TWO,"This is View 14"))
        dataList.add(Data(MyAdapter.VIEW_TYPE_ONE,"This is View 15"))

        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = MyAdapter(this,dataList)


    }
}