package com.kh.day05.array;

public class Exam_Array {
    public static void main(String[] args) {
    	int num = 0;
    	//선언, 할당, 초기화
    	int [] nums = new int[10]; //배열 nums라는 애를 new를 붙여서 10개짜리로 할당
        System.out.println(nums[0]); //인덱스값은 0부터 9까지
    	nums[0] = 10;
    	nums[1] = 20;
    	nums[2] = 30;
    	System.out.println("첫번째 값 : " + nums[0]); 
    	System.out.println("두번째 값 : " + nums[1]);
    	System.out.println("세번째 값 : " + nums[2]);
    	System.out.println("배열의 크기 : " + nums.length);
    	
    //	for(int i = 0; i < nums.length; i++) {
    //		System.out.print(nums[i]); //전체가 출력된당
    //	}
    	
    	for(int i = 0; i < nums.length; i++) {
    		nums[i] = 100;
    		System.out.print(nums[i]);
    	}
   
    }
}
