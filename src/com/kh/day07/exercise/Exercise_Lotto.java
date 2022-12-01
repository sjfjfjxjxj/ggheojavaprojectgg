package com.kh.day07.exercise;

//개어려움(배열+랜덤+버블정렬+포문)
import java.util.Random;

public class Exercise_Lotto {
	public void lottoProgram() {
		// 로또번호 자동생성기 프로그램 중복없이 추출하기 //중복을 학인하려면 계속 비교해야해
		// 단 결과는 오름차순으로 정렬
		// 번호 6개(->크기6인 배열), 번호 범위 1~45
		// 번호가 1부터 시작하는 로또번호
		int[] lottos = new int[6];
		Random rand = new Random();
		for (int i = 0; i < lottos.length; i++) { // i=반복되는횟수=배열크기
			lottos[i] = rand.nextInt(45) + 1; // 로또=랜덤숫자를 배열에 하나씩 넣는다=번호뽑는다
			for (int e = 0; e < i; e++) {
				// 비교를 한다 -> 비교는 점점 많아짐(i가 커짐에따라). 뽑히는 숫자랑 계속 비교해야하니까
				if (lottos[i] == lottos[e]) { // 비교는 지금뽑은거랑 첫번째거부터한다
					i--; // 이것만 있으면 첫번째 값만 계속 뽑는다.
					break; // 같은 값 뽑았으면 뒤돌아가서 빠져나가기
				}
			}
		}
		// 이제 이걸 오름차순 정렬 한다(버블정렬이용)
		for (int i = 0; i < lottos.length - 1; i++) {
			for (int e = 0; e < (lottos.length - 1) - i; e++) {
				if (lottos[e] > lottos[e + 1]) {
					int temp = lottos[e + 1];
					lottos[e + 1] = lottos[e];
					lottos[e] = temp;
				}
			}
		}
		// 정렬한거 출력
		for (int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + " ");
		}
	}
}
