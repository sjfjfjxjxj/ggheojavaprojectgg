package com.kh.day10.musicinterface;

public class Musician {
	//Instrument ins = new Piano(); (o)
	public void playInstrument(Instrument instrument) {
		instrument.play(); //저 인터페이스의 플레이메소드 오버라이딩한 애들 한꺼번에 갖고와!! 훠우
	}
	
}
	
//    public void playInstrument(Piano piano) {
//    	piano.play();
//    }
//    public void playInstrument(Guitar guitar) { //위에거 오버로딩!
//    	guitar.play();
//    }
//    public void playInstrument(Drum drum) {
//    	drum.play();
//    } 객체마다 갖고와서 쓰면 넘 겹치니까 하나로 표현할거얌↑↑↑↑↑↑↑↑
