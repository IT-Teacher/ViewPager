package com.example.viewpager.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpager.MainActivity;
import com.example.viewpager.R;
import com.example.viewpager.model.User;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    MainActivity activity;

    ArrayList<User> users;

    public UserAdapter( ArrayList<User> users) {
        this.activity = activity;
        this.users = users;
    }
    @Override
    public int getItemCount() {
        return users.size();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user_list,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        User user = users.get(position);

        if (holder instanceof UserViewHolder){

            ImageView icon = ((UserViewHolder) holder).icon;
            TextView username = ((UserViewHolder) holder).username;

            icon.setImageResource(user.img);
            username.setText(user.fullName);


        }
    }
    public class UserViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public TextView username;
        public ImageView icon;



        public UserViewHolder(View v) {
            super(v);
            this.view = v;

            icon = view.findViewById(R.id.iv_profile);
            username = view.findViewById(R.id.tv_fullname);

        }

    }
}

