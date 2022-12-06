package com.kh.day10.interfaceex;
                         //↓extends 안됨
public class SamsungPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("뚜루루루루");
	}

	@Override
	public void receiveCall() {
		System.out.println("여보세요나야거기잘지내니");
	}

	@Override
	public void printLogo() {
        System.out.println("=======쌤쑹=======");		
	}

	@Override
	public void displayNumber() {
		System.out.println("내 휴대전화 정보 : xxx-xxxx-xxxx");
		
	}
	
	public void flash() {
		System.out.println("반짝반짝 불이 켜졌습니다.");
	}

}
