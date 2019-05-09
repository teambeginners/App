package com.example.firstapp.adapters;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.firstapp.activities.OfferDetailsActivity;
import com.example.firstapp.activities.R;
import com.example.firstapp.models.BestItemModel;

import java.util.ArrayList;



public class BestOffersAdapter extends RecyclerView.Adapter<BestOffersAdapter.ViewHolder>{
    private Context mContext;
    private ArrayList<BestItemModel> mlist;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private View mView;
        private TextView name, cmpCat, cmpOffer, cdOffer;
        private ImageView imageView1;

        public ViewHolder(View view) {
            super(view);
            mView = view;



            name = view.findViewById(R.id.proName);
            cmpCat = view.findViewById(R.id.proCategory);
            cmpOffer = view.findViewById(R.id.offerDetails);
            cdOffer = view.findViewById(R.id.cdOffer);
            imageView1 = view.findViewById(R.id.proImage);

        }

    }


    public BestOffersAdapter(Context context, ArrayList<BestItemModel> list) {
        mContext = context;
        mlist = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.best_model_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = v.findViewById(R.id.proName);

                String cname = textView.getText().toString();
                Intent intent = new Intent(mContext, OfferDetailsActivity.class);

                intent.putExtra("cName", cname);

                mContext.startActivity(intent);
            }
        });
        ImageView image1;
        TextView text1, text2, text3, text4;

        BestItemModel itemReciever;

        itemReciever = mlist.get(position);

        image1 = holder.imageView1;
        text1 = holder.name;
        text2 = holder.cmpCat;
        text3 = holder.cmpOffer;
        text4 = holder.cdOffer;


        image1.setImageResource(itemReciever.getCompanyLogo());


        text1.setText(itemReciever.getCompanyName());
        text2.setText(itemReciever.getCompanyCat());
        text3.setText(itemReciever.getOfferShort());
        text4.setText(itemReciever.getCdOffer());
    }
    public BestItemModel getValueAt(int position) {
        return mlist.get(position);
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }
}