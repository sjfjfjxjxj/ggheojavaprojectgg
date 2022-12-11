package com.kh.day11.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {
    public static void main(String [] args) {
    	Date date = new Date();
    	System.out.println(date); //이상태로는 출력 외국식 : Wed Dec 07 12:29:57 KST 2022
        SimpleDateFormat trans = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); //2022.12.07 12:31:51 (ss:초)
        SimpleDateFormat trans2 = new SimpleDateFormat("yyyy.MM.dd HH:mm:SS"); //2022.12.07 12:33:533(SS:밀리초)
        String transDate1 = trans.format(date);
        String transDate2 = trans2.format(date);
        System.out.println(transDate1);
        System.out.println(transDate2);
        //simpledateformat은 구글링하면 방법 많이 나온대ㅠㅠ
        
        //getInstance 대신에 그레고리안캘린더 권장한대
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.getTime()); //이것도 포맷혀
        String changed = trans2.format(calendar.getTime());
        System.out.println("changed : " + changed);
    }
}