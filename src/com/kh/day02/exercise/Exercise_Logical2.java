package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
    public static void main(String[] args) {
    	//�Է¹��� ���ڰ� �빮������ �ҹ������� ����
    	Scanner sc = new Scanner(System.in);
    	System.out.print("���ڸ� �Է��� �ּ��� : ");
    	char word = sc.next().charAt(0);
    	boolean result = (word >= 65) && (word <= 90);
    	System.out.println("�빮���Դϱ� : "+ result); 
  
    	
    }
}
