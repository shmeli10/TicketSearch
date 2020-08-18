package com.sostrovsky.ticketsearchapp;

import com.sostrovsky.ticketsearchapp.departure_date.DepartureDate;
import com.sostrovsky.ticketsearchapp.departure_date.EnDepartureDate;

/**
 * Author: Sergey Ostrovsky
 * Date: 18.08.20
 * Email: sergey.ostrovsky.it.dev@gmail.com
 */
public class MainPresenter implements MainContract.Presenter {
    private MainContract.View view;

    MainPresenter(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void callInit() {
        setCurrentDate();
    }

    private void setCurrentDate() {
        DepartureDate departure = new EnDepartureDate();
        // DepartureDate departure = new RuDepartureDate();
        view.setDepartureDate(departure.getCurrentDate());
    }
}
