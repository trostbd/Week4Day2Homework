package com.example.lawre.week4day2homework.view.fragments;

public class OfficeFragmentPresenter
{
    OfficeFragmentContract officeFragmentContract;

    public OfficeFragmentPresenter(OfficeFragmentContract officeFragmentContract) {
        this.officeFragmentContract = officeFragmentContract;
    }

    public void getOffice()
    {
        officeFragmentContract.passOffice(officeFragmentContract.getOffice());
    }
}
