package com.kh.day04.random;

import java.util.Random;

public class Exam_Random {
    public static void main(String[] args) {
    	Random rand = new Random();
    	for(int i = 0; i <50; i++) {
    		System.out.println(rand.nextInt(10)+1);
    	//nextInt(10)->10 �̸�(0~9)�� ������ ���ڰ� 50�� �ݺ��� 
        //nextInt(10)+1> 1~10������ ����!
        //nextInt(n) -> 0���� n-1������ ������ �� ����!
    	//1���� 10������ �� �߿� ������ ���� �̰������
    	//nextInt(n)+1, �� +1�� ���� ����!
    	//ex. 20���� 35 ������ �� �߿� �����̱�: nextInt(16)+20??? �³�
    	//ex2. 10���� 23 ���� �����̱�: nextInt(14)+10
    	}//1~45 : 45+1
    }
}
