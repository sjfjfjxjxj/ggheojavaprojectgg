package com.kh.day05.array;

public class Exam_SortInsertion {
	public static void main(String[] args) {
		// 정렬 알고리즘
		// 1. 삽입정렬 Insertion(utube Insert-sort with Romanian folk dance 영상ㅋㅋ)
		// 2. 선택정렬 Select
		// 3. 버블정렬 Bubble
		// 삽입정렬이란: 정렬 알고리즘 중 가장 간단하고 기본
		// -배열의 n번 인덱스값을 0번에서 n-1번 인덱스까지 비교
		// {2, 5, 4, 1, 3}
		/*
		 * i = 0; 
		 * 2, 5, 4, 1, 3 // 1번째 결과값 (총 한번=맨앞에거 두개 비교) 
		 * i = 1 
		 * 2, 4, 5, 1, 3 
		 * 2, 4, 5, 1, 3 // 2번째 결과값(총 두번=두번째거 세번째거 비교한담에 다시 맨앞에비교) i = 2 2, 4, 1, 5, 3 2, 1,
		 * 4, 5, 3 1, 2, 4, 5, 3 // 3번째 결과값(총 세번=세번째거 네번째거 비교하고 두번째 세번째 비교...) i = 3 1,
		 * 2, 4, 3, 5 1, 2, 3, 4, 5 1, 2, 3, 4, 5 1, 2, 3, 4, 5 // 4번째 결과값(총 네번=네번째거
		 * 다섯번쨰거..... 맨 앞에거)
		 * 
		 */
		int[] arrs = { 2, 5, 4, 1, 3 };
		for (int i = 1; i < arrs.length; i++) {
			for (int j = 0; j < arrs.length-1; j++) { //결국 j < i로 해도 되는건가?! 안됨
				if (arrs[j] > arrs[j + 1]) {// -왼쪽 오른쪽 비교해서
					int temp = arrs[j]; // -왼쪽이 더 크면 돌기 시작해
					arrs[j] = arrs[j + 1]; // -근데 이제 순서는 왼쪽작 오른큰으로
					arrs[j + 1] = temp; // -재정렬 되는것ㅇㅇ 5개 숫자니까 4번=j 정렬된다(근데 이제
				}
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}

	}
}






