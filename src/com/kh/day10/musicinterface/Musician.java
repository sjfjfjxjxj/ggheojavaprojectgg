package com.kh.day10.musicinterface;

public class Musician {
	//Instrument ins = new Piano(); (o)
	public void playInstrument(Instrument instrument) {
		instrument.play(); //�� �������̽��� �÷��̸޼ҵ� �������̵��� �ֵ� �Ѳ����� �����!! �̿�
	}
	
}
	
//    public void playInstrument(Piano piano) {
//    	piano.play();
//    }
//    public void playInstrument(Guitar guitar) { //������ �����ε�!
//    	guitar.play();
//    }
//    public void playInstrument(Drum drum) {
//    	drum.play();
//    } ��ü���� ����ͼ� ���� �� ��ġ�ϱ� �ϳ��� ǥ���Ұž���������
