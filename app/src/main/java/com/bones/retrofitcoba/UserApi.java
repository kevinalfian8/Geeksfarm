package com.bones.retrofitcoba;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by lenovo ip on 05/06/2017.
 */

public interface UserApi {
    @GET("/v2/59356ec91000008d163eeab8")
    Call<Users> getUsers();

    @GET("/v2/59356ec91000008d163eeab8{id}")
    Call<User> getUser(@Path("id") String user_id);
}
