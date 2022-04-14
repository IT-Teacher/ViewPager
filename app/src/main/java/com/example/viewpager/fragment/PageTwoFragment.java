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

import com.example.viewpager.MainActivity;
import com.example.viewpager.R;
import com.example.viewpager.adapter.UserAdapter;
import com.example.viewpager.model.User;

import java.util.ArrayList;


public class PageTwoFragment extends Fragment {
    private RecyclerView recyclerView;
    private Context context;
    ArrayList<User> users= new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        recyclerView = view.findViewById(R.id.userrec);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));

        users.add(new User("Aliyev Ali",R.drawable.img1));
        users.add(new User("Qodirova Ra'no",R.drawable.img2));
        users.add(new User("Toxirov Alisher",R.drawable.img3));
        users.add(new User("Azizov Salim",R.drawable.img4));
        users.add(new User("Komolov Umid",R.drawable.img5));
        users.add(new User("Usmonov Rustam",R.drawable.img6));
        users.add(new User("Zoitov Shavkat",R.drawable.img7));
        users.add(new User("Aliyeva Umida",R.drawable.img8));
        users.add(new User("Shokirova Xadicha",R.drawable.img9));
        users.add(new User("Jumayev Doniyor",R.drawable.img1));
        users.add(new User("Qodirova Ra'no",R.drawable.img2));
        users.add(new User("Toxirov Alisher",R.drawable.img3));
        users.add(new User("Azizov Salim",R.drawable.img4));


        refreshAdapter(users);
        return view;
    }

    void refreshAdapter(ArrayList<User> users){
        UserAdapter adapter = new UserAdapter(users);
        recyclerView.setAdapter(adapter);
    }
}

