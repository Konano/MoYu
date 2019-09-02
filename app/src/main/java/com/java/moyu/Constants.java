package com.java.moyu;

import java.time.format.DateTimeFormatter;

public class Constants {

    public static final String DB_NAME = "Test_DB";
    public static final int DB_VERSION = 2;
    public static final DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static final String APIUrl = "https://api2.newsminer.net/svc/news/queryNewsList";
    public static final int PAGE_SIZE = 15;

}