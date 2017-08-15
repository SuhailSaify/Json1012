package com.example.suhail.json101.Rest;

import com.example.suhail.json101.Model.info;
import com.example.suhail.json101.Model.response_handler;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * Created by Suhail on 8/14/2017.
 */

public interface ApiInterface {


    @FormUrlEncoded
    @POST("/as9mobile/admin.php")
    Call<response_handler> getdata(@Field("operationid") int operationid);


}
