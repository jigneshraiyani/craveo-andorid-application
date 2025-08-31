package com.example.craveto.api

import com.example.craveto.models.UserRequest
import com.example.craveto.models.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserAPI {
    @POST(value = "/users/signup")
    suspend fun signup(@Body userRequest: UserRequest) : Response<UserResponse>

    @POST(value = "/users/signin")
    suspend fun signin(@Body userRequest: UserRequest) : Response<UserResponse>
}