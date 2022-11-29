package com.kh.day05.array;

public class Exam_SortSelect {
    public static void main(String[] args) {
    	//알고리즘 정렬 2. 선택정렬
    	//배열을 전부 검색해 최소값을 고르고 자리바꿈-> 왼쪽부터 채워나가는 방식.
    	//특징: 데이터 양이 적을때는 성능 좋은데 데이터 양 많을땐 성능저하
    	// 배열의 n번째 인덱스값을 n+1번~마지막 인덱스까지 비교함
    	int [] arrs = {2, 5, 4, 1, 3};
    	int min; // 인덱스 값 저장 == 1(인덱스값: [3]
    	for(int i = 0; i < arrs.length; i++) {
    		min = i; //가장 작을 때 인덱스 값
    		for(int j = i+1; j < arrs.length; j++ ) {
    			if(arrs[min] > arrs[j]) {
    				min = j;
    			}
    		}
    		int temp = arrs[min];
    		arrs[min] = arrs[i]; //배열안에 모든거랑 비교해서 자리바꿈
    		arrs[i] = temp; // i=0일때, 첫번재 결과 1, 5, 4, 2, 3
    		//i=1일때, 두번째 결과 1, 2, 4, 5, 3
    		//i=2일때  세번째 결과 1, 2, 3, 5, 4
    		//i=3일때  네번째 결과 1, 2, 3, 4, 5
    	}
    	for(int i = 0; i < arrs.length; i++) {
    		System.out.print(arrs[i] + " ");
    	}
    }
}
