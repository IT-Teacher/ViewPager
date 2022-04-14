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
import com.example.viewpager.model.Post;
import com.example.viewpager.model.User;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    MainActivity activity;

    ArrayList<Post> posts;

    public PostAdapter(ArrayList<Post> posts) {
        this.activity = activity;
        this.posts = posts;
    }
    @Override
    public int getItemCount() {
        return posts.size();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post_list,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Post post = posts.get(position);

        if (holder instanceof PostViewHolder){

            ImageView icon = ((PostViewHolder) holder).icon;
            TextView title = ((PostViewHolder) holder).title;
            TextView desc = ((PostViewHolder) holder).desc;

            icon.setImageResource(post.img);
            title.setText(post.title);
            desc.setText(post.desc);


        }
    }
    public class PostViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public TextView title;
        public TextView desc;
        public ImageView icon;



        public PostViewHolder(View v) {
            super(v);
            this.view = v;

            icon = view.findViewById(R.id.iv_post);
            title = view.findViewById(R.id.tv_title);
            desc = view.findViewById(R.id.tv_desc);

        }

    }
}

