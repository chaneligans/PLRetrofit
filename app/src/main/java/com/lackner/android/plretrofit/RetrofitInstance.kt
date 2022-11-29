package com.lackner.android.plretrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val api: TodoApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create()) // Tells Retrofit how to parse the JSON data into the data class
            .build()
            .create(TodoApi::class.java)
    }
}