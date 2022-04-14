package com.example.viewpager.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpager.R;
import com.example.viewpager.adapter.PostAdapter;
import com.example.viewpager.adapter.UserAdapter;
import com.example.viewpager.model.Post;
import com.example.viewpager.model.User;

import java.util.ArrayList;


public class PageThridFragment extends Fragment {

    private RecyclerView recyclerView;
    private Context context;
    ArrayList<Post> posts= new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        recyclerView = view.findViewById(R.id.postrec);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));

        posts.add(new Post("New Post1", R.drawable.news1,"Lorem ipsum dolor, sit amet consectetur adipisicing elit. Mollitia, magnam?"));
        posts.add(new Post("New Post1", R.drawable.news2,"Lorem ipsum dolor, sit amet consectetur adipisicing elit. Mollitia, magnam?"));
        posts.add(new Post("New Post1", R.drawable.news3,"Lorem ipsum dolor, sit amet consectetur adipisicing elit. Mollitia, magnam?"));
        posts.add(new Post("New Post1", R.drawable.news1,"Lorem ipsum dolor, sit amet consectetur adipisicing elit. Mollitia, magnam?"));
        posts.add(new Post("New Post1", R.drawable.news2,"Lorem ipsum dolor, sit amet consectetur adipisicing elit. Mollitia, magnam?"));
        posts.add(new Post("New Post1", R.drawable.news3,"Lorem ipsum dolor, sit amet consectetur adipisicing elit. Mollitia, magnam?"));



        refreshAdapter(posts);
        return view;
    }

    void refreshAdapter(ArrayList<Post> posts){
        PostAdapter adapter = new PostAdapter(posts);
        recyclerView.setAdapter(adapter);
    }
}

