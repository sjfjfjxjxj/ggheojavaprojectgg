package com.kh.day09.point;



public class ColorPoint extends Point{
	private String color; //점 색
	
	//기본생성자
	public ColorPoint() {} //이거 없으면 ColorPoint cp = new ColorPoint();에 오류뜸!!
	
	//매개변수 생성자
	public ColorPoint(int x, int y, String color) {
		super(x,y); //x, y 셋팅
		//Point의 생성자 Point(x,y) 호출
		this.color = color;
	}
	
//	public void setColor(String color) {
//		this.color = color;
//	}
	public void showColorPoint() { //색, 좌표 출력
		System.out.println(color);
		showPoint();//Point 클래스의 showPoint() 호출
		
	}

}
