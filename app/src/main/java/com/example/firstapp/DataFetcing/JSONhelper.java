package com.example.firstapp.DataFetcing;

import com.example.firstapp.models.BestItemModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by csa on 3/3/2017.
 */

public class JSONhelper {

    HttpURLConnection connection;
    List<BestItemModel> data;


    public List<BestItemModel> getdatafromurl(String url) {


        try {
            URL url1 = new URL(url);

            connection = (HttpURLConnection) url1.openConnection();
            connection.connect();
            InputStream inputStream = connection.getInputStream();

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            StringBuffer buffer = new StringBuffer();
            while ((line = reader.readLine()) != null) {

                buffer.append(line);
                String result = buffer.toString();
                JSONArray jsonArray = new JSONArray(result);
                data = new ArrayList<>();

                for (int i = 0; i < buffer.length(); i++) {

                    BestItemModel dataModel = new BestItemModel();
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    String name = jsonObject.getString("status");
                    String category = jsonObject.getString("slug");
                    //  int ids = Integer.parseInt(id);
                    dataModel.setId(category);
                    dataModel.setTitle(name);
                    String desciption = jsonObject.getString("format");

                    dataModel.setDescription(desciption);
                    data.add(dataModel);

                }


            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return data;
    }

}