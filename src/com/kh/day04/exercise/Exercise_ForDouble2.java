package com.kh.day04.exercise;
//0��0�к��� 23�� 59�б��� ����ϱ�
//�̰� �� ���´٤Ф�
public class Exercise_ForDouble2 {
    public static void main(String[] args) {
    	int clock = 0;
    	int minute = 0;
    	for(clock = 0; clock < 24; clock++) {
    		for(minute = 0; minute < 60; minute++) {
    			//System.out.println(clock + " �� " + minute +" ��");
    			System.out.printf("%2d�� %2d��\n", clock, minute); //���ڸ����� �� �����ϰ� ����
    			//�����Ҷ� �� �Ⱦ�(css����)
    		}
    	}
    }
}
