package com.example.lawre.week4day2homework.view.fragments;

import com.example.lawre.week4day2homework.model.local.office.Office;

public interface OfficeFragmentContract
{
    void passOffice(Office office);

    Office getOffice();
}
