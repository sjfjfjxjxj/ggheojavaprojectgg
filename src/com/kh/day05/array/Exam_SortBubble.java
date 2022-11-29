package com.kh.day05.array;

public class Exam_SortBubble {
    public static void main(String[] args) {
    	//정렬 알고리즘 3. 버블정렬
    	//인접한 두개의 원소를 검사하여 정렬
    	//구현 쉬움. 이미 정렬된 데이터를 정렬할떄 가장 빠름
    	//다른 정렬에 비해 정렬 속도가 느리고 역순으로 정렬할때 가장 느림
    	//{2, 5, 4, 1, 3} ---- 5개짜리 배열일때
    	// i = 0일때 ---- 네번 비교 ----끝나면 5(맨오른쪽) 고정
    	// '2,5'4,1,3 -> 2,'4,5',1,3 -> 2,4,'1,5,3 -> 2,4,1,'3,5'
    	// i = 1일때 ---- 세번 비교 ----끝나면 4,5(오른쪽에서 두개) 고정
    	// '2,4',1,3,5 ->  2,'1,4',3,5 -> 2,1,'3,4',5
    	// i = 2일때 ---- 두번 비교
    	// '1,2',3,4,5 -> 1,'2,3',4,5
    	// i = 3일때 ---- 한번 비교 ~끝~
        int [] arrs = {2, 5, 4, 1, 3};
//        for(int i = 0; i < arrs.length-1; i++) {
//        	for(int j = arrs.length-1; j>=1; j--) { //이렇게 시작하면 맨 오른쪾부터 
//        		if(arrs[j-1] > arrs[j]) {           //비교 시작해서 애초에 잘못된것
//        			int temp = arrs[j];
//        			arrs[j] = arrs[j-1];
//        			arrs[j-1] = temp;
//        		}
//        	}
//        }
        for(int i = 0; i < arrs.length-1; i++) {
        	for(int j = 0; j < (arrs.length-1)-i; j++) {
        		if(arrs[j]>arrs[j+1]) {
        			int temp = arrs[j+1];
        			arrs[j+1] = arrs[j];
        			arrs[j] = temp;
        		}
        	}
        }
        for(int i = 0; i < arrs.length; i++) {
        	System.out.print(arrs[i] + " ");
        }
    }
}
