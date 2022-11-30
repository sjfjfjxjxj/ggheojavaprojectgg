package com.kh.day05.exercise;

public class GotIt_SortSelet {
    public static void main(String[] args) {
    	//선택정렬
    	//배열 전부 검색->최소값 골라서 자리바꿈->왼쪽부터 채움
    	//i=0; 배열안에서 제일 앞에 애(j=arrs[i+1])가 제일 작은 애 찾아서 자리바꿈
    	//i=1; 두번째 애가 제일 작은애 찾아서 자리바꿈(j=arrs[i+1])
    	//i=2; 세번째애
    	//i=3; 네번째애가
    	//{2,5,4,1,3}-첫번쨰결과{1,5,4,2,3}-{1,2,4,5,3}-{1,2,3,5,4}-4번째결과{1,2,3,4,5}
    	//
    	int [] arrs = {2, 5, 4, 1, 3};
    	int min;
    	for(int i = 0; i < arrs.length; i++) {
    		min = i; //제일 앞에값 i로 초기화
    		for(int j = i+1; j < arrs.length; j++ ) {
    			if(arrs[min] > arrs[j]) { //(배열속전부비교해서)min이라는 자리애가 다른 자리 애랑 
    				min = j; // j칸이 min으로 간다
    			}
    		}
    		int temp = arrs[min]; // 그래서 지금 min값인 좀전 j값을 temp로 저장을 하고
    		arrs[min] = arrs[i]; // 그 다음자리 애 값을 새로운 미니멈값으로 정한다(맨앞자리는 정해졌으니까)
    		arrs[i] = temp; // 그리고 자리 바꾸기!!! 알겟다ㅏㅏㅏㅏㅏㅏ
    	}
    	for(int i = 0; i < arrs.length; i++) {   //그래서 i0~i3 돌린 값을 차례대로 출력
    		System.out.println(arrs[i] + " ");
    	}
    }
}
