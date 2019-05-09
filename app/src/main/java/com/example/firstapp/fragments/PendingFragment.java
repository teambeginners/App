package com.example.firstapp.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.firstapp.activities.R;
import com.example.firstapp.adapters.PendingAdapter;
import com.example.firstapp.models.UsersModel;

import java.util.ArrayList;

public class PendingFragment extends Fragment {
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

        itemListCAt.add(new UsersModel(R.drawable.foodpanda,"Halim Khan", "Bought sn air-cooler from Daraz.com","Approved 4 days ago","Code: DHJFHl"));
        itemListCAt.add(new UsersModel(R.drawable.mylogo,"Uzzal Mia", "Bought a laptop from amazon.com","Approved 2 days ago","Code: KGRKF"));
        itemListCAt.add(new UsersModel(R.drawable.daraz,"Kawsar Ahmed", "Bought a smartphone from mobiledoken.com","Approved 5 days ago","Code: KLNGFNG"));
        itemListCAt.add(new UsersModel(R.drawable.swiggy,"Omar Faruk", "Bought  from Daraz.com","Approved 3 days ago","Code: FGN3FG"));
        itemListCAt.add(new UsersModel(R.drawable.fish,"Sijan Mahmud", "Bought A air-cooler from Daraz.com","Approved 2 days ago","Code: NFJ67"));
        itemListCAt.add(new UsersModel(R.drawable.fish,"Sobuj Khondokar", "Bought A air-cooler from Daraz.com","Approved 7 days ago","Code: FJKH42"));
        itemListCAt.add(new UsersModel(R.drawable.fish,"Mijanur Rahman", "Bought A air-cooler from Daraz.com","Approved 9 days ago","Code: FGJ43"));

        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new PendingAdapter(this,itemListCAt));
    }


}
