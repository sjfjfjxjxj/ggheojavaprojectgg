package com.kh.day11.wrapperex;

public class Exam_Wrapper {
    public static void main(String[] args) {
    	int num = 0;
//    	Integer su = new Integer(0); ������ �̷��� ���
    	Integer su = Integer.valueOf(0);
    	System.out.println(Character.toLowerCase('A')); //���: a
    	char c1 = '4', c2 = 'F';
    	if(Character.isDigit(c1)) {//����ƽ �޼ҵ���̶� ��ü ���� ���ϰ� ����
    		System.out.println(c1+"�� ����");
    	}
    	if(Character.isAlphabetic(c2)) {
    		System.out.println(c2+"�� ������");
    	} 
    }
}
