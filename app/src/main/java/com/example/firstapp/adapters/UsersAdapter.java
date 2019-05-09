package com.example.firstapp.adapters;

        import android.support.annotation.NonNull;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.example.firstapp.activities.R;
        import com.example.firstapp.fragments.UsersFragment;
        import com.example.firstapp.models.UsersModel;
        import com.example.firstapp.models.UsersModel;

        import java.util.ArrayList;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.ViewHolder>{
    private UsersFragment mContext;
    private ArrayList<UsersModel> mlist;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public final View mView;
        public final TextView userName, userJoion, approved, pending;
        ImageView userImg;

        public ViewHolder(View view) {
            super(view);
            mView = view;

            pending = view.findViewById(R.id.pendingNo);
            approved = view.findViewById(R.id.approvedNO);
            userName = view.findViewById(R.id.usersName);
            userJoion = view.findViewById(R.id.usersJoined);
            userImg = view.findViewById(R.id.usersImg);

        }

    }


    public UsersAdapter(UsersFragment context, ArrayList<UsersModel> list) {
        mContext = context;
        mlist = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.users_model_item, parent, false);
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
        TextView name, join, approved, pending;

        UsersModel itemReciever;

        itemReciever = mlist.get(position);

        image1 = holder.userImg;
        name = holder.userName;
        join = holder.userJoion;
        approved = holder.approved;
        pending = holder.pending;



        image1.setImageResource(itemReciever.getImageView1());


        name.setText(itemReciever.getTextView1());
        join.setText(itemReciever.getTextView2());
        approved.setText(itemReciever.getApproved());
        pending.setText(itemReciever.getPending());
    }
    public UsersModel getValueAt(int position) {
        return mlist.get(position);
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }
}