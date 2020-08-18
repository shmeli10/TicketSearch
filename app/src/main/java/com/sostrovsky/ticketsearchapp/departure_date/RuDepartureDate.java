package com.sostrovsky.ticketsearchapp.departure_date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: Sergey Ostrovsky
 * Date: 18.08.20
 * Email: sergey.ostrovsky.it.dev@gmail.com
 */
public class RuDepartureDate extends DepartureDate {
    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String getCurrentDate() {
        return dateFormat.format(new Date());
    }
}
