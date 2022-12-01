package com.kh.day07.oop;

public class Rectangle { //클래스선언, 접근지정자: public
	//이부분이 필드
    public int width; //너비, 접근지정자: public
    public int height;  //높이, 접근지정자: public
    
    //생성자의 역할: 객체 생성, 객체 초기화(필드초기화)
    //이거는 메소드
    public Rectangle() {} //생성자. 생락가능., 접근지정자: public, 반환형 없음!
   
          //매개변수 있는 생성자(=전달값을 받을 수 있는 생성자)
        public Rectangle(int width, int height) {
        	this.width = width;
        	this.height = height;   //(이건 rectRun클래스)
        }
    
          //반환형이 있는 메소드
        public int getArea() {
    	int area = width*height;
    	return area; //getArea를 호출한 곳으로 보낸다!
    }  //(이건 run 클래스)
    
    
}
