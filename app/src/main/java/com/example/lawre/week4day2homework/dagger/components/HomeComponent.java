package com.example.lawre.week4day2homework.dagger.components;

import com.example.lawre.week4day2homework.dagger.modules.HomeModule;
import com.example.lawre.week4day2homework.model.local.home.Home;

import dagger.Component;

@Component(modules = HomeModule.class)
public interface HomeComponent
{
    Home gethome(String address, String owner, String size, String constructionYear);
}
