package com.example.firstapp.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.firstapp.activities.R;
import com.example.firstapp.adapters.UsersAdapter;
import com.example.firstapp.models.UsersModel;

import java.util.ArrayList;

public class UsersFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<UsersModel> itemListCAt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.top_recycle, container, false);
        recyclerView = rootView.findViewById(R.id.recyclerView2);
        setupRecyclerView(recyclerView);
        return rootView;
    }

    private void setupRecyclerView(RecyclerView recyclerView){
        itemListCAt = new ArrayList<>();

        itemListCAt.add(new UsersModel(R.drawable.foodpanda,"Halim Khan", "Joined 2 years ago","4 approved","6 pending"));
        itemListCAt.add(new UsersModel(R.drawable.mylogo,"Uzzal Mia", "Joined 3 months ago","5 approved","2 pending"));
        itemListCAt.add(new UsersModel(R.drawable.daraz,"Kawsar Ahmed", "Joined 3 years ago","21 approved","6 pending"));
        itemListCAt.add(new UsersModel(R.drawable.swiggy,"Omar Faruk", "Joined 1 years ago","13 approved","6 pending"));
        itemListCAt.add(new UsersModel(R.drawable.fish,"Sijan Mahmud", "Joined 5 months ago","4 approved","6 pending"));
        itemListCAt.add(new UsersModel(R.drawable.fish,"Sobuj Khondokar", "Joined 26 days ago","2 approved","1 pending"));
        itemListCAt.add(new UsersModel(R.drawable.fish,"Mijanur Rahman", "Joined 2 years ago","23 approved","4 pending"));

        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new UsersAdapter(this,itemListCAt));
    }


}
