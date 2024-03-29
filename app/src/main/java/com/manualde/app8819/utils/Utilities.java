package com.manualde.app8819.utils;

import android.webkit.URLUtil;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Utilities {
    public static final int SPLASH_CODE = 1;
    public static final int LOGIN_CODE = 2;
    public static final int REGISTER_CODE = 3;
    public static final int DIRECT_CODE = 4;
    public static final int FILTER_CODE = 5;
    public static final int NEW_EMPLOYEE = 6;
    public static final int REMOVE_REQUEST = 7;
    public static final int CAMERA_CODE = 8;
    public static final int EXTERNAL_STORAGE_REQUEST_CODE = 10;

    public static boolean validMail(String mail) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(mail).matches();
    }

    public static boolean validURL(String url) {
        return URLUtil.isValidUrl(url);
    }

    public static Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }

    public static String toNameFormat(String word) {
        if (word.isEmpty())
            return "";
        String[] words = word.split(" ");
        StringBuilder str = new StringBuilder();
        for (String w : words) {
            String s1 = w.substring(0, 1).toUpperCase();
            w = s1 + w.substring(1);
            str.append(" ");
            str.append(w);
        }
        String ret = str.toString();
        return ret.trim();
    }
}
