package com.example.lawre.week4day2homework.view.activities.mainactivity;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lawre.week4day2homework.R;
import com.example.lawre.week4day2homework.view.fragments.HomeFragment;
import com.example.lawre.week4day2homework.view.fragments.OfficeFragment;

public class MainActivity extends AppCompatActivity
{
    HomeFragment homeFragment;
    OfficeFragment officeFragment;
    FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homeFragment = new HomeFragment();
        officeFragment = new OfficeFragment();
        fm = getSupportFragmentManager();
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.btHome)
        {
            fm.beginTransaction().replace(R.id.frFragOne,homeFragment).addToBackStack("frag_one").commit();
        }
        else
        {
            fm.beginTransaction().replace(R.id.frFragOne,officeFragment).addToBackStack("frag_two").commit();
        }
    }
}
