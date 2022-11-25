package com.kh.day02.variable;
             //표기규칙↓낙타표기법
public class TestVariable {
  public static void main(String[] args) {
	  //↓자료형+변수명+대입연산자+데이터;
	  int kh = 34; //변수를 쓰는 이유는 재사용성을 위해서
	  String msg = "Hello World"; //S는 또 대문자여야하네
	  int num; //←자료형+변수명: 변수의 선언
	  num = 100; //: 변수의 초기화
	  System.out.println("kh");
	  System.out.println(kh);
	  System.out.println(msg);
	  System.out.println(num);
	  num =101;
	  System.out.println(num);
	  num = num + 1;
	  System.out.println(num);
  }
}
