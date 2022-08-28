package com.example.mainui

import android.app.Service
import android.content.Intent
import android.os.IBinder
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Url

interface INetworkService  {

    //GET 예제
    @GET("posts/1")
    fun getUser(): Call<UserListModel>

    @GET("posts/{page}")
    fun getUserPage(@Path("page") page: String): Call<UserListModel>
}