package com.kh.day09.point;
//run
public class ColorPointEx {
    public static void main(String [] args) {
//    	ColorPoint cp = new ColorPoint();
    	//The constructor ColorPoint() is undefined: 기본생성자 없어
//    	cp.set(3, 4); //부모Point의 set()호출
//    	cp.setColor("red"); //자식 ColorPoint의 setColor()호출
//    	cp.showColorPoint(); //컬러와 좌표 출력
    	ColorPoint cp = new ColorPoint(5, 6, "blue");
    	//blue cannot be resolved to a variable-> 문자열로만들엉
    	cp.showColorPoint();//컬러와 좌표 출력
    }
}
