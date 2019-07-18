package com.bignerdranch.myowngank3.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil
{

    public static String getFormatTime(String time)
    {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            String time1=sdf.parse(time).toString();
            return time1;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}

