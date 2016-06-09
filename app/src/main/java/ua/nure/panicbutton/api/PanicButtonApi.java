package ua.nure.panicbutton.api;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import ua.nure.panicbutton.model.MyIP;

public interface PanicButtonApi {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://jsonip.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @GET("/")
    Call<MyIP> getMyIP();
}

