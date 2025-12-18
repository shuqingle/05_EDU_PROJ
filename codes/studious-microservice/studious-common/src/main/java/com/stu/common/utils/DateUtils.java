package com.stu.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private final static String FORMAT_DAY_DATE_8 = "yyyyMMdd";

    public static String showToDayLenth8(){
        SimpleDateFormat format = new SimpleDateFormat(FORMAT_DAY_DATE_8);
        return format.format(new Date());
    }
}
