package com.kh.day11.wrapperex;
//�ٽú���
public class Exam_BoxingUnBoxing {
    public static void main(String [] args) {
    	Integer num = Integer.valueOf(0); //�������� �ȵǰ� �������� ��ü �����ϴµ�
    	//Boxing���� ����! �ڵ�����!
    	Integer su = 100;
    	
    	int soo = num.intValue(); //�⺻������ �ٲٴ� �̰͵� ���ŷο�ϱ�
    	//UnBoxing���� �ڵ�!
    	soo = num;
    	
    	int n = 10;
    	Integer intObject = n;
    	System.out.println("intObject : " + intObject); //�ڽ� ����! 10 ���
    	
    	int m = intObject + 10;
    	System.out.println("m = " + m); //��ڽ� ����! 20 ���
    	
    }
}
