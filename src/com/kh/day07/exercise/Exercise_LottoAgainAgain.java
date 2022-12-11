package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_LottoAgainAgain {
	public void lottoProgram() {
		int[] lottos = new int[6];
		Random rand = new Random();
		for (int i = 0; i < lottos.length; i++) {
			lottos[i] = rand.nextInt(45) + 1;
			for (int e = 0; e < i; e++) {
				if (lottos[i] == lottos[e]) {
					i--;
					break;
				}
			} // Áßº¹ ¾øÀÌ »ÌÀ½ èÇ
		}
		for (int i = 0; i < lottos.length - 1; i++) {
			for (int e = 0; e < lottos.length - i - 1; e++) {
				if (lottos[e] > lottos[e + 1]) {
					int temp = lottos[e + 1];
					lottos[e + 1] = lottos[e];
					lottos[e] = temp;
				}
			}
		}
		for (int i = 0; i < lottos.length; i++) {
			System.out.println(lottos[i] + " ");
		}
	}
}
