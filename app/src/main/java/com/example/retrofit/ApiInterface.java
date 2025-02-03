package com.example.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("posts/1")
    public Call<Post> getPost();
}
