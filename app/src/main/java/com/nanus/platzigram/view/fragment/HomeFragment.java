package com.nanus.platzigram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nanus.platzigram.R;
import com.nanus.platzigram.adapter.PictureAdapterRecyclerView;
import com.nanus.platzigram.model.Picture;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    private static final String HOME = "Home";

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //Don't show the title.
        showToolbar(getResources().getString(R.string.tab_home), false, view);
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureRecycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        picturesRecycler.setLayoutManager(linearLayoutManager);
        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buildPictures(), R.layout.cardview_picture, getActivity());
        picturesRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;
    }

    public List<Picture> buildPictures() {
        List<Picture> pictures = new ArrayList<>();
        String pictureImage = "http://www.novalandtours.com/images/guide/guilin.jpg";
        pictures.add(new Picture(pictureImage, "Uriel Ramirez", "4 dias", "5 Me gusta"));
        pictures.add(new Picture(pictureImage, "Aldo Balderrama", "3 dias", "25 Me gusta"));
        pictures.add(new Picture(pictureImage, "Oscar Vaca", "4 dias", "85 Me gusta"));
        pictures.add(new Picture(pictureImage, "Oscar Vaca", "4 dias", "85 Me gusta"));
        pictures.add(new Picture(pictureImage, "Oscar Vaca", "4 dias", "85 Me gusta"));
        pictures.add(new Picture(pictureImage, "Oscar Vaca", "4 dias", "85 Me gusta"));
        pictures.add(new Picture(pictureImage, "Oscar Vaca", "4 dias", "85 Me gusta"));

        return pictures;
    }

    public void showToolbar(final String title, final boolean upButton, View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(title);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }


}
