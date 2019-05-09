package com.example.firstapp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.firstapp.activities.R;
import com.example.firstapp.models.CategoryModel;

import java.util.List;

public class CatRecyclerViewAdapter extends RecyclerView.Adapter<CatRecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<CategoryModel> mCompanies;

    public CatRecyclerViewAdapter(Context mContext, List<CategoryModel> companies) {
        this.mContext = mContext;
        this.mCompanies = companies;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;

        LayoutInflater mInflater = LayoutInflater.from(mContext);

        v = mInflater.inflate(R.layout.cat_cardview, viewGroup, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.mTitle.setText(mCompanies.get(i).getTitle());
        myViewHolder.companyImage.setImageResource(mCompanies.get(i).getThumvnail());

    }

    @Override
    public int getItemCount() {
        return mCompanies.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView mTitle;
        ImageView companyImage;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mTitle = itemView.findViewById(R.id.cmpName);
            companyImage = itemView.findViewById(R.id.cmpImg);


        }
    }
}
