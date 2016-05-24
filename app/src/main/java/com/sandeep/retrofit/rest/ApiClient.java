package com.sandeep.retrofit.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sandeep on 24/5/16.
 */
public class ApiClient {
    /*public static final String BASE_URL = "http://api.androidhive.info/";*/
    //public static final String BASE_URL = "http://api.geonames.org/";
    public static final String BASE_URL = "http://bookmytoll.raybiztech.net/bmtservices/api/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
