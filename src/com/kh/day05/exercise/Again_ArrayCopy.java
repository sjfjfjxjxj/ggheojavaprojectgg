package com.kh.day05.exercise;
//���غ���̤�
import java.util.Scanner;

public class Again_ArrayCopy {
    public static void main(String [] args) {
    	/*
		 * ����ڿ��� �ֹι�ȣ�� �Է� ���� �� ���� �ڸ� ���ĺ��� *�� ����Ǿ� ��µǵ��� ���α׷��� �ۼ��Ͻÿ� 210618-1124600 ->
		 * 210618-1****** 200518-3233920 -> 200518-3******		  
		 */
    	Scanner sc = new Scanner(System.in);
    	char [] origin = new char[14]; //orgin�̶�� �迭�� ���ڰ� �ִ� �� 14��¥��!
    	System.out.print("�ֹε�Ϲ�ȣ 14�ڸ�(-) �Է��ϼ� : ");
    	String memberNum = sc.next();
    	for(int i = 0; i < origin.length; i++) {
    		origin[i] = memberNum.charAt(i);  //14���� �Է� �� ����. �� ���� �����ϰ� 		
    	}  
    	char[] copy = new char[14]; // �����ؼ� ��ó���Ұž�
        for(int i = 0; i < origin.length; i++) {
    	    if( i < 8) {
    	    	copy[i] = origin[i];
    	    	
    	    } else {
    	    	copy[i] =  '*';
    	    }
    	    System.out.print(copy[i] + " ");
    	
        } 
}
}
