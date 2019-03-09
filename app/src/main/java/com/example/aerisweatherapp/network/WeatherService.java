package com.example.aerisweatherapp.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public class WeatherService {
    @GET("forecasts/:auto");
    Call<> (@Query("clientID"), String clientID, @Query("clientSecret") String clientSecret);
}
