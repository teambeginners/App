package com.example.firstapp.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.firstapp.activities.R;
import com.example.firstapp.models.BestItemModel;
import com.example.firstapp.adapters.BestOffersAdapter;

import java.util.ArrayList;

public class BestOffersFragment extends Fragment {
    RecyclerView recyclerView;

    ArrayList<BestItemModel>itemList;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.best_recycle, container, false);
        recyclerView = rootView.findViewById(R.id.recyclerView1);
        setupRecyclerView(recyclerView);
        return rootView;

    }

    private void setupRecyclerView(RecyclerView recyclerView){

        itemList = new ArrayList<>();

        itemList.add(new BestItemModel(R.drawable.foodpanda,"Foodpanda", "Food Delivery ", "Mega Offer!! Upto 35% off in this Summer", "Upto 21% CD cashback!!"));
        itemList.add(new BestItemModel(R.drawable.mylogo,"Delivery Guru", "Delivers Anything", "The simplest way to get your goods", "Upto 21% CD cashback!!"));
        itemList.add(new BestItemModel(R.drawable.daraz,"Daraz.com", "Online Market", "We recommend you this.", "Upto 21% CD cashback!!"));
        itemList.add(new BestItemModel(R.drawable.swiggy,"Swiggy", "Food Delivery", "We recommend you this.", "Upto 21% CD cashback!!"));
        itemList.add(new BestItemModel(R.drawable.mylogo,"HealthCart", "Health & Beauty", "We recommend you this.", "Upto 21% CD cashback!!"));
        itemList.add(new BestItemModel(R.drawable.swiggy,"Foodpanda", "Food", "We recommend you this.", "Upto 21% CD cashback!!"));
        itemList.add(new BestItemModel(R.drawable.daraz,"Foodpanda", "Food", "We recommend you this.", "Upto 21% CD cashback!!"));

        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new BestOffersAdapter(getContext(),itemList));


    }
}
