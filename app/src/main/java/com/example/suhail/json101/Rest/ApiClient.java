package com.example.suhail.json101.Rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Suhail on 8/14/2017.
 */

public class ApiClient {

    public static String base_url ="http://arraystack.com/as9mobile/"; // base url

    private static Retrofit retrofit = null;

    //<!----------------------------------------------
    //To create and return retrofit Instance

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(base_url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;

    }
 //----------------------------------------!>

}
