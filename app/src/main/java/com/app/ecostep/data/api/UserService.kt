package com.app.ecostep.data.api
import com.app.ecostep.domain.model.User
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface UserService {

    @POST("api/users/create-user")
    suspend fun createUser(
        @Header("Authorization") token: String,
        @Body user: User
    ): Response<Unit>

    @GET("api/users/get-user")
    suspend fun  getUser(
        @Header("Authorization") token: String,
        @Query("firebaseId") firebaseId: String
    ): Response<Unit>
}