package com.kh.day09.overloading;

class Weapon{
	
	public Weapon() {} // 기본생성자
	public Weapon(int value) { //이것도 다 오버로딩
		System.out.println(value);
	}
	public Weapon(int value, String name) { //오버로딩!!
		System.out.println(value + ":" + name);
	}
	
	protected int fire() {
		return 1;
	}
	protected int fire(int steampack) { //오버로딩. 복붙을 자기자신한테. but 매개변수 바뀌어야
		return steampack*100;
	}
	protected int fire(int steampack, int medicine) { //오버로딩. 매개변수 개수 or 타입 다르게
		return steampack+medicine;	
	}	
	protected int fire(String steampack) { //오버로딩.
		System.out.println(steampack);
		return 1;
	}
}

class Cannon extends Weapon{
	protected int fire() {
		return 10;//오버라이딩ㅇㅇ 다른 클래스에선 복붙 가넝
	}
}

public class MethodOverloadingEx {
    public static void main(String [] args) {
    	System.out.println();
    	System.out.println("Hello World");
    	System.out.println(1);
    	System.out.println('h'); //println도 전부 오버로딩!! 
    }
}
