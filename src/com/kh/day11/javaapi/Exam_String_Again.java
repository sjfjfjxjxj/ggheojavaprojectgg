package com.kh.day11.javaapi;

public class Exam_String_Again {
    public static void main(String [] args) {
    	String msg = "Hello Java";
    	msg = new String("Hello J");
    	
    	String data1 = new String(" C#");
    	String data2 = new String(",C++ ");
    	
    	System.out.println(data1 + "�� ���̴� " + data1.length());
    	System.out.println(data2 + "�� ���̴� " + data2.length());
    	System.out.println("#�� �ִ°�? : " + data1.contains("#"));
    	
    	data1 = data1.concat(data2);
    	System.out.println(data1);
    	
    	data1 = data1.trim();
    	System.out.println(data1);
    	
    	data1 = data1.replace("C#", "JAVA");
    	System.out.println(data1);
    	
    	String [] words = data1.split(",");
    	for(int i = 0; i < words.length; i++) {
    		
    		System.out.println("�и��� ���ڿ� : " +i+ " : "+ words[i]);
    	}
    	data1 = data1.substring(0,5);
    	System.out.println(data1);
    	
    	char word = data1.charAt(0);
    	System.out.println(word);
    }
}
