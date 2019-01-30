package com.example.lawre.week4day2homework.view.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lawre.week4day2homework.R;
import com.example.lawre.week4day2homework.model.local.home.Home;

public class HomeFragment extends Fragment implements HomeFragmentContract
{
    ImageView imgHouse;
    EditText etAddress, etOwner, etSize, etConstructionYear;
    TextView tvAddress, tvOwner, tvSize, tvConstructionYear;
    Button btSubmit;
    HomeFragmentPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.house_fragment,container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        presenter = new HomeFragmentPresenter(this);
        etAddress = view.findViewById(R.id.etEnterHomeAddress);
        etOwner = view.findViewById(R.id.etEnterHomeOwner);
        etSize = view.findViewById(R.id.etEnterHomeSize);
        etConstructionYear = view.findViewById(R.id.etConstructionYear);
        tvAddress = view.findViewById(R.id.tvDisplayHomeAddress);
        tvOwner = view.findViewById(R.id.tvDisplayHomeOwner);
        tvSize = view.findViewById(R.id.tvDisplayHomeSize);
        tvConstructionYear = view.findViewById(R.id.tvDisplayConstructionYear);
        btSubmit = view.findViewById(R.id.btHomeSubmit);
        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.getHome();
            }
        });
        imgHouse = view.findViewById(R.id.imgHome);
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void passHome(Home home)
    {
        tvAddress.setText(home.getAddress());
        tvOwner.setText(home.getOwner());
        tvSize.setText(home.getSize());
        tvConstructionYear.setText(home.getConstructionYear());
    }

    @Override
    public Home getHome() {
        return new Home("https://www.ryanhomes.com/rh-community-gallery-NewAspectRatio/a5e1e7f9-6397-427f-a86c-4db46d1e9b4e/db/a5e1e7f9-6397-427f-a86c-4db46d1e9b4e.jpg",etAddress.getText().toString(),etOwner.getText().toString(),etSize.getText().toString(),etConstructionYear.getText().toString());
    }
}
