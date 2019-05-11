package com.example.firstapp.DataFetcing;


import android.os.AsyncTask;

import com.example.firstapp.models.BestItemModel;

import java.util.List;


public class Urltask extends AsyncTask<String, String, List<BestItemModel>> {


    @Override
    protected List<BestItemModel> doInBackground(String... params) {

        JSONhelper jsonhelper = new JSONhelper();
        List<BestItemModel> data = jsonhelper.getdatafromurl(params[0]);


        return data;
    }


}
