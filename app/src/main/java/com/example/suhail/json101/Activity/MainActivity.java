
//Suhail Saifi 15/8/2017
package com.example.suhail.json101.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.suhail.json101.Adapter.MyAdapter;
import com.example.suhail.json101.Model.info;
import com.example.suhail.json101.Model.response_handler;
import com.example.suhail.json101.R;
import com.example.suhail.json101.Rest.ApiClient;
import com.example.suhail.json101.Rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        response_handler response_handlers;   //object of class response_handler to handle response



        //<!---------

        //setup recycler view

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //-----------!>




        final int id = 6;    //operation id post para


        //<------------------------------------

        //placing call and handling response

        ApiInterface apiservice = ApiClient.getClient().create(ApiInterface.class);

        Call<response_handler> call = apiservice.getdata(id);
        call.enqueue((new Callback<response_handler>() {


            @Override
            public void onResponse(Call<response_handler> call, Response<response_handler> response) {


                //<!--------------
                //Displaying response message code

                String message_code = response.message();
                Log.d("Connection Status", "Successful");
                Log.d("Response Code", message_code);
                Toast.makeText(MainActivity.this, message_code, Toast.LENGTH_SHORT).show();

                //--------------------!>>

                List<info> info_rec = response.body().getResult();

                //<!------------------------------------------
                //to avoid null point exception
                if (info_rec == null) {
                    Toast.makeText(MainActivity.this, "nothing received", Toast.LENGTH_SHORT).show();
                    Log.d("Resonse", "Nothing Received");
                    //-----------------------------------------------!>


                } else {
                    //<!-----------------------------------------------------------------------
                    //setting up recycler view adapter

                    Toast.makeText(MainActivity.this, "No of objects received : " + info_rec.size(), Toast.LENGTH_SHORT).show();

                    recyclerView.setAdapter(new MyAdapter(info_rec, R.layout.custom_rows, getApplicationContext()));

                    //--------------------------------------------------------------!>

                }


            }

            @Override
            public void onFailure(Call<response_handler> call, Throwable t) {

                //<!------------------------------------------------------
                     //notifying failed connection
                Toast.makeText(MainActivity.this, "failed because " + t.getCause(), Toast.LENGTH_LONG).show();
                Log.d("Connection Status", "Failed");
                Log.d("Cause", t.getCause().toString());

                //------------------------------------------------------------!>

            }
        }));


    }

    //oncreate ends here
    //---------------------------------!>

}