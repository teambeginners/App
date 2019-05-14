package com.example.firstapp.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.firstapp.DataFetcing.Urltask;
import com.example.firstapp.activities.R;
import com.example.firstapp.adapters.BestOffersAdapter;
import com.example.firstapp.models.BestItemModel;

import java.util.List;

public class BestOffersFragment extends Fragment {
    RecyclerView recyclerView;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.best_recycle, container, false);
        recyclerView = rootView.findViewById(R.id.recyclerView1);
        new Viewdata().execute("https://api.myjson.com/bins/xmfu2");
        return rootView;

    }

    private class Viewdata extends Urltask {



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
