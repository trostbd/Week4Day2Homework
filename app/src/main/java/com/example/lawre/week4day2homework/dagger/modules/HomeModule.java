package com.example.lawre.week4day2homework.dagger.modules;

import android.view.View;

import com.example.lawre.week4day2homework.model.local.home.Home;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeModule
{
   @Provides
    public Home getHome(String address, String owner, String size, String constructionYear)
    {
        return new Home("",address,owner,size,constructionYear);
    }
}
