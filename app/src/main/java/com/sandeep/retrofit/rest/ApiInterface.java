package com.sandeep.retrofit.rest;

import com.sandeep.retrofit.model.ContactsModel;
import com.sandeep.retrofit.model.LocationsModel;
import com.sandeep.retrofit.model.LoginModel;
import com.sandeep.retrofit.model.LoginRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by sandeep on 24/5/16.
 */
public interface ApiInterface {
    @GET("contacts/")
    Call<ContactsModel> getContactsList();

    @GET("citiesJSON")
    Call<LocationsModel> getLocations(@Query("north") String north, @Query("south") String south, @Query("east") String east, @Query("west") String west, @Query("lang") String lang, @Query("username") String username);

    @POST("userlogin")
    Call<LoginModel> userLogin(@Body LoginRequest loginRequest);
}
