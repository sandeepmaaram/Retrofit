package com.sandeep.retrofit.utils;

import com.sandeep.retrofit.model.ErrorModel;
import com.sandeep.retrofit.rest.ApiClient;

import java.io.IOException;
import java.lang.annotation.Annotation;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Response;

/**
 * Created by sandeep on 24/5/16.
 */
public class ErrorUtils {
    public static ErrorModel parseError(Response<?> response) {
        Converter<ResponseBody, ErrorModel> converter =
                ApiClient.getClient().responseBodyConverter(ErrorModel.class, new Annotation[0]);

        ErrorModel error;

        try {
            error = converter.convert(response.errorBody());
        } catch (IOException e) {
            return new ErrorModel();
        }

        return error;
    }
}
