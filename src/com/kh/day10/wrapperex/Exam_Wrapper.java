package com.kh.day10.wrapperex;

public class Exam_Wrapper {
    public static void main(String [] args) {
    	//Wrapper객체로부터 기본 타입 값 알아내기
    	//Integer i = new Integer(1123); //클래스!
    	Integer i = Integer.valueOf(1123); // 객체 부르지않고 쓸수있는 스태틱메소드구나!
    	int e = i.intValue(); //객체 만들어서 사용하다가
    	//기본형으로도 변환 가능
    	Integer f = null;
    	//Type mismatch: cannot convert from null to int ↓
    	//int m = null;
    	
    	Character c = Character.valueOf('c'); //객체
    	char che = c.charValue(); //기본형
    	
    	Double d = Double.valueOf(3.14); //객체
    	double dd = d.doubleValue(); //기본형
    	
    	//뭄자열을 기본 데이터타입(int, boolean, double)으로 변환
    	int num = Integer.parseInt("123"); //계산하려고 굳이 바꿈
    	int result = num + 1; 
    	System.out.println("변환된 값 : "+num);
    	boolean isYn = Boolean.parseBoolean("true");
    	double fNum = Double.parseDouble("3.14");
    	
    	//기본 데이터타입(int, double, char)을 문자열로 변환
    	String data1 = Integer.toBinaryString(123);
    	String data2 = Integer.toHexString(123); // 16진수 7b로 변환
    	String data3 = Double.toString(3.14);
    	String data4 = Character.toString('a');
    	String data5 = Boolean.toString(true);
    }
}
