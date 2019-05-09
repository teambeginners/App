package com.example.firstapp.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.firstapp.activities.R;
import com.example.firstapp.fragments.PendingFragment;
import com.example.firstapp.models.UsersModel;

import java.util.ArrayList;

public class PendingAdapter extends RecyclerView.Adapter<PendingAdapter.ViewHolder>{
    private PendingFragment mContext;
    private ArrayList<UsersModel> mlist;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public final View mView;
        public final TextView userNameAp,buyProduct,codeUsed;
        public final Button approveBtn;
        ImageView userImgAp;

        public ViewHolder(View view) {
            super(view);
            mView = view;

            approveBtn = view.findViewById(R.id.approveBtn);
            codeUsed = view.findViewById(R.id.codeUsed);
            userNameAp = view.findViewById(R.id.usersNameAp);
            buyProduct = view.findViewById(R.id.boughtProduct);
            userImgAp = view.findViewById(R.id.usersImgAp);

        }

    }



    public PendingAdapter(PendingFragment context, ArrayList<UsersModel> list) {
        mContext = context;
        mlist = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pending_model_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "You clicked " + getValueAt(position), Toast.LENGTH_SHORT).show();
            }
        });
        ImageView image1;
        TextView userNameAp,buyProduct, codeUsed;
        Button approveBtn;

        UsersModel itemReciever;

        itemReciever = mlist.get(position);

        image1 = holder.userImgAp;
        userNameAp = holder.userNameAp;
        buyProduct = holder.buyProduct;
        codeUsed = holder.codeUsed;
        approveBtn= holder.approveBtn;



        image1.setImageResource(itemReciever.getImageView1());


        userNameAp.setText(itemReciever.getTextView1());
        buyProduct.setText(itemReciever.getTextView2());
        codeUsed.setText(itemReciever.getApproved());
    }
    public UsersModel getValueAt(int position) {
        return mlist.get(position);
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }
}