package com.kh.day09.exercise;
//이해 아직 못함 이해해야해
class SuperClass{
	void paint() {//ⓑ얘가 실행돼야하는데! --- ⓔ다시 이리로 와서
		draw();//ⓕ얘를 실행해야하는데 오버라이딩된 드로우를 찾아가야해
	}
	void draw() {//ⓘ 얘 실행 끝!
		System.out.println("Super Object"); //ⓔ다시 위로 올라와서 출력?
	}
}

class SubClass extends SuperClass{
	void paint() {//ⓒ오버라이딩! (paint()도 draw()도 자식클래스걸로 쓰게됨)
		super.paint();//ⓓ->부모클래스의 paint()를 호출
		super.draw();//ⓗ 얘 실행되려면 부모클래스로가서 
	}
	@Override
	void draw() {
		System.out.println("Sub Object");//ⓖ오버라이딩이 먼저다 = 출력 1
	}
}

public class Exercise_Overriding {
    public static void main(String [] args) {
    	SuperClass ex = new SubClass(); //SubClass타입의 객체 ex가 Superclass타입으로 변환=업캐스팅
    	//슈퍼클래스 멤버를 가지고있고 슈퍼클래스 객체로 취급
    	ex.paint();//ⓐ
    }
}

//출력결과
//Sub Object
//Super Object