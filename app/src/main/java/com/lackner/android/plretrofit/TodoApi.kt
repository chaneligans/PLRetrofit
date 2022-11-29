package com.lackner.android.plretrofit

import retrofit2.Response
import retrofit2.http.GET

// Define all the functions we need to access our API
interface TodoApi {

    /**
     * 4 types of requests:
     * 1. GET - Retrieve data
     * 2. POST - Post data from device to remote
     * 3. PUT - Update data on the server
     * 4. DELETE - Delete data
     */

    // @GET takes a parameter of whatever is after the base URL
    // The function can take @Query() parameters to attach queries to the request
    // "suspend" automatically executes the function in a coroutine
    @GET("/todos")
    suspend fun getTodos(): Response<List<Todo>>

    // Example of a POST request
    // Pass into the function a @Body parameter
//    @POST("/createTodo")
//    fun createTodo(@Body todo: Todo): Response<CreateTodoResponse>

}