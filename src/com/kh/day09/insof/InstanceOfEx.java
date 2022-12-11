package com.kh.day09.insof;

public class InstanceOfEx {
	
	static void print(Person p) {
		//Person p = new Student();
//		if(p instanceof Person)
//		    System.out.println("Person입니다!");
		if(p instanceof Student)
			System.out.println("Student입니다!");
		if(p instanceof Researcher)
			System.out.println("Researcher입니다!");
		if(p instanceof Professor)
			System.out.println("Professor입니다!");
	}
	
	
    public static void main(String [] args) {
        //print메소드는 Person객체(혹은 이걸 상속받은 자식의 객체=업캐스팅)를 만나야 실행된다
    	print(new Person());
    	
    	//만약 Student 클래스가 Person 상속 안하면 밑에가 오류남.
    	//Person p = new Student();라는 뜻이니까.
    	print(new Student());
    	print(new Researcher());
    	print(new Professor());//Researcher 상속받았지만 그 위(Person) 자동상속
    }
}
