package com.kh.day10.interfaceex;

public interface PhoneInterface {
	//Illegal modifier for the interface field PhoneInterface.name; only public, static & final(변수사용x->재할당x) are permitted
	public String NAME = "";//(static final이 생략돼있음)
//	name = "Hello World"; 안됨. 상수값이라 바뀌지 않음
    public static final int TIME_OUT = 10000; //글씨가 기울어져있음=static이란 말
    public abstract void sendCall();
    public abstract void receiveCall(); //public이랑 abstract는 생략가능
    abstract void printLogo() ;
    void displayNumber();
    public default void showLogo() { //default method
    	//하위 호환성을 유지하고 인터페이스 보완을 위해 작성함
    	//이전 프로그램과의 호환성말야ㅇㅇ 몬가 안와닿
    	System.out.println("**LG**");
    }
}
