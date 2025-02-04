package com.example.retrofit;

import static com.example.retrofit.MainActivity.RESOURCE_URL;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET(RESOURCE_URL)
    public Call<Post> getPost();
}