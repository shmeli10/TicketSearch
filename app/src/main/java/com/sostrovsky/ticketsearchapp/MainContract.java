package com.sostrovsky.ticketsearchapp;

/**
 * Author: Sergey Ostrovsky
 * Date: 18.08.20
 * Email: sergey.ostrovsky.it.dev@gmail.com
 */
public interface MainContract {
    interface View {
        void setDepartureDate(String date);
    }

    interface Presenter {
        void callInit();
    }
}
