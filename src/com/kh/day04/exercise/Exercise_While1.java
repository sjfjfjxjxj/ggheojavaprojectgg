package com.kh.day04.exercise;
//While���� �̿��Ͽ� 1~100 ���� Ȧ���� ���� ���
public class Exercise_While1 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i < 100) {
    	    sum = sum + i;
    	   // i = i + 2;
    	    i += 2; //�����Ŷ� ����. ���մ��Կ�����. 
    	    //i = i * 2 -> i *= 2;
        }
        System.out.println("�հ� : " + sum);
    }
}
