package com.example.firstapp.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.firstapp.activities.R;
import com.example.firstapp.adapters.CatRecyclerViewAdapter;
import com.example.firstapp.models.CategoryModel;

import java.util.ArrayList;

public class CatFragment extends Fragment {
    RecyclerView recyclerView;

    ArrayList<CategoryModel>catList;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.cat_child_layout, container, false);
        recyclerView = rootView.findViewById(R.id.cat_recycle);
        setupRecyclerView(recyclerView);
        return rootView;

    }

    private void setupRecyclerView(RecyclerView recyclerView){

        catList = new ArrayList<>();

        catList.add(new CategoryModel(R.drawable.foodpanda,"Food"));
        catList.add(new CategoryModel(R.drawable.mylogo,"Delivery"));
        catList.add(new CategoryModel(R.drawable.daraz,"Daraz.com"));
        catList.add(new CategoryModel(R.drawable.swiggy,"Swiggy"));
        catList.add(new CategoryModel(R.drawable.foodpanda,"HealthCart"));
        catList.add(new CategoryModel(R.drawable.swiggy,"Foodpanda"));
        catList.add(new CategoryModel(R.drawable.mylogo,"Foodpanda"));
        catList.add(new CategoryModel(R.drawable.foodpanda,"Food"));
        catList.add(new CategoryModel(R.drawable.mylogo,"Delivery"));
        catList.add(new CategoryModel(R.drawable.daraz,"Daraz.com"));
        catList.add(new CategoryModel(R.drawable.swiggy,"Swiggy"));
        catList.add(new CategoryModel(R.drawable.foodpanda,"HealthCart"));
        catList.add(new CategoryModel(R.drawable.swiggy,"Foodpanda"));
        catList.add(new CategoryModel(R.drawable.mylogo,"Foodpanda"));
        catList.add(new CategoryModel(R.drawable.foodpanda,"Food"));
        catList.add(new CategoryModel(R.drawable.mylogo,"Delivery"));
        catList.add(new CategoryModel(R.drawable.daraz,"Daraz.com"));
        catList.add(new CategoryModel(R.drawable.swiggy,"Swiggy"));
        catList.add(new CategoryModel(R.drawable.foodpanda,"HealthCart"));
        catList.add(new CategoryModel(R.drawable.swiggy,"Foodpanda"));
        catList.add(new CategoryModel(R.drawable.mylogo,"Foodpanda"));
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.setAdapter(new CatRecyclerViewAdapter(getContext(),catList));


    }
}
