package com.example.lawre.week4day2homework.view.fragments;

import com.example.lawre.week4day2homework.dagger.components.HomeComponent;

public class HomeFragmentPresenter {
    HomeFragmentContract homeFragmentContract;
    HomeComponent homeComponent;

    public HomeFragmentPresenter(HomeFragmentContract homeFragmentContract) {
        this.homeFragmentContract = homeFragmentContract;
        homeComponent = DaggerHomeComponent.builder().build();
    }

    public void getHome()
    {
        homeFragmentContract.passHome(homeFragmentContract.getHome());
    }
}
