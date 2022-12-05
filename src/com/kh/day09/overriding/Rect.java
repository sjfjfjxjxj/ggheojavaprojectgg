package com.kh.day09.overriding;

public class Rect extends Shape {
    //가만있을때 얘 호출하면 셰이프 출력되는데
	//오버라이딩 하면 동적 바인딩 발생!
	public void draw() {
		System.out.println("Rect");
	}
}
