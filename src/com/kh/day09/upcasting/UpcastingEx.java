package com.kh.day09.upcasting;

public class UpcastingEx {
    public static void main(String [] args) {
    	Person p;
    	Student s = new Student("일용자");
//    	p = new Person(""); 이렇게 걍 객체생성 하는거 말고
    	p = s; //업캐스팅을 할거야.
    	
    	System.out.println(p.name);
    	
//    	System.out.println(p.grade);
//    	System.out.println(p.department); 자식클래스한테 있는 멤버라 오류나
    	//그래서 강제형변환 모양으로 '타입변환'을 해서
    	//다운캐스팅(모야 괄호를 몇개를 쓰는거야ㅠ)
    	System.out.println(((Student)p).grade);
    	System.out.println(((Student)p).department);
    }
}
