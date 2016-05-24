package com.sandeep.retrofit.model;

/**
 * Created by sandeep on 24/5/16.
 */
public class LoginRequest {
    public Request request;

    public class Request {
        public String login;
        public String password;
    }
}
