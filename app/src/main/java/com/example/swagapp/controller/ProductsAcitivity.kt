package com.example.swagapp.controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.recyclerview.widget.GridLayoutManager
import com.example.swagapp.R
import com.example.swagapp.adapters.ProductsAdapter
import com.example.swagapp.services.DataService
import com.example.swagapp.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products_acitivity.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_acitivity)

       val categoryType= intent.getStringExtra(EXTRA_CATEGORY)
       adapter= ProductsAdapter(this,DataService.getProducts(categoryType.toString()))





        val layoutManager=GridLayoutManager(this,2)
        productsListView.layoutManager=layoutManager
        productsListView.adapter=adapter
    }
}