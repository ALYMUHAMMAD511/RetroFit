package com.example.retrofit;

import static com.example.retrofit.MainActivity.QUERY;
import static com.example.retrofit.MainActivity.RESOURCE_URL;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET(RESOURCE_URL)
    Call<List<Post>> getPost(@Query(QUERY) String userId);
}