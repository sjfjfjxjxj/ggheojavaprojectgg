package com.kh.day05.exercise;

public class X_GotIt_SortSelet {
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
    			if(arrs[min] > arrs[j]) { //(배열속전부비교해서)맨 앞에 애가 j자리애보다 크면
    				min = j; //맨앞에 애자리에 j를낑겨넣음
    			}
    		}
    		int temp = arrs[min]; //미니멈 값 확정됐으니까 시초값 안잃어버리게 temp에 저장
    		arrs[min] = arrs[i]; //그다음 자리 값을 다시 미니멈값 바꿈 
    		arrs[i] = temp; // 그리고 원래 i자리값에는 맨처음 temp를 넣음
    	}
    	for(int i = 0; i < arrs.length; i++) {   //그래서 i0~i3 돌린 값을 차례대로 출력
    		System.out.println(arrs[i] + " ");
    	}
    }
}
