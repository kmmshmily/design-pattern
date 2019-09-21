package com.kmmshmily.datetest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: design-pattern
 * @description: 时间测试
 * @author: kmmshmily--cuiyong
 * @date: 2019-09-19 20:53
 **/

public class KmmshmilyTest {
    public static void main(String[] args)throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        /*Date date = new Date();
        System.out.println(sdf.format(date));*/
        String str = "2019-09-19 20:56:15";
        Date date = paseDate(str, "yyyy-MM-dd HH:mm:ss");
        System.out.println(date);
        System.out.println(sdf.format(date));
    }
    public static Date paseDate(String str, String pattern)throws Exception{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.parse(str);
    }
}   
