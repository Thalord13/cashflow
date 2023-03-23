package com.thonyindustry.tigom;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import io.reactivex.Observable;

public interface RegisterAPI {

//    @GET("posts")
//    Call<List<Post>> getPost();

    @POST("customers")
    @FormUrlEncoded
    Observable<ResponseBody> createUser(@Field("username") String username,
                                  @Field("password") String password,
                                  @Field("statusid") Integer statusid);

}
