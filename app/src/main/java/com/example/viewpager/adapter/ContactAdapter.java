package com.example.viewpager.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpager.MainActivity;
import com.example.viewpager.R;
import com.example.viewpager.model.User;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    MainActivity activity;

    ArrayList<String> str;

    public ContactAdapter(ArrayList<String> str) {
        this.activity = activity;
        this.str = str;
    }
    @Override
    public int getItemCount() {
        return str.size();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        String s = str.get(position);

        if (holder instanceof ContactViewHolder){

            TextView username = ((ContactViewHolder) holder).s1;

            username.setText(s);


        }
    }
    public class ContactViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public TextView s1;
        public ImageView icon;



        public ContactViewHolder(View v) {
            super(v);
            this.view = v;


            s1 = view.findViewById(R.id.tv_fullname);

        }

    }
}

