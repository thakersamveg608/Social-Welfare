package com.hackstrangely.hackstrangely.hackstrangely.hackstrangely.hackstrangely.hackstrangely.helpinghand.register.api;


import com.hackstrangely.hackstrangely.hackstrangely.hackstrangely.hackstrangely.hackstrangely.helpinghand.helper.Urls;
import com.hackstrangely.hackstrangely.hackstrangely.hackstrangely.hackstrangely.hackstrangely.helpinghand.register.model.RegisterDataResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by samveg on 28/9/17.
 */

public interface RequestRegister {

    @FormUrlEncoded
    @POST(Urls.REQUEST_REGISTER)
    Call<RegisterDataResponse> getJSON(@Field("name") String name, @Field("mobile") String mobile, @Field("password") String password, @Field("username") String userName, @Field("aadhar") String aadhar);

}
