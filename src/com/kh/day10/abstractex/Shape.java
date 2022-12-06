package com.kh.day10.abstractex;
//implement == 구현하다
//Line 클래스는 ⓐmust implement inherited abstract method Shape.draw() 
//ⓑclass에 abstract 붙이거나 해야 오류 안남
class Line extends Shape{ //얜 걍 오버라이딩 한 자식클래스일 뿐임. 추상클래스 아님. 그래서 객체 만들어도됨

	@Override
	public void draw() { 
		// TODO Auto-generated method stub
		
	}
	
}


public abstract class Shape { //추상메소드를 가진 클래스는 그냥 클래스면 안돼. 앱스트랙 꼮붙이기
    public Shape() {} //생성자
    public void paint() {} //일반 메소드
    abstract public void draw(); //추상 메소드
}
