package com.kh.day04.loof;
//구구단 2단부터 9단까지 쭉 출력
public class Exam_ForDouble {
	public static void main(String[] args) {
		for (int j = 2; j < 10; j++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(j + " * " + i + " = " + j * i);
			}
		}
	}
}
