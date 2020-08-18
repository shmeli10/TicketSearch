package com.sostrovsky.ticketsearchapp.departure_date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: Sergey Ostrovsky
 * Date: 18.08.20
 * Email: sergey.ostrovsky.it.dev@gmail.com
 */
public abstract class DepartureDate {
    // DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

    public abstract String getCurrentDate();

//    public String getCurrentDate() {
//        return String.valueOf(new Date());
//    }
}
