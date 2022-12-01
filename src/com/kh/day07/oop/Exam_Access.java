package com.kh.day07.oop;

class Sample{  //디폴트 클래스 하나 만드렀따!
	public int a;
	private int b;
	int c;
}
          //static: 공기같은 애.. 애초에 존재했던것처럼 클래스를 뉴 안붙이고 사용할수 있다
public class Exam_Access {
    public static void main(String [] args) {
    	Sample aClass = new Sample();
    	aClass.a = 10; //public이라서 접근가능.
    //	aClass.b = 10; //is not visible. private이라서
    	aClass.c = 10; // 접근가능. defaultfktj
    }
}
