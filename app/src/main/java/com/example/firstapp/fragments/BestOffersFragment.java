package com.example.firstapp.fragments;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.firstapp.activities.R;
import com.example.firstapp.adapters.BestOffersAdapter;
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

public class BestOffersFragment extends Fragment {
    RecyclerView recyclerView;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.best_recycle, container, false);
        recyclerView = rootView.findViewById(R.id.recyclerView1);
        new Urltask().execute("https://api.myjson.com/bins/xmfu2");
        return rootView;

    }


    public class Urltask extends AsyncTask<String, String, List<BestItemModel>> {


        @Override
        protected List<BestItemModel> doInBackground(String... params) {

            HttpURLConnection connection = null;
            BufferedReader reader = null;

            try {
                URL url = new URL(params[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                InputStream stream = connection.getInputStream();
                reader = new BufferedReader(new InputStreamReader(stream));
                StringBuffer buffer = new StringBuffer();

                String line = "";
                while ((line = reader.readLine()) != null) {
                    buffer.append(line);
                }

                String finalJson = buffer.toString();

                JSONObject parentObject = new JSONObject(finalJson);
                JSONArray parentArray = parentObject.getJSONArray("offers");

                List<BestItemModel> articleModelList = new ArrayList<>();


                for (int i = 0; i < parentArray.length(); i++) {
                    JSONObject finalObject = parentArray.getJSONObject(i);
                    BestItemModel articleModel = new BestItemModel();
                    articleModel.setTitle(finalObject.getString("title"));
                    articleModel.setDescription(finalObject.getString("category"));
                    articleModel.setThumb(finalObject.getString("thumbnail"));
                    // adding the final object in the list
                    articleModelList.add(articleModel);
                }
                return articleModelList;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            } finally {
                if (connection != null) {
                    connection.disconnect();
                }
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(List<BestItemModel> dataModels) {
            super.onPostExecute(dataModels);
            BestOffersAdapter recyclerviewAdapter = new BestOffersAdapter(getContext(), dataModels);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(recyclerviewAdapter);
        }


    }

}
