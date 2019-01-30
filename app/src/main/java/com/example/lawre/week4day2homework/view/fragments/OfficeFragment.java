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
import com.example.lawre.week4day2homework.model.local.office.Office;

public class OfficeFragment extends Fragment implements OfficeFragmentContract
{
    ImageView imgOffice;
    EditText etAddress, etOwner, etSize, etPurpose;
    TextView tvAddress, tvOwner, tvSize, tvPurpose;
    Button btSubmit;

    OfficeFragmentPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.office_fragment,container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        presenter = new OfficeFragmentPresenter(this);
        etAddress = view.findViewById(R.id.etEnterOfficeAddress);
        etOwner = view.findViewById(R.id.etEnterOfficeOwner);
        etSize = view.findViewById(R.id.etEnterOfficeSize);
        etPurpose = view.findViewById(R.id.etEnterOfficePurpose);
        tvAddress = view.findViewById(R.id.tvDisplayHomeAddress);
        tvOwner = view.findViewById(R.id.tvDisplayHomeOwner);
        tvSize = view.findViewById(R.id.tvDisplayHomeSize);
        tvPurpose = view.findViewById(R.id.tvDisplayConstructionYear);
        btSubmit = view.findViewById(R.id.btSubmit);
        imgOffice = view.findViewById(R.id.imgOffice);
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
    public void passOffice(Office office)
    {
        tvAddress.setText(office.getAddress());
        tvOwner.setText(office.getOwner());
        tvSize.setText(office.getSize());
        tvPurpose.setText(office.getPurpose());
        Glide.with(imgOffice.getContext()).load(office.getImage()).into(imgOffice);
    }

    @Override
    public Office getOffice() {
        return new Office("http://www.vc-arch.com/images/gallery/commercial/xian/01-xian-riverside.jpg",etAddress.getText().toString(),etOwner.getText().toString(),etSize.getText().toString(),etPurpose.getText().toString());
    }
}
