package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data=ArrayList<ModelProduct>()
        data.add(ModelProduct("علیرضا",20009104587985,"https://parsstock.ir/LargePhotos/10030/1059903-%D8%AA%D8%B5%D9%88%DB%8C%D8%B1-%D8%A7%D8%B2-%D9%86%D9%85%D8%A7%D8%AF-%DA%A9%D8%A7%D8%B1%D8%A8%D8%B1.jpg"))
        data.add(ModelProduct("محمد",200091287496512,"https://parsstock.ir/LargePhotos/10030/1059903-%D8%AA%D8%B5%D9%88%DB%8C%D8%B1-%D8%A7%D8%B2-%D9%86%D9%85%D8%A7%D8%AF-%DA%A9%D8%A7%D8%B1%D8%A8%D8%B1.jpg"))
        data.add(ModelProduct("رضا",20009368759878,"https://parsstock.ir/LargePhotos/10030/1059903-%D8%AA%D8%B5%D9%88%DB%8C%D8%B1-%D8%A7%D8%B2-%D9%86%D9%85%D8%A7%D8%AF-%DA%A9%D8%A7%D8%B1%D8%A8%D8%B1.jpg"))
        data.add(ModelProduct("امیر",200090554789655,"https://parsstock.ir/LargePhotos/10030/1059903-%D8%AA%D8%B5%D9%88%DB%8C%D8%B1-%D8%A7%D8%B2-%D9%86%D9%85%D8%A7%D8%AF-%DA%A9%D8%A7%D8%B1%D8%A8%D8%B1.jpg"))

        val recycler_view=findViewById<RecyclerView>(R.id.Recycler_view)
        recycler_view.layoutManager=LinearLayoutManager(this)

        val adapter= Adapterproduct(data)
        recycler_view.adapter=adapter


    }
}