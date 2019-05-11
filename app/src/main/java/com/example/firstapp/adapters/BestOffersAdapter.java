package com.example.firstapp.adapters;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.firstapp.activities.OfferDetailsActivity;
import com.example.firstapp.activities.R;
import com.example.firstapp.models.BestItemModel;

import java.util.List;

/**
 * Created by csa on 3/3/2017.
 */

public class BestOffersAdapter extends RecyclerView.Adapter<BestOffersAdapter.MyHolder> {

    List<BestItemModel> recyclerdata;
    private Context mContext;


    public BestOffersAdapter(Context context, List<BestItemModel> recyclerdata) {
        this.mContext = context;
        this.recyclerdata = recyclerdata;

    }

    @Override
    public MyHolder onCreateViewHolder(final ViewGroup parent, int viewType) {

        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.best_model_item, parent, false);
        final MyHolder myHolder = new MyHolder(view);
        return myHolder;

    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

        BestItemModel dataModel = recyclerdata.get(position);
        holder.name.setText(dataModel.getTitle());
        holder.description.setText(dataModel.getDescription());
        holder.id.setText(dataModel.getId());
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = v.findViewById(R.id.proName);
                TextView textView1 = v.findViewById(R.id.bestOfferDetails);
                TextView textView2 = v.findViewById(R.id.offerCategory);

                String bestCat = textView2.getText().toString();

                String cname = textView.getText().toString();
                String details = textView1.getText().toString();
                Intent intent = new Intent(mContext, OfferDetailsActivity.class);

                intent.putExtra("cName", cname);
                intent.putExtra("bDetails", details);
                intent.putExtra("cate", bestCat);

                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return recyclerdata.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        TextView name, description, id;
        View mView;

        public MyHolder(View itemView) {
            super(itemView);
            mView = itemView;
            name = itemView.findViewById(R.id.proName);
            description = itemView.findViewById(R.id.offerCategory);
            id = itemView.findViewById(R.id.bestOfferDetails);


        }
    }

}