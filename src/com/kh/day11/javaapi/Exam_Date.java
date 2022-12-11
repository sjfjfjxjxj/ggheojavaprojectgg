package com.kh.day11.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {
    public static void main(String [] args) {
    	Date date = new Date();
    	System.out.println(date); //�̻��·δ� ��� �ܱ��� : Wed Dec 07 12:29:57 KST 2022
        SimpleDateFormat trans = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); //2022.12.07 12:31:51 (ss:��)
        SimpleDateFormat trans2 = new SimpleDateFormat("yyyy.MM.dd HH:mm:SS"); //2022.12.07 12:33:533(SS:�и���)
        String transDate1 = trans.format(date);
        String transDate2 = trans2.format(date);
        System.out.println(transDate1);
        System.out.println(transDate2);
        //simpledateformat�� ���۸��ϸ� ��� ���� ���´�Ф�
        
        //getInstance ��ſ� �׷�����Ķ���� �����Ѵ�
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.getTime()); //�̰͵� ������
        String changed = trans2.format(calendar.getTime());
        System.out.println("changed : " + changed);
    }
}