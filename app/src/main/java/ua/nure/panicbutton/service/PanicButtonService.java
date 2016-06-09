package ua.nure.panicbutton.service;

import retrofit2.Callback;
import ua.nure.panicbutton.api.PanicButtonApi;
import ua.nure.panicbutton.model.MyIP;

public class PanicButtonService {

    public static void getMyIP(Callback<MyIP> callback) {
        PanicButtonApi panicButtonApi = PanicButtonApi.retrofit.create(PanicButtonApi.class);
        panicButtonApi.getMyIP().enqueue(callback);
    }
}
