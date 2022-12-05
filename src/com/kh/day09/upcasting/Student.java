package com.kh.day09.upcasting;

public class Student extends Person {
	//처음에 오류Implicit super constructor어쩌고 나는건 밑에 기본생성자 앉거어줘서
    String grade;
    String department;
    
    public Student(String name) {
    	super(name);
    }
}
