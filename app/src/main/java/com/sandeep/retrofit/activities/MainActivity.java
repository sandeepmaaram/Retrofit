package com.sandeep.retrofit.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sandeep.retrofit.R;
import com.sandeep.retrofit.model.ErrorModel;
import com.sandeep.retrofit.model.LoginModel;
import com.sandeep.retrofit.model.LoginRequest;
import com.sandeep.retrofit.rest.ApiClient;
import com.sandeep.retrofit.rest.ApiInterface;
import com.sandeep.retrofit.utils.ErrorUtils;
import com.sandeep.retrofit.utils.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        LoginRequest.Request request = new LoginRequest().new Request();
        request.login = "9502770636";
        request.password = "12345678";
        LoginRequest login = new LoginRequest();
        login.request = request;
        Call<LoginModel> call = apiService.userLogin(login);
        call.enqueue(new Callback<LoginModel>() {
            @Override
            public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {
                if (response.isSuccessful()) {
                    Logger.showLogInfo("Message ::" + response.body().statusMessage);
                    Logger.showLogInfo("Body ::" + response.body().successMessage);
                } else {
                    // parse the response body …
                    ErrorModel error = ErrorUtils.parseError(response);
                    Logger.showLogInfo("Message ::" + error.statusMessage);
                    Logger.showLogInfo("Body ::" + error.successMessage);

                }
            }

            @Override
            public void onFailure(Call<LoginModel> call, Throwable t) {
                Logger.showError(t.toString());
            }
        });
        /*Call<LocationsModel> call = apiService.getLocations("44.1", "-9.9", "-22.4", "55.2", "de", "demo123");
        call.enqueue(new Callback<LocationsModel>() {
            @Override
            public void onResponse(Call<LocationsModel> call, Response<LocationsModel> response) {
                Logger.showLogInfo("Message ::" + response.message());
                Logger.showLogInfo("URL ::" + call.request().url());
                Logger.showLogInfo("Body ::" + response.body());
                Logger.showLogInfo("isSuccessful ::" + response.isSuccessful());
                Logger.showLogInfo("Code::" + response.code());
                if (response.code() == 200) {
                    Logger.showLogInfo("Status::" + response.body().status);
                    for (GeoNames geoNames : response.body().geoNamesList) {
                        Logger.showLogInfo("toponymName::" + geoNames.toponymName);
                    }
                }
            }

            @Override
            public void onFailure(Call<LocationsModel> call, Throwable t) {
                Logger.showLogInfo("Error ::" + t.toString());
            }
        });*/
        /*Call<ContactsModel> call = apiService.getContactsList();
        call.enqueue(new Callback<ContactsModel>() {
            @Override
            public void onResponse(Call<ContactsModel> call, Response<ContactsModel> response) {
                Logger.showLogInfo("Message ::" + response.message());
                Logger.showLogInfo("Body ::" + response.body());
                Logger.showLogInfo("isSuccessful ::" + response.isSuccessful());
            }

            @Override
            public void onFailure(Call<ContactsModel> call, Throwable t) {
                Logger.showError(t.toString());
            }
        });*/
    }
}
