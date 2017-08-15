package com.example.suhail.json101.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Suhail on 8/14/2017.
 */

public class response_handler {

    @SerializedName("result")
    @Expose
    private List<info> result = null;

    public List<info> getResult() {
        return result;
    }

    public void setResult(List<info> result) {
        this.result = result;
    }
}
