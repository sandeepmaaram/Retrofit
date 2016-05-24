package com.sandeep.retrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sandeep on 24/5/16.
 */
public class LocationsModel {
    @SerializedName("geonames")
    public List<GeoNames> geoNamesList;
    public boolean status;
    public ErrorModel errorModel;
}
