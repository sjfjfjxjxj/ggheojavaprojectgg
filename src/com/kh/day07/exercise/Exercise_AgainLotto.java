package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_AgainLotto {
	public static void main(String [] args) {
		// 로또번호 자동생성기 프로그램 중복없이 추출하기 //중복을 학인하려면 계속 비교해야해
		// 단 결과는 오름차순으로 정렬
		// 번호 6개(->크기6인 배열), 번호 범위 1~45
		// 번호가 1부터 시작하는 로또번호
		int [] lottos = new int[6];
		Random rand = new Random();
		for(int i = 0; i<lottos.length; i++) { //여섯개 자리에 번호 뽑아서 넣어
			lottos[i] = rand.nextInt(45) + 1;
			for(int e = 0; e < i; e++) { //넣을때마다 중복인지 확인을 해야해. 첫번째애는 비교필요없어. 두번째애는 1번비교... 여섯번째애는 5번 비교
				if(lottos[i]==lottos[e]) {
					i--; //ex. 6번째 뽑았으면 5번째애랑, 4번째애랑 이렇게 비교
					break; //같은값 뽑았으면 빠져나가기
				}//이렇게 번호뽑기는 끝남. 이제 이걸
			}
		}//버블정렬로 오름차순 정리할거야. 양옆이랑 비교해서 순서바꾸는거
		for(int i = 0; i < lottos.length - 1; i++) {
			for(int e = 0; e < (lottos.length - 1)-i; e++) {
				if(lottos[e] > lottos [e + 1]) {
					int temp = lottos[e+1];
					lottos[e+1] = lottos[e];
					lottos[e] = temp;
				}
			}
		}
		
		//출력
		for (int i = 0; i <lottos.length; i++) {
			System.out.print(lottos[i]+" ");
	}
	}
}
