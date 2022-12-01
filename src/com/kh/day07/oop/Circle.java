package com.kh.day07.oop;

public class Circle {//클래스 선언(class Circle), 클래스 접근 권한 public
   public int radius;//전역변수=클래스변수 //접근지정자 public
   public String name = "원" ;//이 영역을 써클 클래스의 필드라고 함

   //↓클래스명이랑 이름 같은 메소드=생성자
   //객체를 생성하고 필드를 초기화함
   public Circle() {//필드를 초기화하는 역할. 생략 가능. 접근지정자 public
	   this.radius = 1;//초기화 원래 이렇게 해야하는데
	   //this.name = "원";  <-사람들이 귀찮아해서 저 위쪽에 초기화 해도 되게끔 바뀜
   }   //↓반환형이 있는 메소드(반환값有=return)
   public double getArea() {//리턴타입이 더블이다! 보이드가 아니다->반환형return 있어야한다
	   return 3.14*radius*radius; //3.14곱한 값일거니까 double형
       //double area = 3.14*radius*radius;
	   //return area; 이거 두줄을 저 한줄에 쓰는겨(변수 써줬냐 차이)
   }
}


