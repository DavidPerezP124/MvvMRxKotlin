package network

import io.reactivex.Observable
import model.Post
import retrofit2.http.GET

interface PostApi {
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}