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
import com.example.viewpager.adapter.ContactAdapter;
import com.example.viewpager.adapter.UserAdapter;
import com.example.viewpager.model.User;

import java.util.ArrayList;


public class PageOneFragment extends Fragment {
    private RecyclerView recyclerView;
    private Context context;
    ArrayList<String> str= new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        recyclerView = view.findViewById(R.id.contactrec);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));

        str.add( "Salim");
        str.add( "Ali");
        str.add( "Davron");
        str.add( "Olim");
        str.add( "Qosim");
        str.add( "Diyor");
        str.add( "Bobur");

        refreshAdapter(str);
        return view;
    }

    void refreshAdapter(ArrayList<String> str){
        ContactAdapter adapter = new ContactAdapter(str);
        recyclerView.setAdapter(adapter);
    }
}

