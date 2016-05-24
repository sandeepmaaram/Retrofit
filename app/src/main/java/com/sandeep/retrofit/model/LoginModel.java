package com.sandeep.retrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by saikrishna.pawar on 03/05/16.
 */
public class LoginModel {
    public Response response;
    public int statuscode;
    public String statusMessage;
    public String successMessage;
    public String error[];
    public ErrorModel errorModel;

    /**
     * Inner class for LoginMpdel class
     */
    public class Response {
        @SerializedName("UserInfo")
        public UserInfo userInfo;
    }

    /**
     * Inner Class for LoginModel Class
     */
    public class UserInfo {
        public String id;
        public String authtoken;
        public String username;
    }
}

