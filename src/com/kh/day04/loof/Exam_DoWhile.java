package com.kh.day04.loof;

import java.util.Scanner;

public class Exam_DoWhile { 
    public static void main(String[] args) {
    	//�Է��� ���� -1 �ɶ�����
    	Scanner sc = new Scanner(System.in);
    	int num = 0;
    	do {
    		System.out.print("���� �Է� : ");
    		num = sc.nextInt();   		
    	} while(num !=-1);
    }
}
